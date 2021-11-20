#!/bin/bash

kubectl delete -f movies.yaml
kubectl delete -f movies-service.yaml
kubectl delete -f payment.yaml
kubectl delete -f payment-service.yaml
kubectl delete -f ticket.yaml
kubectl delete -f ticket-service.yaml
kubectl delete -f proxy.yaml
