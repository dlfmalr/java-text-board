package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
//    ArrayList<Article> articlelist = new ArrayList<>();
//        LocalDateTime now = LocalDateTime.now();
//        ArrayList article = new ArrayList(latestarticleId, );

    //        ArrayList<String> datelist = new ArrayList<>();
    public void run() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> titlelist = new ArrayList<>();
        ArrayList<String> bodylist = new ArrayList<>();
        ArrayList<Integer> idlist = new ArrayList<>();
        int latestarticleId = 1;
        //반복 횟수 정할 수 없음 => 무한 반복 구조

        //변수에는 하나의 값만 저장 가능하므로 여러개의 게시물을 저장하려면 ArrayList를 사용한다.




//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//        String formattedDate = now.format(formatter);

        //String title = ""; //추후에 입력을 통해 값이 입력될거기 때문에 지금 값이 필요없음
        //String story = "";

        while(true) { //반복 조건이 true이기 때문에 무한 반복
            System.out.println("명령어 : ");
            String cmd = scan.nextLine();

            if(cmd.equals("exit")) { //숫자가 아닌 경우 같다라는 표현을 할 때 ==이 아닌 .epuals() 를 사용해야 한다.
                System.out.println("프로그램을 종료합니다.");
                break; //반복문 탈출
            }

            else if(cmd.equals("add")) {

                //System.out.println("게시물 번호를 입력해주세요 : ");
                //int num = scan.nextInt();
                //scan.nextLine(); //개행 문자 소비

                //numlist.add(num);

                System.out.println("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                titlelist.add(title);

                System.out.println("게시물 내용을 입력해주세요 : ");
                String body = scan.nextLine();
                bodylist.add(body);

//                idlist.add(latestarticleId);
//                latestarticleId++;

                System.out.println("게시물이 등록되었습니다.");


//                Article article = new Article(latestarticleId, title, body);
//
//                article.setId(latestarticleId);
//
//                bodylist.add(body);
//
//                Article article = new Article();
//                article.setTitle(title);
//                article.setBody(body);
//                articlelist.add(article);
//                article.getId(latestarticleId);

            }

            else if(cmd.equals("list")) {
                System.out.println("==============");
                for(int i = 0; i < titlelist.size(); i++) {

                    int id = idlist.get(i);
                    System.out.printf("번호 : %d\n", id);

                    String title = titlelist.get(i);
                    System.out.printf("제목 : %s\n", title);

//                    String body = bodylist.get(i);
//                    System.out.printf("내용 : %s\n", body);
                    System.out.println("==============");

                }
            }

            else if(cmd.equals("update")) {
                System.out.println("수정할 게시물 번호 : ");
//                int id = Integer.parseInt(scan.nextLine());
//
//                System.out.println("새로운 제목을 입력해주세요 : ");
//                String newtitle = scan.nextLine();
//
//                System.out.println("새로운 내용을 입력해주세요 : ");
//                String newbody = scan.nextLine();
//
//                //인덱스로 찾아와서 수정
//                titlelist.set(id - 1, newtitle);
//                bodylist.set(id - 1, newbody);
//
//                System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
//
                int num = scan.nextInt();
                scan.nextLine();
                if(num > 0 && num <= idlist.size()) {
                    System.out.println("제목 수정 : ");
                    String newtitle = scan.nextLine();
                    titlelist.set(num - 1, newtitle);

                    System.out.println("내용 수정 : ");
                    String newbody = scan.nextLine();
                    bodylist.set(num - 1, newbody);

                    System.out.println(num + "번 게시물이 수정되었습니다.");
                }
//


                else {
                    System.out.println("없는 게시물 번호입니다.");
                }
            }
//            else if(cmd.equals("delete")) {
//                System.out.println("삭제할 게시물 번호 : ");
//                int num = scan.nextInt();
//                scan.nextLine();
//                if(num > 0 && num <= idlist.size()) {
//                    titlelist.remove(num - 1);
//                    bodylist.remove(num - 1);
//                    idlist.remove(num - 1);
//
//                    System.out.println(num + "번 게시물이 삭제되었습니다.");
//
//                }
//                else {
//                    System.out.println("없는 게시물 번호입니다.");
//                }
//            }
//            else if(cmd.equals("detail")) {
//                System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
//                int num =scan.nextInt();
//                //scan.nextLine();
//                if(num > 0 && num <= idlist.size()) {
//                    //조회수 증가
//
//                    System.out.println("==============");
//                    System.out.printf("번호 : %d\n", num);
//                    String title = titlelist.get(num);
//                    System.out.printf("제목 : %s\n", title);
//                    String body = bodylist.get(num);
//                    System.out.printf("내용 : %s\n", body);
//                    //System.out.printf("등록날짜 : %d\n", LocalDateTime);
//                    System.out.println("==============");
//                }
//                else {
//                    System.out.println("존재하지 않는 게시물 번호입니다.");
//                }


        }
    }
}
