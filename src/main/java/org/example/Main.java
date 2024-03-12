package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //반복 횟수 정할 수 없음 => 무한 반복 구조

        //변수에는 하나의 값만 저장 가능하므로 여러개의 게시물을 저장하려면 ArrayList를 사용한다.

        ArrayList<String> titlelist = new ArrayList<>();
        ArrayList<String> bodylist = new ArrayList<>();
        ArrayList<Integer> numlist = new ArrayList<>();

        //String title = ""; //추후에 입력을 통해 값이 입력될거기 때문에 지금 값이 필요없음
        //String story = "";

        while(true) { //반복 조건이 true이기 때문에 무한 반복
            String cmd = scan.nextLine();
            System.out.println("명령어 : ");


            if(cmd.equals("exit")) { //숫자가 아닌 경우 같다라는 표현을 할 때 ==이 아닌 .epuals() 를 사용해야 한다.
                System.out.println("프로그램을 종료합니다.");
                break; //반복문 탈출
            }

            else if(cmd.equals("add")) {

                System.out.println("게시물 번호를 입력해주세요 : ");
                int num = scan.nextInt();
                scan.nextLine(); //개행 문자 소비

                numlist.add(num);

                System.out.println("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                titlelist.add(title);

                System.out.println("게시물 내용을 입력해주세요 : ");
                String body = scan.nextLine();
                bodylist.add(body);

                System.out.println("게시물이 등록되었습니다.");
            }

            else if(cmd.equals("list")) {
                System.out.println("==============");
                for(int i = 0; i < titlelist.size(); i++) {

                    int num = numlist.get(i);
                    System.out.printf("번호 : %d\n", num);

                    String title = titlelist.get(i);
                    System.out.printf("제목 : %s\n", title);

                    //String body = bodylist.get(i);
                    //System.out.printf("내용 : %s\n", body);
                    System.out.println("==============");
                }
            }

            else if(cmd.equals("update")) {
                System.out.println("수정할 게시물 번호 : ");
                int num = scan.nextInt();
                scan.nextLine();
                if(num > 0 && num <= numlist.size()) {
                    System.out.println("제목 수정 : ");
                    String newtitle = scan.nextLine();
                    titlelist.set(num - 1, newtitle);

                    System.out.println("내용 수정 : ");
                    String newbody = scan.nextLine();
                    bodylist.set(num - 1, newbody);

                    System.out.println(num + "번 게시물이 수정되었습니다.");

                }
                else {
                    System.out.println("없는 게시물 번호입니다.");
                }
            }
            else if(cmd.equals("delete")) {
                System.out.println("삭제할 게시물 번호 : ");
                int num = scan.nextInt();
                scan.nextLine();
                if(num > 0 && num <= numlist.size()) {
                    titlelist.remove(num - 1);
                    bodylist.remove(num - 1);
                    numlist.remove(num - 1);

                    System.out.println(num + "번 게시물이 삭제되었습니다.");

                }
                else {
                    System.out.println("없는 게시물 번호입니다.");
                }
            }
            else if(cmd.equals("detail")) {
                System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
                int num =scan.nextInt();
                scan.nextLine();
                if(num > 0 && num <= numlist.size()) {


                    System.out.println("==============");
                    System.out.printf("번호 : %d\n", num);
                    String title = scan.nextLine();
                    System.out.printf("제목 : %s\n", title);
                    String body = scan.nextLine();
                    System.out.printf("내용 : %s\n", body);
                    System.out.println("==============");
                }
                else {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                }
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


    }
}
