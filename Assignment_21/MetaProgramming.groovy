package Assignment_21

//Read and Write to a file in Groovy
//def file = new File("hello.txt")
//file.text = "Ashokkumar"
//println "Read from the file : "+file.text
//println file.absolutePath


// use try-catch-finally statement
//try {
//	a = 10/0
//	def file = new File("hi.txt").text
//}
//catch(ArithmeticException e){
//	println e.message
//}
//catch(FileNotFoundException e) {
//	println e.message +"File not found"
//}
//finally {
//	println "Exception Handled successfully"
//}

//MethoMissing
//class Groovy{
//	def methodMissing(String name,args) {
//		return "You can't access this method $name with the arguments $args"
//	}
//}
//def lan = new Groovy()
//println lan.product("soap")




//PropertyMissing
//class Groovy{
//	String name
//	def propertyMissing(String name) {
//		return "Undefined"
//	}
//}
//def lan = new Groovy()
//println lan.value


//MetaProgramming
//class Groovy{
//	String name
//	int value
//}
//def lan = new Groovy(name:"Box",value:30)
//println lan.name
//lan.metaClass.setProperty(lan,"name","Pen")
//println lan.name

