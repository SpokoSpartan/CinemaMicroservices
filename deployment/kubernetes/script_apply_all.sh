#!/bin/bash

kubectl apply -f movies.yaml
kubectl apply -f movies-service.yaml
kubectl apply -f payment.yaml
kubectl apply -f payment-service.yaml
kubectl apply -f ticket.yaml
kubectl apply -f ticket-service.yaml
kubectl apply -f proxy.yaml
