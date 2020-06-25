#!/bin/bash

# exit when any command fails
set -e

usage() {
  printf "Building module without build tools, just ./build.sh"
}

while [ "$1" != "" ]; do
    case $1 in
        --tag )              shift
                                  TAG=$1
                                  ;;
        -h | --help )             usage
                                  exit 1
    esac
    shift
done

rm -Rf target/*

# compiling sources
javac -d target/classes $(find src -name '*.java')

# creating modular jar
jar --create \
  --file target/helloworldmodule.jar --main-class org.github.pawelhenek.javaplayground.helloworldmodule.HelloModularWorld \
  -C target/classes .

# running modularized jar
java --module-path target/helloworldmodule.jar \
  --module org.github.pawelhenek.javaplayground.helloworldmodule