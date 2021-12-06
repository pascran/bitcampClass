package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	// 우리가 필요할 때마다 인스턴스를 만들어야 하기 때문에 메모리 문제가 생길 수 있다
	// 그래서 static을 써서 성능을 향상시키는 것이 낫다.
	public static Connection getConnection() throws SQLException {
		// String jdbcUrl = "jdbc:oracle:thin:@[주소]:[포트]:[데이터 베이스]";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		
		return DriverManager.getConnection(jdbcUrl, user, pw);
	}
}
