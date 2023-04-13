package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;
import static edu.java.jdbc.oracle.OracleConnect.*;
import static edu.java.jdbc.model.Blog.Entity.*;

public class JdbcMain02 {

	public static void main(String[] args) {
		// DB 테이블에 Insert 하기 
		Scanner scan = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// 오라클 드라이버 등록
			DriverManager.registerDriver(new OracleDriver());
			
			// 오라클 DB에 접속.
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			// SQL 문장(Statement) 을 준비
			String sql = String.format("INSERT INTO %s (%s, %s, %s) VALUES (?, ?, ?)",
										TBL_NAME,COL_TITLE,COL_CONTENT,COL_AUTHOR);
			System.out.println(sql);
			
			// Statement 타입 객체를 생성
			stmt = conn.prepareStatement(sql);
			
			// 제목, 내용 입력받기
			System.out.print("제목>>>");
			String title = scan.nextLine();
			System.out.print("내용>>>");
			String content = scan.nextLine();
			
			// SQL 문장에서 ? 부분을 채움.
			stmt.setString(1, title);
			stmt.setString(2, content);
			stmt.setString(3, "김다훈");
			
			// SQL 문장 실행
			
			int result = stmt.executeUpdate();
			System.out.println(result + " 개 행이 삽입됐습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				stmt.close();
				
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		
		
	}

}
