import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String id = "scott";
	static final String pw = "tiger";
	
	private static void insertData() {
		Connection conn;
		PreparedStatement pstmt;
		String sql = "INSERT INTO EMP VALUES (?,?,?,?,?,?,?,?)";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1111);
			pstmt.setString(2, "JJang");
			pstmt.setString(3, "Teacher");
			pstmt.setInt(4, 1112);
			pstmt.setString(5, "2021-01-01");
			pstmt.setInt(6, 2134);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 40);
			int result = pstmt.executeUpdate();   // 몇개 행에 영향을 미쳤는지
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void getData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn =DriverManager.getConnection(url,id, pw);
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
		finally {
			try {
				if (conn!=null) conn.close();
				if (stmt!=null) stmt.close();
				if (rs!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
//	
	}
	
	public static void main(String[] args) {
		insertData();
		getData();

	}
}