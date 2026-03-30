package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20240873 / 이름: 신이슬"); 

        KoreanOutlet outlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(outlet);
        Smartphone smartphone = new Smartphone(adapter);

        smartphone.charge();
    }
}