package forecast;


import forecast.location.LocationTable;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        DBConnection db = new DBConnection();



        // 입력하기
        System.out.print("'시'를 입력해주세요 ( 예 부산광역시/...) : ");
        String level1 = sc.nextLine();
        System.out.print("'구'를 입력해주세요 ( 예 사상구/...) : ");
        String level2 = sc.nextLine();
        System.out.print("'동'를 입력해주세요 ( 예 괘법동/..) : ");
        String level3 = sc.nextLine();



        LocationDAO locationDAO = new LocationDAO();


        
        System.out.println("😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍😍");

    }
}
