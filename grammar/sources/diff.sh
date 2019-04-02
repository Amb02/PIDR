#!/bin/bash

for f1 in $1
do
	for f2 in $1
	do
		echo "$f1"
		echo `diff $f1 $f2`
	done
done
