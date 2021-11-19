#!/bin/bash

set -e

chmod u+x movies/movies-service/script_dockerize.sh
chmod u+x payment/payment-service/script_dockerize.sh
chmod u+x ticket/ticket-service/script_dockerize.sh

cd movies/movies-service/ && ./script_dockerize.sh
cd ../../
cd ticket/ticket-service/ && ./script_dockerize.sh
cd ../../
cd payment/payment-service/ && ./script_dockerize.sh
cd ../../
