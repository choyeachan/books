#!/bin/sh
javac -cp "../jars/junit.jar" *.java
if [ $? -eq 0 ]; then
java -cp ".:../jars/junit.jar" junit.textui.TestRunner PawnTest
fi
