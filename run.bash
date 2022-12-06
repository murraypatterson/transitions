#!/bin/bash

echo
echo "running the three processes asynchronously.."
echo
javac RunTransitions.java
java RunTransitions

echo
echo "running the three processes synchronously.."
echo
javac RunSyncTransitions.java
java RunSyncTransitions

echo
