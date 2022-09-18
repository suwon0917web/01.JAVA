package datatype;
// 문자열 응용함수 StringBuffer
public class Datatype07 {

	public static void main(String[] args) {
		String str = "url:127.0.0.1:8080";
		String user = "admin";
		String psw = "0000";
		String result = str+" " +user + " " + psw;
		System.out.println(result);
		result =  "";
		result += str;
		result += " ";
		result += user;
		result += " ";
		result += psw;
		System.out.println(result);
		
		StringBuffer sb = new StringBuffer();
		result = sb.append(str)
				.append(" ")
				.append(user)
				.append(" ")
				.append(psw)
				.toString();
		
		System.out.println(sb.toString());
		sb.insert(1, "111111");
		System.out.println(sb.toString());		
		// 문자열은 한번 생성하면 변경할수 없다  - immutable
		// 변경가능한 문자열(mutable)로 만든다.. StringBuffer -- 
	}

}







