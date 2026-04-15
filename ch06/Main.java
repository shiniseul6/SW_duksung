package hw.ch06;

import hw.ch06.framework.Manager;
import hw.ch06.framework.Product;
import hw.ch06.UnderlinePen;
import hw.ch06.MessageBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20240873 이름: 신이슬");
        System.out.println();

        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        BorderLine bline = new BorderLine('=');

        manager.register("underline", upen);
        manager.register("message", mbox);
        manager.register("border", bline);

        System.out.println("===== Test 1: Underline Pen =====");
        Product p1 = manager.create("underline");
        p1.use("Welcome");
        System.out.println();

        System.out.println("===== Test 2: MessageBox =====");
        Product p2 = manager.create("message");
        p2.use("Welcome");
        System.out.println();

        System.out.println("===== Test 3: BorderLine =====");
        Product p3 = manager.create("border");
        p3.use("Welcome");
        System.out.println();

        System.out.println("===== Clone Test =====");
        Product p3_copy = manager.create("border");
        if (p3 != p3_copy) {
            System.out.println("✓ 정상적으로 복사됨 (서로 다른 인스턴스)"); 
        } else {
            System.out.println("X 복사 실패");
        }
    }
}