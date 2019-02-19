#!/bin/sh
javac -cp "../jars/junit.jar" ./chess/*.java ./pieces/*.java
if [ $? -eq 0 ]; then
java -cp ".:../jars/junit.jar" junit.textui.TestRunner chess.AllTests
fi
