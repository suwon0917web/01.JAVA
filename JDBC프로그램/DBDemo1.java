package �����ͺ��̽�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * JDBC ���α׷���
 * 1. �ڹ� �� DB�� �����ϴ� ������ ������ �ִ� ��͸� ����(�ε�) - �ܺ�  ���̺귯�� jdbc conector
 * 2. dB�� ��������(�ּ�, ���̵�, �н�����)�� �̿��ؼ� ����  - workbench
 * 3. sql ������ �ۼ� - String
 * 4. �ۼ��� �������� db�� ����(���) Statement��ü
 * 5. ����� �޾Ƽ� ó��(���) ResultSet ��ü
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
				System.out.println("������ ���̽� ������");
				con = DriverManager.getConnection(url, "root", "admin1234");
				System.out.println("������ ���̽� ���Ἲ��");
			} catch (ClassNotFoundException e) {
				System.out.println("����̹��� ã�� ���߽��ϴ�.");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("������ ���̽� ���� ����");
				e.printStackTrace();
			}		 
		return con;		
	}	
	public static void main(String[] args) {
		Connection con =  getConnection();
		// �ʿ��� ����
		// ����� ������ ������ ����
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
