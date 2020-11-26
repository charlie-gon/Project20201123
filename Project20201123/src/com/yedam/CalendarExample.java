
//201126
//달력 구현 클래스

package com.yedam;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {

			//년도와 월 입력받기

			System.out.print("년도:");

			int year = sc.nextInt();

			System.out.print("월:");

			int month = sc.nextInt();

			

			//합계를 구할 변수

			int cnt = 0;

			

			//year 이전 까지 지나온 날 수의 합계를 구하기

			//년은 1부터 시작

			for(int i=1; i<year; i=i+1) {

				//윤년이면 366을 더하고 윤년이 아니면 365를 더하기

				if(i%4==0 && i%100!=0 || i%400==0) {

					cnt = cnt + 366;

				}

				else {

					cnt = cnt + 365;

				}

			}

			

			//지나온 월 의 날짜수를 더하기

			//각 월의 날짜수를 갖는 배열을 생성

			//인덱스를 맞추기 위해서 첫번째 값을 0으로 설정

			int [] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

			//입력한 년도가 윤년이면 days의 2는 29로 변경

			if(year%4==0 && year%100!=0 || year%400==0) {

				days[2] = 29;

			}

			

			//월 이전까지의 날짜 수 더하기

			for(int i=0; i<month; i=i+1) {

				cnt = cnt + days[i];

			}

			

			//확인방법 - cnt + 1 한 값을 7로 나눈 나머지가 입력한

			//년도와 월의 1일의 요일입니다.

			//일요일이면 0 월요일이면 1

			//System.out.println((cnt+1)%7);

			

			//날짜 값을 저장할 배열을 생성

			int [][] cal = new int[6][7];

			

			int start = (cnt + 1) % 7;

			

			//달력은 1일 부터 자신의 월 수에 해당하는 일까지

			for(int i=1; i<= days[month]; i=i+1) {

				cal[start/7][start%7] = i;

				start = start + 1;		

			}

			

			System.out.println("   일   월  화  수  목   금   토");

			

			for(int i=0; i<42; i=i+1) {

				System.out.printf("%3d", cal[i/7][i%7]);

				if(i % 7 == 6) {

					System.out.printf("\n");

				}

			}

			

		}catch(Exception e) {

			System.out.println("예외:" + e.getMessage());

			e.printStackTrace();

		}

	}
	}
