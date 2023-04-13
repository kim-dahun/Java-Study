package edu.java.jdbc03;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;



public class JdbcMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			String sql = String.format("UPDATE %s SET %s = ?, %s = ?, %s = sysdate WHERE %s = ?", TBL_NAME,COL_TITLE,COL_CONTENT,COL_MODIFIED_TIME,COL_ID);
			
			stmt = conn.prepareStatement(sql);
			System.out.print("제목>>>");
			String title = scanner.nextLine();
			System.out.print("내용>>>");
			String content = scanner.nextLine();
			System.out.print("수정할 글 번호>>>");
			Integer id = Integer.parseInt(scanner.nextLine());
			
			stmt.setString(1, title);
			stmt.setString(2, content);
			stmt.setInt(3, id);
			
			// sql 문장 실행.
			int result = stmt.executeUpdate();
			
			System.out.println(result + " 개 행이 업데이트됐습니다.");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 사용했던 리소스들을 생성 순서의 반대로 해제.
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
