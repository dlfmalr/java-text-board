package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTest {
//    private LocalDateTime currentDateTime;
//
//    public LocalDateTest() {
//        this.currentDateTime = LocalDateTime.now();
//    }
//
//    public String getFormattedDateTime() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        return currentDateTime.format(formatter);
//    }
//
//    public static void main(String[] args) {
//
//    }
public static void main(String[] args) {
    //현재 날짜와 시간 가져오기
    LocalDateTime now = LocalDateTime.now();
    //날짜와 시간 형식 설정하기
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
    //지정한 형식으로 출력
    String formattedDate = now.format(formatter);
    System.out.println("등록날짜 : " + formattedDate);
}



}
