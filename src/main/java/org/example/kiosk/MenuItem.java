package org.example.kiosk;

public class MenuItem {

    private final String name;
    private double price;
    private String description;

    // 생성자: 메뉴 이름, 가격, 설명을 설정
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 출력 format 지정 (이름, 가격, 설명)
    @Override
    public String toString() {
        return String.format(" %-14s | W %s | %s", name, price, description);
    }

    // 외부에서 값 조회
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // 외부에서 가격이나 설명 변경 (코드 로직이 조끔 안맞아서 쓰지 못했다)
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
