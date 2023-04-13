package edu.java.jdbc04;

import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.model.Blog.Entity.*;

public class JdbcMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 과제 JDBC delete:
		// delete from Blogs where ID = ?;
		// 커넥션 객체 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// 오라클 드라이버 실행 
			DriverManager.registerDriver(new OracleDriver());
			
			// 오라클 DB 접속
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			// sql 구문 작성
			String sql = String.format("DELETE FROM %s WHERE %s = ?", TBL_NAME,COL_ID);
			
			// stmt 객체 초기화
			stmt = conn.prepareStatement(sql);
			
			// 삭제할 열 입력받기
			System.out.print("몇 번 행을 삭제하시겠습니까?");
			Integer id = Integer.parseInt(scan.nextLine());
			
			// sql ? 구문에 원소 전달
			stmt.setInt(1, id);
			
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삭제되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
