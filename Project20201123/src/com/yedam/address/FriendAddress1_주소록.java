
//201123 ~ 201124
//주소록 생성 프로그램

package com.yedam.address;

import java.util.Scanner;

public class FriendAddress1_주소록 {

	// 메인 메소드 밖에 필드 선언을 하면 코드를 좀 더 간소화 할 수 있다.
	static Friend[] friends = new Friend[100];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.검색 6.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				addUnivFriend();
			} else if (selectNo == 3) {
				addCompFriend();
			} else if (selectNo == 4) {
				showFriendList();
			} else if (selectNo == 5) {
				searchFriend();
			} else if (selectNo == 6) {
				break; // Alt + 화살표 누르면 옮길 수 있음
			}
		}
		System.out.println("프로그램 종료");

	}// end of main

	// 1번 찐친구등록
	public static void addFriend() {

		System.out.print("친구이름: ");
		scn.nextLine(); // String 타입의 경우 엔터를 하나 소진시켜 주고 입력값을 받도록 설정해야 함. 엔터값 삭제 나중에 하면 데이터 안나옴.
		String name = scn.nextLine();
		System.out.print("연락처: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);

		insertFriend(frnd);
	}

	// 2번 학교친구등록
	public static void addUnivFriend() {
		System.out.print("친구이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.print("연락처: ");
		String phone = scn.nextLine();
		System.out.print("학교이름: ");
		String univ = scn.nextLine();
		System.out.print("전공정보");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone); // UniFriend 클래스에 기본 생성자가 아니기 때문에 name,phone을 넣어줘야 함
		frnd.setUniv(univ);
		frnd.setMajor(major);

		insertFriend(frnd);
	}

	// 3번 회사친구
	public static void addCompFriend() {
		System.out.print("친구이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.print("연락처: ");
		String phone = scn.nextLine();
		System.out.print("회사이름: ");
		String company = scn.nextLine();
		System.out.print("부서정보");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);

		insertFriend(frnd);
	}

	// 4번 리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendinfo();

			}
		}
	}

	// 5번 검색
	public static void searchFriend() {
		System.out.println("이름과 연락처를 입력하세요"); // 둘 중 하나만 입력해도 결과값을 출력하는 방법?

		System.out.print("이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.print("연락처: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);

		for (int i = 0; i < friends.length; i++) {
			if (frnd.getName().equals(friends[i])) {

			}
		}
		frnd.showFriendinfo();
	}

	// 6 한건 입력 / for구문 대신 insertFriend 메소드로 대체하기
	public static void insertFriend(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend; // 100개 공간 중 하나의 공간에만 정보를 저장하도록 설정
				break;
			}
		}
	}

}// end of class
