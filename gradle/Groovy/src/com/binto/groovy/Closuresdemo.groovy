package com.binto.groovy

c= { n=2->  //default value
	println(n%2==0?"even":"odd")
}
c.call()

4.times{n-> println n}
4.times {println it}

/* even
0
1
2
3
0
1
2
3
*/