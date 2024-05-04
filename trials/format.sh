#!/usr/bin/env bash


copy.txts/^\w*(\|(\|\[\|)\|\]\|"//gc
copy.txts/^\w*(\[\|\])\|"//gc
copy.txts/\t/ : /gc
