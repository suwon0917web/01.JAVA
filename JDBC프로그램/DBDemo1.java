package 데이터베이스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * JDBC 프로그래밍
 * 1. 자바 와 DB를 연결하는 구조를 생성해 주는 어뎁터를 설정(로드) - 외부  라이브러리 jdbc conector
 * 2. dB의 접속정보(주소, 아이디, 패스워드)를 이용해서 접속  - workbench
 * 3. sql 쿼리문 작성 - String
 * 4. 작성된 쿼리문을 db로 전송(명령) Statement객체
 * 5. 결과를 받아서 처리(출력) ResultSet 객체
 *
 */
public class DBDemo1 {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost/javabase?serverTimezone=Asia/Seoul";		
		Connection con = null;		
			try {
				//1.
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2			
				System.out.println("데이터 베이스 연결중");
				con = DriverManager.getConnection(url, "root", "admin1234");
				System.out.println("데이터 베이스 연결성공");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버를 찾지 못했습니다.");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연결 실패");
				e.printStackTrace();
			}		 
		return con;		
	}	
	public static void main(String[] args) {
		Connection con =  getConnection();
		// 필요한 로직
		// 사용이 끝나면 접속을 해제
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
