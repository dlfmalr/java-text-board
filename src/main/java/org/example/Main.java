package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board app = new Board();
        app.run();
    }
}
//1.반복문 제어 하던 방법 : 반복 횟수 세서 특정 횟수 지나면 탈출
//2. break문을 사용하여 강제 탈출 가능

//for(int i=1; i <= 10; i++) {
//    if(i == 5) {
//        break;
//    }
//    System.out.println(i);
//}