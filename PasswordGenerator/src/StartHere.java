public class StartHere {
	public static void main(String[] args) {
		RandomPasswordGenerator rpg=new RandomPasswordGenerator();
		Integer lengthOfPassword=200;
		String randomPassword=rpg.getRandomPassword(lengthOfPassword);
		System.out.println(randomPassword);
		
	}
}
