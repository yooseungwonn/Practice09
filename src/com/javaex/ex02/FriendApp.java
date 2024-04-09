package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	// 스캐너에서 친구 정보 입력
    	// 이름 핸드폰 학교 -> ' '으로 구분된 데이터 
    	List<Friend> lst = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해주세요");
    	
    	for(int i = 0;i < 3; i++) {
    		String line = scanner.nextLine(); // 한 줄 입력
    		String[] data = line.split(" ");  // 공백으로 분할
    		
    		// Friend 객체 생성
    		Friend friend = new Friend(data[0], data[1], data[2]);
    		
    		// 리스트에 추가
    		lst.add(friend);
    	
    	}
    	// 친구 정보 출력
    	Iterator<Friend> it = lst.iterator();
    	while(it.hasNext()) {
    		Friend ittem = it.next();
    		ittem.showInfo();
    	}
    }

}
