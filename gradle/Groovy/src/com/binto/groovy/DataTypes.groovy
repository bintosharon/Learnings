package com.binto.groovy

float a = 10.24F

println a

println a.class

s= 'hello'
println s

name="binto"    //groovy string
s="hello ${name}"
println s

s= '''
All string here are
multi line strings
it is working
'''
println s


emailPattern=/([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})/

print "test@gmail.com"==~ emailPattern