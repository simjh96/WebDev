import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01 {
	static final String driver = "oracle.jdbc.OracleDriver";
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName(driver);
			conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott", "tiger");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM EMP");
			if (rs!=null) {
				System.out.println("질문 날리고 답변 받기 성공");
			}
			while(rs.next()) {
				String empno = rs.getString("EMPNO");
				System.out.println("empno:"+empno);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("db 에러");
		} 
//		finally {
//			if(rs!=null) rs.close();
//			if(stmt!=null) stmt.close();
//			if(conn!=null) conn.close();
//		}
	}
}