package org.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String name; // 메뉴 이름
    private final List<MenuItem> menuItems; // 해당 메뉴에 있는 메뉴 아이템 리스트

    // 메뉴 이름 초기화, 아이템 리스트 생성
    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴에 아이템 추가
    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public static List<Menu> getMenus() {
        List<Menu> category = new ArrayList<>(); // 전체 메뉴 카테고리 리스트 생성

        Menu burgerMenu = new Menu("BURGERS");
        burgerMenu.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("DRINKS");
        drinkMenu.add(new MenuItem("Cola", 2.0, "캔"));

        Menu dessertMenu = new Menu("DESSERT");
        dessertMenu.add(new MenuItem("CupCake", 5.5, "크림치즈, 블루베리"));

        category.add(burgerMenu);
        category.add(drinkMenu);
        category.add(dessertMenu);

        return category;
    }
}
