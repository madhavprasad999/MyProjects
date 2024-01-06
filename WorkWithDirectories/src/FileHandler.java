import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHandler {
	File fileToWorkWith;
	AccessChecker ac;
	Boolean isFileCreated;
	Integer numberOfLines;
	Map<Integer, String> linesInFile;
	FileHandler(){
		ac=new AccessChecker(Cons.PATH);
		isFileCreated=false;
	}
	
	public Boolean createAFile(String fileName, String extension) {
		if(ac.isFile) {
			return false;
		}
		
		String fileToCreate=fileName+"."+extension;
		String fullPath=Cons.PATH+fileToCreate;
		
		fileToWorkWith=new File(fullPath);
		try {
			fileToWorkWith.createNewFile();
			isFileCreated=true;
		} catch (IOException e) {
			isFileCreated=false;
			e.printStackTrace();
		}
		return isFileCreated;
	}
	
	public void readFile() {
		linesInFile=new HashMap<Integer, String>();
		if(fileToWorkWith.canRead()) {
			try {
				Scanner sc=new Scanner(fileToWorkWith);
				numberOfLines=0;
				while(sc.hasNextLine()) {
					numberOfLines++;
					String line = sc.nextLine();
					linesInFile.put(numberOfLines, line);
				}
				sc.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void writeAtEndOffile(String lineToWrite, Boolean appendAtEnd) {
		try {
			FileWriter fw=new FileWriter(fileToWorkWith, appendAtEnd);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.newLine();
			bw.write(lineToWrite);
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printFile(){
		readFile();
		if(numberOfLines!=null) {
			for(Integer rowNum: linesInFile.keySet()) {
				String row=linesInFile.get(rowNum);
				System.out.println(rowNum + ": " +row);
			}
		}
	}
}
