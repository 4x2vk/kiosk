package org.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 메뉴 아이템들을 저장하는 장바구니 리스트
    private final List<MenuItem> items =  new ArrayList<>();

    // 장바구니에 아이템을 추가하는 메서드
    public void add(MenuItem item){
        items.add(item);
    }

    // 장바구니에 담긴 아이템들을 출력하는 메서드
    public void show() {
        if (items.isEmpty()) {
            return; // 비여있을때 출력안함
        }

        System.out.println("[ ORDERS ]");
        for (MenuItem item : items) {
            System.out.println(item.getName() + "| W" + item.getPrice()); // 각 아이템 이름과 가격 출력
        }
        System.out.println("[ TOTAL ]");
        System.out.printf("W %s\n", getTotal()); // 총합 출력
    }

    // 장바구니 총 금액 계산
    public double getTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // 장바구니를 비우는 메서드 (코드 로직이 안맞아서 시간이 부족했다)
    public void clear() {
        items.clear();
    }
}
