/**
 * 
 */
package Dao;

import java.sql.*;

/**
 * @author 308
 * 
 */
public class simpleDao {
	Connection con = null;
	Statement stat = null;
	ResultSet rs = null;

	public simpleDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager
					.getConnection("jdbc:oracle:thin:@115.156.249.113:1521:skmp",
							"system", "Admin123456");
			stat = con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			con = null;
		}
	}

	public ResultSet executeQuery(String sql) {
		try {
			rs = stat.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
			rs = null;
		}
		return rs;
	}
}
