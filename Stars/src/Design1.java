
public class Design1 implements Design{

	@Override
	public void output(Integer rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(Constants.SYMBOL);
			System.out.println();
		}
	}

}
