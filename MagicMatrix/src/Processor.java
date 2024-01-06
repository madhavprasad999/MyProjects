import java.util.ArrayList;

public class Processor {
	
	Processor(){
		Cons.matrix=new ArrayList<MatrixNode>();
		for(int i=0;i<Cons.SIZE;i++) {
			Cons.rowsSum[i]=0;
			Cons.columnsSum[i]=0;
			Cons.fDiagnol=0;
			Cons.rDiagnol=0;
		}
	}
	public void convertToMatrix(Integer[][] inputMatrix) {
		Integer rows=inputMatrix.length;
		for(int i=0;i<rows;i++) {
			Integer columns=inputMatrix[i].length;
			for(int j=0;j<columns;j++) {
				MatrixNode mn=new MatrixNode(i,j,inputMatrix[i][j]);
				Cons.rowsSum[i]+=inputMatrix[i][j];
				Cons.columnsSum[j]+=inputMatrix[i][j];
				if(i==j) {
					Cons.fDiagnol+=inputMatrix[i][j];
				}
				if((Cons.SIZE-i)==(Cons.SIZE-j)) {
					Cons.rDiagnol+=inputMatrix[i][j];
				}
				Cons.matrix.add(mn);
			}
		}
	}
	
	public void printOriginalMatrix() {
		for(MatrixNode mn: Cons.matrix) {
			System.out.println("["+mn.row+"]["+mn.column+"] >> "+mn.value);
		}
	}
	
	public Boolean validate() {
		if(Cons.rDiagnol != Cons.fDiagnol) return false;
		for(int i=0;i<Cons.SIZE;i++) {
			if(Cons.rowsSum[i] != Cons.fDiagnol) return false;
			if(Cons.columnsSum[i] != Cons.fDiagnol) return false;
		}
		return true;
	}
	
	
}
