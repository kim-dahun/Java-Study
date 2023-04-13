package edu.java.jdbc01;

import java.sql.Connection;
// JDK 클래스, 인터페이스
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import edu.java.jdbc.model.Blog;

// Oracle Conncet InterFace에서 static 로 선언된 모든 상수 이름들을 임포트.
import static edu.java.jdbc.oracle.OracleConnect.*;
import static edu.java.jdbc.model.Blog.Entity.*;

// Oracle JDBC 라이브러리 클래스
import oracle.jdbc.OracleDriver;

/*
 * maven search 검색 후 사이트에서 ojdbc11 검색 - 들어가서 project_URL 클릭 - 21.9.0
 * 
 * JDBC(Java Database Connectivity):
 * 자바 프로그램에서 데이터 베이스를 연결하고, SQL 문장들을 실행하는 방법.
 * 
 * 1. Oracle JDBC 라이브러리 다운로드하고 자바 프로젝트에 라이브러리 포함.
 * 		(1) 라이브러리 다운로드
 * 		(2) 이클립스 프로젝트 폴더에 lib 폴더 생성
 * 		(3) 다운로드한 라이브러리 jar 파일을 lib 폴더에 복사
 * 		(4) jar 파일을 프로젝트에 빌드 패스(build path)에 추가.( add to build path )
 * 
 * 2. 오라클 데이터베이스 서버에 접속하기 위한 정보들(URL, USER ID, PASSWORD) 을 상수로 정의
 * 
 * 3. 프로그램에서 오라클 jdbc 라이브러리를 사용할 수 있도록 드라이버 등록(라이브러리를 메모리에 로딩)
 * 
 * 4. 데이터베이스 서버에 접속.
 * 
 * 5. Statement 타입 객체를 생성.
 * 	  - DB 서버에서 실행할 SQL 문장을 작성, 실행하는 객체.
 * 
 * 6. Statement 객체의 메서드를 사용해서 SQL 문장을 db 서버로 전송하고 그 결과를 처리.
 * 	  - executeQuery() : DQL(Data Query Language) SELECT 구문 사용.
 * 	  - executeUpdate() : DML. INSERT, UPDATE, DELETE 문장.
 * 
 * 7. 결과 처리 - 화면 출력.
 * 
 * 8. 사용했던 모든 Resource(Connection, Statement) 들을 해제(close).
 * 
 */

public class JdbcMain01 {

	public static void main(String[] args) {
		// 3. Oracle jdbc 드라이버(라이브러리) 등록
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			 
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("오라클 드라이버 등록 성공");
			// 4. DB 서버에 접속
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn =" + conn);
			
			// 5. statement 객체 생성
			String sql = "select * from blogs"; // JDBC에서 SQL 문장을 세미콜론을 사용하지 않음. 세미콜론(;)을 사용하지 않음!
			stmt = conn.prepareStatement(sql);
			System.out.println("stmt = " + stmt);
			
			// 6. Statement 객체의 메서드를 이용해 SQL 서버로 전송
			rs = stmt.executeQuery(); // select 문장 실행
			
			System.out.println("rs = " + rs);
			
			// 7. 결과 처리
			while(rs.next()) { // resultSet에 행(row) 데이터가 있는 경우
				
				Integer id = rs.getInt(COL_ID); // 아이디 컬럼에 값을 읽고 int 타입으로 리턴.
				String title = rs.getString(COL_TITLE);
				String content = rs.getString(COL_CONTENT);
				String author = rs.getString(COL_AUTHOR);
				LocalDateTime createdTime = rs.getTimestamp(COL_CREATED_TIME).toLocalDateTime();
				LocalDateTime modifiedTime = rs.getTimestamp(COL_MODIFIED_TIME).toLocalDateTime();
				// created_date 컬럼의 값을 Timestamp 타입으로 읽고, 그 결과를 LocalDateTime 타입으로 변환해서 리턴.
				
				Blog blog = new Blog(id,title,content,author,createdTime,modifiedTime);
				System.out.println(blog);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // OracleDriver 는 2번째 jdbc 바로 하위 OracleDriver 사용
		finally {
			try {
				rs.close();
				stmt.close();
				System.out.println("Statement 닫기 완료");
				conn.close();
				System.out.println("오라클 DB 접속 해제 성공");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 리소스 해제
		}

		
		
		
		
		
	}

}
