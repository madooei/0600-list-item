#!/usr/bin/env bash
# Compile all source into out/, then run the demos.
# With no argument, run both. With one argument (singly or doubly), run only
# that one, e.g.:
#   scripts/run.sh doubly
set -e
cd "$(dirname "$0")/.."
javac -d out $(find src/main -name "*.java")
if [ $# -eq 0 ]; then
  echo "=== singly ==="
  java -cp out singly.ListDemo
  echo
  echo "=== doubly ==="
  java -cp out doubly.ListDemo
else
  java -cp out "$1.ListDemo"
fi
