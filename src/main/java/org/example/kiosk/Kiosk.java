package org.example.kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Cart cart = new Cart(); // 장바구니 객체 생성

    public void start() {
        Scanner input = new Scanner(System.in);
        List<Menu> menus = Menu.getMenus(); // 메뉴 목록 가져오기

        while (true) {
            System.out.println();
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            System.out.println();

            cart.show();  // 장바구니 내용 보여주기
            System.out.println("0. 종료      | 종료");

            try {
                int choice = input.nextInt(); // 사용자 메뉴 선택

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }

                if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    List<MenuItem> items = selectedMenu.getMenuItems(); // 해당 메뉴의 아이템들 가져오기

                    while (true) {
                        System.out.println("[ " + selectedMenu.getName() + " MENU ]");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + "." + items.get(i)); // 메뉴 아이템 출력

                        }
                        System.out.println("0. 돌아가기");

                        int itemChoice = input.nextInt();
                        if (itemChoice == 0) {
                            break;
                        }

                        MenuItem selectedItem = items.get(itemChoice - 1);

                        if (itemChoice > 0 && itemChoice <= items.size()) {
                            System.out.println("선택된 메뉴: " + selectedItem.getName());
                        } else {
                            System.out.println("잘못된 입력입니다");
                        }

                        System.out.println(selectedItem.getName());
                        System.out.println("1. 확인        2. 취소");

                        int itemCheck = input.nextInt();
                        if (itemCheck == 1) {
                            cart.add(selectedItem);
                            System.out.println(selectedItem + "이 장바구니에 추가되었습니다.");
                        } else {
                            if (itemCheck == 0) {
                                break;
                            }
                        }
                    }
                }
                else {
                    System.out.println("잘못된 입력입니다");
                }

            } catch (Exception e) {
                System.out.println("숫자를 입력해 주세요. (" + e.getMessage() + ")");
                input.nextLine(); // 입력 버퍼 정리
            }
        }
    }
}
