#!/usr/bin/env bash
thrift -gen java src/main/thrift/moradan.thrift
rm -rf src/main/java
mv gen-java src/main/java
