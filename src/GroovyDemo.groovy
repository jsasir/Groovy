
class GroovyDemo {

    static main(args) {
    def a="Testing"
	def list = [3,5,2,4,8,3,9,5,6]
	def myMap = [
		'name': 'Asir',
		'slno': '12',
		'5': 'five',
		'5': 'five',
		'Address': '123 mains st'
		]
	
	println (myMap.values())
	
//	list.sort();
//	list.add(0, 999);
	
	println list
	println list.sort()
    println "Asir is $a"
	println Integer.MAX_VALUE  //2147483647
	println 3.equals(3)  //true
	println 3.power(3)   //27
	println Math.sqrt(25) //5.0
	
    }

}