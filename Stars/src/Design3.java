/*

1>>		*		     *		1+11+1
2>>		**		    **		2+9+2
3>>		***		   ***		3+7+3
4>>		****	  ****		4+5+4
5>>		*****	 *****		5+3+5
6>>		******	******		6+1+6 >> Max
7>>		*****	 *****		5+3+5
8>>		****	  ****		4+5+4
9>>		***		   ***		3+7+3
10>>	**		    **		2+9+2
11>>	*		     *		1+11+1

*/
public class Design3 implements Design{

	@Override
	public void output(Integer rows) {
		Integer rowsWithMaxSymbols=rows/2;
		if(rows%2==1) rowsWithMaxSymbols+=1;
		Integer totalLength=rowsWithMaxSymbols*2+1;
		
		//Increasing
		for(int i=1;i<=rowsWithMaxSymbols;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(Constants.SYMBOL);
			}
			Integer spaces=totalLength-(i*2);
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(Constants.SYMBOL);
			}
			System.out.println();
		}
		
		//Decreasing
		for(int i=rowsWithMaxSymbols-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(Constants.SYMBOL);
			}
			Integer spaces=totalLength-(i*2);
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(Constants.SYMBOL);
			}
			System.out.println();
		}
	}

}
