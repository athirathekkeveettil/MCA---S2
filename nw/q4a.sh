#!/bin/bash
if [[ -e /athira/S2/nw/ ]]
then
	cat /athira/S2/nw/ | grep "^May"
else
	echo "File not found"
fi

