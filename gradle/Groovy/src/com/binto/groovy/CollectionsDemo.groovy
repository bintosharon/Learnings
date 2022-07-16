package com.binto.groovy

l=[1,2,3]
println l.class  //class java.util.ArrayList

LinkedList l=[1,2,3]  //class java.util.LinkedList

println l.class

l<<4

println l

l=l+[5,6,7]

println l



println l-[3,5]

l.each{println it}

l.reverseEach{println it}

//l.eachPermutation{println it}

s=['java','js', 'python', 'js'] as Set

println s
println s.class

n=[courseName:'Gradle', rating:5, price:34]
println(n)
n.each{k,v -> 
	println k
	println v
}
println n.courseName
println n['courseName']
println n.get('courseName')
n.review="Its Awesome"
println n.get('review')
/*
 [1, 2, 3, 4]
[1, 2, 3, 4, 5, 6, 7]
[1, 2, 4, 6, 7]
1234567*/