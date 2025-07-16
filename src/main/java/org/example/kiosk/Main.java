package org.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner input = new Scanner(System.in);

        int choice;
        System.out.println("[ SHAKESHACK MENU ]");

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i+1) + "." + menuItems.get(i));
        }

        System.out.println("0. 종료      | 종료");
        choice = input.nextInt();

        if (choice == 0) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        } else {
            System.out.println((choice) + "." + menuItems.get(choice-1));
        }
    }
}
