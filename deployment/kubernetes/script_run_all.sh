#!/bin/bash

set -e

MINIKUBE_RUNNING=$(docker ps -q --filter name=minikube)
if [[ ! -n ${MINIKUBE_RUNNING} ]]
then
  echo "Minikube is not running. Please execute 'minikube start'!"
  exit
fi

eval $(minikube docker-env) && \
  cd ../../ && \
  chmod u+x script_dockerize.sh && \
  ./script_dockerize.sh && \
  cd - && \
  chmod u+x script_apply_all.sh && \
  ./script_apply_all.sh


echo "Waiting for proxy to be accessible ..."
PROXY_IP_ADDR=""
while [ "${PROXY_IP_ADDR}" == "" ];
do
  PROXY_IP_ADDR=$(kubectl get ingress -o=jsonpath='{.items[*].status.loadBalancer.ingress[*].ip}')
  sleep 1
done

PROXY_HOSTS=$(kubectl get ingress -o=jsonpath='{.items[0].spec.rules[*].host}')
IFS=' ' read -r -a PROXY_HOSTS_ARRAY <<< ${PROXY_HOSTS}

for APP_HOST in "${PROXY_HOSTS_ARRAY[@]}"
do
  HOST_RULE="${PROXY_IP_ADDR} ${APP_HOST}"
  if ! grep -q "${HOST_RULE}" /etc/hosts
  then
    echo "Rule not found for host: ${APP_HOST}. Please add rule '${HOST_RULE}' to '/etc/hosts' to make sure you can access all services."
  fi
done
