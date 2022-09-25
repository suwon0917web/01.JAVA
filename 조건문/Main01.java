package statement;

public class Main01 {
	public static boolean getTrue() {
		return true;
	}
	
	public static void main(String[] args) {
		int v = 100;
		boolean isTrue = !(v % 2 == 0);
		
		System.out.println( getTrue() );
		
		if(getTrue()) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}

	}

}
