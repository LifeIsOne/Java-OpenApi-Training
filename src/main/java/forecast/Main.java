package forecast;



import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());

        System.out.println("다음 중 하나의 지역을 입력하세요!");

        // 1단계 리스트 출력 ( 도, 시 )
        List<String> levelOneList = dao.SearchLevelOne();
        levelOneList.forEach(s -> System.out.print("["+s+"] "));
        System.out.println();
        System.out.print(" ↪ ");

        // 1단계 입력
        String levelOne = sc.nextLine();
        System.out.println();

        // 2단계 리스트 출력 ( 구, 군 )
        System.out.println("다음 중 하나의 구 또는 군을 입력하세요!!");
        List<String> levelTwoList = dao.SearchLevelTwo(levelOne);
        levelTwoList.forEach(s -> System.out.print("["+s+"] "));
        System.out.println();
        System.out.print(" ↪ ");

        // 2단계 입력
        String levelTwo = sc.nextLine();
        System.out.println();

        // 3단계 리스트 출력 ( 동, 읍, 면 )
        System.out.println("다음 중 하나의 동을 입력하세요!!");
        List<String> levelThreeList = dao.SearchLevelThree(levelOne, levelTwo);
        levelThreeList.forEach(s -> System.out.print("["+s+"] "));
        System.out.println();
        System.out.print(" ↪ ");

        // 3단계 입력
        String levelThree = sc.nextLine();
        System.out.println();



        System.out.println("😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍");

    }
}
