#!/bin/bash

if [ $# -eq 0 ]; then
	echo "No arguments supplied"
	exit 1
fi

if [ $1 ]; then
	echo "$1"
fi

if [ $2 ]; then
	echo "$2"
fi

if [ $3 ]; then
	echo "$3"
fi