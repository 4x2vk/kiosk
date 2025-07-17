package org.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public static List<MenuItem> start() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        list.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        list.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner input = new Scanner(System.in);

        System.out.println("[ SHAKESHACK MENU ]");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i));
        }
        System.out.println("0. 종료      | 종료");

        try {
            int choice = input.nextInt();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            if (choice > 0 && choice <= list.size()) {
                System.out.println(choice + ". " + list.get(choice - 1));
            } else {
                System.out.println("잘못된 입력입니다");
            }
        } catch (Exception e) {
            System.out.println("숫자를 입력해 주세요. (" + e.getMessage() + ")");
        }
        return list;
    }
}
