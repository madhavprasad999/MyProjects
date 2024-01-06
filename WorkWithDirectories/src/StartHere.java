
public class StartHere {

	public static void main(String[] args) {
		FileHandler fh=new FileHandler();
		fh.createAFile("test1", "txt");
		/*
		if(fh.isFileCreated) {
			System.out.println("Congratulations! The file is created.");
		}
		*/
		
		fh.readFile();
		
		System.out.println("Printing before Writing");
		fh.printFile();
		
		printBlankLines(3);
		fh.writeAtEndOffile("How?", true);
		
		System.out.println("Printing after Writing");
		fh.printFile();
	}
	
	static void printBlankLines(Integer numberOfLines){
		for(int i=0;i<numberOfLines;i++) {
			System.out.println();
		}
	}

}
