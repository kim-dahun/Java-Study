package edu.java.mvc.view;

import java.util.Scanner;

import edu.java.mvc.controller.PostDao;
import edu.java.mvc.controller.PostDaoImpl;
import edu.java.mvc.menu.Menu;


public class PostMain {

	private int postNum;
	
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("======== Development Blog ========");
		System.out.println();
		PostMain postMain = new PostMain();

		boolean run = true;

		while (run) {
			Menu menu = postMain.selectMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case WRITE:
				postMain.writePost();
				break;
			case MODIFY:
				postMain.modifyPost();
				break;
			case DELETE:
				postMain.deletePost();
				break;
			case PRINT_ALL:
				postMain.printPost();
				break;
			case SEARCH_TITLE:
				postMain.searchPost();
				break;
			case UNDEFINED:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;

			}
		}
		System.out.println("Blog를 종료하였습니다.");

	}

	private void searchPost() {
		// TODO Auto-generated method stub
		System.out.println("==== 포스팅 글 검색하기 ====");
		System.out.println("[1번 : 작성자,내용으로 검색하기 | 2번 : 글 번호로 검색하기]");
		int select = inputNum();

		if (select == 1) {
			PostDaoImpl.getInstance().search(select);
		} else if (select == 2) {
			System.out.println("찾고 싶은 글의 번호를 검색해주세요.");
			select = inputNum();
			System.out.println("[1번 : 상세보기 | 2번 : 요약보기]");
			int select2 = inputNum();
			PostDaoImpl.getInstance().searchEasy(select, select2);

		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}

	private void printPost() {
		System.out.println("==== 포스팅 글 리스트 보기 ====");
		System.out.println("[1번 : 상세보기 | 2번 : 간단히보기]");
		// TODO Auto-generated method stub
		int select = inputNum();
		PostDaoImpl.getInstance().readAll(select);

	}

	private void deletePost() {
		// TODO Auto-generated method stub
		System.out.println("==== 포스팅 글 삭제 ====");
		System.out.println("삭제할 글의 번호를 입력해주세요.");
		int select = inputNum();
		int result = PostDaoImpl.getInstance().delete(select);

		if (result == 1) {
			System.out.println("성공적으로 " + select + "번의 글이 삭제 되었습니다.");
		} else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}

	private void modifyPost() {
		// TODO Auto-generated method stub
		System.out.println("==== 포스팅 글 수정 ====");
		System.out.println("수정하기 원하는 글의 번호를 입력해주세요.");
		int select = inputNum();
		int result = PostDaoImpl.getInstance().modify(select);
		
		if(result ==1) {
			System.out.println("성공적으로 " + select + "번의 글이 수정 되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}
	}

	public void writePost() {
		System.out.println("==== 포스팅 글 신규 작성 ====");
		System.out.println("게시자의 성함을 작성해주세요.");
		String author = scan.nextLine();
		System.out.println("게시물의 제목을 작성해주세요.");
		String title = scan.nextLine();
		boolean write = true;
		String contentFull = " ";
		System.out.println("게시물의 내용을 작성해주세요. 작성을 완료하면 [종료]라고 입력해주세요.");
		while (write) {

			String contentNew = scan.nextLine();
			if (contentNew.equals("종료")) {
				contentNew = "작성자 :" + author;
				write = false;
			}
			if (contentNew.equals("")) {
				contentFull = contentFull + "\n";
			} else {
				contentFull = contentFull + "\n" + contentNew;
			}
		}

		int result = PostDaoImpl.getInstance().write(author, title, contentFull);

		if (result == 1) {
			System.out.println("게시글이 정상적으로 등록되었습니다.");
		} else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
	}

	public Menu selectMenu() {
		System.out.println("=============================================================================");
		System.out.println("[ 0.프로그램 종료 | 1. 글쓰기 | 2. 글 수정 | 3. 글 삭제하기 | 4. 전체 리스트 | 5. 글 검색하기 ]");
		System.out.println("=============================================================================");

		Menu menu = Menu.getValue(inputNum());

		return menu;
	}

	public int inputNum() {

		boolean run = true;
		int n = 0;
		while (run) {
			try {
				n = Integer.parseInt(scan.nextLine());

				run = false;
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println("알맞은 숫자를 입력해야 합니다.");
				continue;

			}

		}
		return n;

	}

}
