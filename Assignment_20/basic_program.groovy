package Assignment_20

//Closure based calculator

//def calculator(a,b,func) {
//	return func(a,b)
//}
//def add = {x,y -> x+y}
//def sub = {x,y -> x-y}
//def mul = {x,y -> x*y}
//
//println "Addition "+calculator(5,3,add)
//println "Subtraction "+calculator(5,3,sub)
//println "Multiplication "+calculator(5,3,mul)

//Word frequency counter

//def sentence = "hello string hello"
//def words = sentence.split()
//def fm = [:]   //frequencymap
//
//words.each{word -> fm[word] = fm.get(word,0)+1}
//fm.each{word,count -> println "$word : $count"}

//Group string by length

//def words = ["hi","hello","bye","good","sun"]
//def lengthmap = [:].withDefault{[]}
//
//words.each{word -> lengthmap[word.length()] << word}
//lengthmap.each{length,word1 -> println "$length : $word1"}