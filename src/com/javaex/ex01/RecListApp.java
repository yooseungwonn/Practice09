package com.javaex.ex01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class RecListApp {




	public static void main(String[] args) {

		List<Rectangle> rList = new ArrayList<Rectangle>();
		double sum = 0;
		
		Rectangle r01 = new Rectangle(1,1);
		Rectangle r02 = new Rectangle(2,2);
		Rectangle r03 = new Rectangle(3,3);
		Rectangle r04 = new Rectangle(4,5);
		
		
		System.out.println("#사각형 4개 리스트에 추가=========================================");
		//사각형4개 리스트에 추가 코드 작성
	    rList.add(r01);
	    rList.add(r02);
	    rList.add(r03);
	    rList.add(r04);
	   
		
		//리스트 모두를 draw하는 메소드 실행
	    listAllDraw(rList);		

		System.out.println("#3번째 사각형(3, 3) 삭제==========================================");
		//사각형(3,3) 삭제 코드 작성
		rList.remove(2);
		
		//리스트 모두를 draw하는 메소드 실행
		listAllDraw(rList);		
		
		

		
		System.out.println("#4번째 사각형(4, 5)-->(9, 5)로 width 값 변경======================");
		//사각형(4, 5) 수정 코드 작성
		(r04).setWidth(9);
		//리스트 모두를 draw하는 메소드 실행
		listAllDraw(rList);	
		
		
		
		
		
		System.out.println("#모든 사각형의 넓이 합 출력=======================================");
		//모든 사각형의 넓이 합 구하기 코드 작성
		Iterator<Rectangle> it = rList.iterator();
		while(it.hasNext()) {
			Rectangle rect =it.next();
			sum += rect.area();
		}
		//모든 사각형의 합 출력
		System.out.println("모든 사각형의 넓이는 " + sum + " 입니다.");
		
		
	}


	//리스트 모두를 draw하는 메소드
	public static void listAllDraw(List<Rectangle> list) {
		// 리스트 순회 :
		// - for 문을 이용한 인덱스 접근
		// - Iterator를 이용한 접근
		
		Iterator<Rectangle> it = list.iterator();
		while(it.hasNext()) {  //뒤의 요소 유무 확인
			Rectangle ittem = it.next();
			ittem.draw();
		}
	
	}
	
}
