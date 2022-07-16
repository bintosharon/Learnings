package com.binto.groovy

int product( int x=3, int y)
{
	x*y
}

result= product 10,5
println result

void display(Map productdetails) {
	println productdetails.name
	println productdetails.price
}
display name:'Iphone', price:1000
display ([name:'Iphone', price:1000])