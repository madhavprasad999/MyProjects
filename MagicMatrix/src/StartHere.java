
public class StartHere {
	public static void main(String[] args) {
		Integer size=Cons.SIZE;
		Integer[][] input=new Integer[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				input[i][j]=1;
			}
		}
		
		Processor p=new Processor();
		p.convertToMatrix(input);
		//p.printOriginalMatrix();
		Boolean isAllGood=p.validate();
		if(isAllGood) {
			System.out.println("Matrix is validated!!");
		}
		else {
			System.out.println("Matrix is INVALIDATED!!");
		}
	}
}
