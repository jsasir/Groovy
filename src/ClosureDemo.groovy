
class ClosureDemo {
	
	static void main(String[] args) {
	
			   def lst = [1,2,3,4];
			   lst.each {println it}
			   
			   println("The list will only display those numbers which are divisible by 2")
			   lst.collect{num -> if(num % 2 == 0) println num}
			}
		   }
	

//		def clos = {println "Hello World"};
//		println clos.getOwner()
//	    clos.call();
//
		
	