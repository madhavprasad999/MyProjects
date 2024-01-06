
public class Design2 implements Design{

	@Override
	public void output(Integer rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) System.out.print(Constants.SYMBOL);
			System.out.println();
		}
	}

}
