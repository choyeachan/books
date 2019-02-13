@echo off
javac -cp ../jars/junit.jar *.java
if not errorlevel 1 java -cp .;../jars/junit.jar junit.textui.TestRunner AllTests
