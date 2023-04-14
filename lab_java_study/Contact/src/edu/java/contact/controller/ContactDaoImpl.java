package edu.java.contact.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import edu.java.contact.model.Contact;
import oracle.jdbc.OracleDriver;

import static edu.java.contact.model.Contact.Entity.*;
import static edu.java.contact.ojdbc.OracleConnect.*;

public class ContactDaoImpl implements ContactDao {

	
	
	private static ContactDaoImpl instance= null;
	
	private ContactDaoImpl(){
		
	}
	
	public static ContactDaoImpl getInstance() {
		
		if(instance == null) {
			
			instance = new ContactDaoImpl();
			
		}
		
		return instance;
	}
	
	private void closeResources(Connection conn, Statement stmt) throws Exception {
		
		
		stmt.close();
		conn.close();
		
	}
	
	private void closeResources(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		
		rs.close();
		closeResources(conn,stmt);
		
		
	}
	
	// 오라클 DB에 접속한 CONNECTION 객체를 리턴
	private Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
		// Oracle jdbc 드라이버(라이브러리) 등록
			DriverManager.registerDriver(new OracleDriver());
			// Oracle DB에 접속.
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		
		
		return conn;
		
	}
	
	// select * from contacts order by cid;
	private static final String SQL_SELECT_ALL = String.format("SELECT * FROM %s ORDER BY %s", TBL_NAME, COL_CID);
	
	
	@Override
	public List<Contact> read() {
		// TODO Auto-generated method stub
		ArrayList<Contact> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			System.out.println(SQL_SELECT_ALL);
			stmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				// 각 컬럼의 값들을 읽음.
				Integer cid = rs.getInt(COL_CID);
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				// contact 객체에 읽은 값을 저장
				Contact contact = new Contact(cid,name,phone,email);
				// 객체를 리스트에 추가
				list.add(contact);
				// 행 갯수만큼 반복( 데이터 있는 행 )
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				closeResources(conn, stmt, rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return list;
	}

	
	private static final String SQL_SELECT_BY_ID = String.format("SELECT * FROM %s WHERE %s = ?", TBL_NAME,COL_CID);
	@Override
	public Contact read(Integer cid) {
		// TODO Auto-generated method stub
		Contact contact = null;
		PreparedStatement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
			stmt.setInt(1, cid);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
			
			
			int id = rs.getInt(COL_CID);	
			String name = rs.getString(COL_NAME);
			String phone = rs.getString(COL_PHONE);
			String email = rs.getString(COL_EMAIL);
			
			contact = new Contact(cid,name,phone,email);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			closeResources(conn, stmt, rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contact;
	}

	private static final String SQL_INSERT = String.format("INSERT INTO %s (%s, %s, %s) VALUES (?,?,?)", TBL_NAME,COL_NAME,COL_PHONE,COL_EMAIL);
	
	@Override
	public int create(Contact contact) {
		Integer result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			
			String name = contact.getName();
			String phone = contact.getPhone();
			String email = contact.getEmail();
			
			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setString(3, email);
			
			result = stmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				closeResources(conn, stmt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
	}

	
	private static final String SQL_UPDATE = String.format("UPDATE %s SET %s = ?, %s = ?, %s = ? where %s = ? ", TBL_NAME,COL_NAME,COL_PHONE,COL_EMAIL,COL_CID);
	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, contact.getName());
			stmt.setString(2, contact.getPhone());
			stmt.setString(3, contact.getEmail());
			stmt.setInt(4, contact.getCid());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				closeResources(conn, stmt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		return result;
	}

	
	
	private static final String SQL_DELETE = String.format("DELETE FROM %s WHERE %s = ?",TBL_NAME, COL_CID);
	@Override
	public int delete(Integer cid) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			
			stmt.setInt(1, cid);
			
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				closeResources(conn, stmt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return result;
	}

	
	
	private static final String SQL_KEYWORD = String.format("SELECT * FROM %s WHERE LOWER(%s) LIKE LOWER(?) OR LOWER(%s) LIKE LOWER(?) OR LOWER(%s) LIKE LOWER(?)", TBL_NAME,COL_NAME,COL_PHONE,COL_EMAIL);
	public List<Contact> read(String keyword){
		
		ArrayList<Contact> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String key = "%" + keyword + "%";
		try {
			conn=getConnection();
			stmt=conn.prepareStatement(SQL_KEYWORD);
			
			stmt.setString(1, key);
			stmt.setString(2, key);
			stmt.setString(3, key);
			
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				
				
				Contact contact = new Contact(rs.getInt(COL_CID),name,phone,email);
				list.add(contact);
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				closeResources(conn, stmt, rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return list;
	}

	
	
}
