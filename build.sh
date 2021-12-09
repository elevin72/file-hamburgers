#!/bin/bash
set -e
[ -d "build/" ] && rm -r build
javac src/*.java -d build
cd build
printf "\n===Running Program===\n\n"
java Main

