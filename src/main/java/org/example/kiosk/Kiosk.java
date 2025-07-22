package org.example.kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public void start() {
        Scanner input = new Scanner(System.in);
        List<Menu> menus = Menu.getMenus();

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println("0. 종료      | 종료");

            try {
                int choice = input.nextInt();
                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    List<MenuItem> items = selectedMenu.getMenuItems();

                    while (true) {
                        System.out.println("[ " + selectedMenu.getName() + " MENU ]");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + "." + items.get(i));
                        }
                        System.out.println("0. 돌아가기");

                        int itemChoice = input.nextInt();
                        if (itemChoice == 0) {
                            break;
                        }
                        if (itemChoice > 0 && itemChoice <= items.size()) {
                            MenuItem selectedItem = items.get(itemChoice - 1);
                            System.out.println("선택한 항목: " + selectedItem.getName());
                        } else {
                            System.out.println("잘못된 입력입니다");
                        }
                    }
                }
                else {
                    System.out.println("잘못된 입력입니다");
                }

            } catch (Exception e) {
                System.out.println("숫자를 입력해 주세요. (" + e.getMessage() + ")");
                input.nextLine();
            }
        }
    }
}
