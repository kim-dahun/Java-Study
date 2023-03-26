package edu.java.mvc.controller;

import java.time.LocalDateTime;
import java.util.Scanner;

import edu.java.mvc.model.Post;

public class PostDaoImpl implements PostDao {

	private Scanner scan = new Scanner(System.in);
	private static PostDaoImpl instance;
	private Post[] postlist;
	private Post[] postlistBackup;
	private int count = 1;

	private PostDaoImpl() {

	}

	public static PostDaoImpl getInstance() {
		if (instance == null) {
			instance = new PostDaoImpl();

		}

		return instance;
	}

	@Override
	public int write(String author, String title, String content) {
		int result = 0;
		try {
			if (count == 1) { // 1일 경우는 배열 크기 1개 배열을 생성
				postlist = new Post[count];
			} else { // 1 이상 일 경우부터 백업 배열을 만들어서 배열 크기를 증가시킴.
				postlistBackup = new Post[count];
				for (int i = 0; i < postlist.length; i++) {
					postlistBackup[i] = postlist[i];
				}
				postlist = new Post[count];
				for (int i = 0; i < postlist.length; i++) {
					postlist[i] = postlistBackup[i];
				}
			}

			Post postNew = new Post(count, title, content, author, count);

			postNew.setCreatedTime(LocalDateTime.now());
			postNew.setModifiedTime(LocalDateTime.now());

			postlist[count - 1] = postNew;
			count++;
			result = 1;
		} catch (Exception e) {
			return result;
		}

		return result;

	}

	@Override
	public int modify(int select) {
		// TODO Auto-generated method stub
		int result = 0;
		if (!checkCount()) {

			return result;
		}

		if (select < 1 || select >= count) {
			return result;
		}

		System.out.println("게시물의 제목을 수정해주세요.");
		String title = scan.nextLine();
		boolean write = true;
		String contentFull = " ";
		System.out.println("게시물의 내용을 수정해주세요. 작성을 완료하면 [종료]라고 입력해주세요.");
		while (write) {

			String contentNew = scan.nextLine();
			if (contentNew.equals("종료")) {
				contentNew = "\n";
				write = false;
				result = 1;
			}
			if (contentNew.equals("")) {
				contentFull = contentFull + "\n";
			} else {
				contentFull = contentFull + "\n" + contentNew;
			}
		}

		postlist[select - 1].setContent(contentFull);
		postlist[select - 1].setTitle(title);
		postlist[select - 1].setModifiedTime(LocalDateTime.now());

		return result;
	}

	@Override
	public int delete(int select) {
		// TODO Auto-generated method stub
		int result = 0;
		if (!checkCount()) {

			return 0;
		}
		if (select < 1 || select >= count) {
			System.out.println("없는 글 번호입니다. 글 번호를 다시 확인해주세요.");
		} else {
			for (int i = select - 1; i < count - 2; i++) {
				postlist[i] = postlist[i + 1];
				postlist[i].setPostNum(i+1);
			}
			postlist[count - 2] = new Post();
			count--;
			result = 1;
		}

		return result;
	}

	@Override
	public void readAll(int n) {
		// TODO Auto-generated method stub
		if (!checkCount()) {

			return;
		}

		System.out.println("====== 게시글 목록 ======");
		if (n == 1) { // 상세보기
			for (int i = 0; i < count - 1; i++) {
				System.out.print(postlist[i]);
			}
		} else { // 요약보기
			for (int i = 0; i < count - 1; i++) {
				postlist[i].printEasy();
			}
		}

	}

	@Override
	public void search(int select) {
		// TODO Auto-generated method stub
		boolean find = false;
		System.out.println("검색하고 싶은 작성자, 내용, 글 제목을 입력해주세요.");
		String search = scan.nextLine();
		for (int i = 0; i < postlist.length; i++) {
			if (postlist[i].getTitle().matches(".*" + search + ".*")
					|| postlist[i].getContent().matches(".*" + search + ".*")
					|| postlist[i].getAuthor().matches(".*" + search + ".*")) {
				System.out.println("해당 글의 번호 : " + postlist[i].getPid());
				System.out.println(postlist[i].toString());

				find = true;
			}
		}
		if (!find) {
			System.out.println("일치하는 글이 없습니다. 다시 검색해주세요.");

		}
	}

	@Override
	public void searchEasy(int select, int select2) {
		// TODO Auto-generated method stub

		if (checkCount()) {

			if (select2 > 0 && select < count) {
				if (select2 == 1) { // 상세보기
					System.out.println(postlist[select - 1].toString());
				} else { // 요약보기
					postlist[select - 1].printEasy();
				}
			}
		}
	}

	public boolean checkCount() {
		if (count == 1) {
			System.out.println("현재 작성된 글이 없습니다.");
			return false;
		}

		return true;
	}

}
