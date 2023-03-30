package edu.java.contact.fileutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import edu.java.contact.model.Contact;

// 도우미 클래스 - 파일 관련(read, write, 폴더 생성) 기능을 제공하기 위한 클래스.
// 모든 메서드는 static으로 선언, 객체 생성은 못하도록.

public class FileUtil {

	// 상수 정의
	public static final String DATA_DIR = "data";
	public static final String DATA_FILE = "contacts.dat";
	// -> .\data\contacts.dat 파일에 연락처 리스트를 저장하기 위해서.

	// private 생성자 - 다른 클래스에서는 생성자가 보이지 않기 때문에 객체를 생성할 수 없음.
	private FileUtil() {

	}

	/*
	 * 연락처 데이터 파일을 저장하는 폴더가 존재하지 않으면 생성하고, File 객체를 리턴.
	 * 
	 * 폴더가 이미 생성되어 있는 경우에는, 그 폴더의 File 객체를 리턴.
	 * 
	 * @return 데이터 파일을 저장할 폴더의 File 객체.
	 */

	public static File initDataDir() {
		String cwd = System.getProperty("user.dir");
		File f = new File(cwd, DATA_DIR);
		if (!f.exists()) {
			System.out.println("폴더가 생성되었습니다.");
			f.mkdir();
			return f;
		}
		System.out.println("폴더를 불러왔습니다.");

		return f;
	}

	/*
	 * readDataFromFile.
	 * 
	 * argument로 전달된 파일 객체를 사용해서 파일의 저장된 연락처 정보를 읽고, 그 결과를 List<Contact> 타입의 객체로 리턴.
	 * 
	 * @param file 연락처 정보가 저장된 파일 경로를 가지고 있는 File타입 객체.
	 * 
	 * @return List<Contact>;
	 */

	public static List<Contact> readDataFromFile(File f) {
		List<Contact> contacts = null;
		try (FileInputStream in = new FileInputStream(f);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);) {

			contacts = (List) oin.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return contacts;

	}

	/**
	 * writeDataToFile. argument로 전달된 데이터를 (직렬화해서) 파일에 씀.
	 * 
	 * @param data 파일에 쓸 데이터. Contact 타입을 저장하는 List(List<Contact>)
	 * @param file 데이터 파일(File) 객체
	 * 
	 */

	public static void writeDatatoStringFile(List<Contact> contacts, File f) {
		String text = "";
		
		try (FileWriter fw = new FileWriter(f); 
				BufferedWriter bfw = new BufferedWriter(fw);

		) {
			for(Contact x : contacts) {
				text = text + x.toString() + " " + x.getsavetime().getYear() + "년 " + x.getsavetime().getMonthValue() + "월 " + x.getsavetime().getDayOfMonth() + "일 " + x.getsavetime().getDayOfWeek() +" "+ x.getsavetime().getHour() + "시 "+ x.getsavetime().getMinute() + "분 \n";
			}
			bfw.write(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeDataToFile(List<Contact> contacts, File f) {
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream(f);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);

			oout.writeObject(contacts);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * initData. 연락처 데이터 파일이 있으면, 파일의 내용을 읽어서 리스트를 생성하고 리턴. 연락처 데이터 파일이 없으면, 빈 리스트를
	 * 리턴.
	 * 
	 * @return List<Contact>
	 */

	public static List<Contact> initData() {
		// TODO Auto-generated method stub
		File f = new File(DATA_DIR, DATA_FILE);
		List<Contact> contacts = null;
		if (f.exists()) {
			contacts = readDataFromFile(f);
		} else {
			contacts = new ArrayList<>();
		}

		return contacts;
	}

}
