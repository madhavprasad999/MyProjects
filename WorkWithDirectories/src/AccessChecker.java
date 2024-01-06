import java.io.File;

public class AccessChecker {
	String path;
	Boolean isValidPath;
	Boolean isFile;
	Boolean isDirectory;
	Boolean isValidDirectory;
	Boolean hasReadAccess;
	Boolean hasWriteAccess;
	Boolean isExecutable;
	
	File fileToCheck;
	
	AccessChecker(String path){
		this.path=path;
		fileToCheck=new File(path);
		verifyPath();
		if(isValidPath) {
			verifyFile();
			verifyAccess();
		}
	}
	
	void verifyPath(){
		isValidPath=fileToCheck.exists();
		if(!isValidPath) {
			isFile=false;
			hasReadAccess=false;
			hasWriteAccess=false;
			isExecutable=false;
		}
	}
	
	void verifyFile() {
		isFile=fileToCheck.isFile();
		setIsDirectory();
	}
	
	void setIsDirectory() {
		isDirectory = (isValidPath && !isFile);
	}
	
	void verifyAccess() {
		hasReadAccess=fileToCheck.canRead();
		hasWriteAccess=fileToCheck.canWrite();
		isExecutable=fileToCheck.canExecute();
	}
}
