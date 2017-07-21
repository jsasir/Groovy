
class FileIO {
	static void main(String[] args) {
		
		def myFile = new File("testFile.txt")
		myFile.eachLine { ln-> println("$ln") }  // To print the content of the file
		
		myFile.append("testaaaaaaaaaaaaaaaaaaaa")
		println myFile.text   // To print the content of the file
	}
}
