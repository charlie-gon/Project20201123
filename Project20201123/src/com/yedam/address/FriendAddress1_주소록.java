
//201123
//주소록 생성 프로그램

package com.yedam.address;

import java.util.Scanner;

public class FriendAddress1_주소록 {
	public static void main(String[] args) {

		// 친구정보
		// Hong, 111=1111 / Hwang 22-2222 Seoul History / Park 333-3333 Daeum-Kakao
		// Developement

		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.친구선택 6.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.print("친구이름: ");
				String name = scn.nextLine();
				scn.nextLine(); // 엔터를 소진시켜줌
				System.out.print("연락처: ");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd; // 100개 공간 중 하나의 공간에만 정보를 저장하도록 설정
						break;
					}
				}

			} else if (selectNo == 2) {
				System.out.print("친구이름: ");
				String name = scn.nextLine();
				scn.nextLine();
				System.out.print("연락처: ");
				String phone = scn.nextLine();
				System.out.print("학교이름: ");
				String univ = scn.nextLine();
				System.out.print("전공정보");
				String major = scn.nextLine();
				UnivFriend frnd = new UnivFriend(name, phone); // UniFriend 클래스에 기본 생성자가 아니기 때문에 name,phone을 넣어줘야 함
				frnd.setUniv(univ);
				frnd.setMajor(major);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd; // 100개 공간 중 하나의 공간에만 정보를 저장하도록 설정
						break;
					}
				}

			} else if (selectNo == 3) {
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
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd; // 100개 공간 중 하나의 공간에만 정보를 저장하도록 설정
						break;
					}
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendinfo();

					}
				}

			} else if (selectNo == 5) {
				String name = scn.nextLine();
				System.out.print("연락처: ");
				String phone = scn.nextLine();
				Friend frnd = new Friend(phone);
				frnd.setPhone(phone);
				frnd.showFriendinfo();

			} else if (selectNo == 6) {
				break; // Alt + 화살표 누르면 옮길 수 있음
			}
		}
		System.out.println("프로그램 종료");

	}// end of main

}// end of class
