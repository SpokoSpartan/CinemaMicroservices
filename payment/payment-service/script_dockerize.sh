#!/bin/bash

set -e

MVN_VERSION=$(mvn -q \
    -Dexec.executable=echo \
    -Dexec.args='${project.version}' \
    --non-recursive \
    exec:exec)

docker build -t spokospartan/payment:${MVN_VERSION} .
