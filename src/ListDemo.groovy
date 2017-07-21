
class ListDemo {

	static main(args) {
		
		def myList = [1,2,3,4]
		
		def nMyList = myList.collect {it * 2}
		println nMyList
	}

}
