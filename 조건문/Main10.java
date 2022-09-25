package statement;

public class Main10 {

	public static void main(String[] args) {
		//  90이상이면 A
		// 80 ~ 89면 B 
		// swtich ~ case 
		int jumsu = 80;
		switch (jumsu) {
		case 80:	
			if(true) {
				System.out.println(0);
			}
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("B");		
			break;			
		case 90:			
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("A");
			break;
			
		default:
			break;
		}
	}

}
