@echo off
javac -cp ../jars/junit.jar *.java
if not errorlevel 1 java -cp .;../jars/jnunit.jar junit.textui.TestRunner *Test
