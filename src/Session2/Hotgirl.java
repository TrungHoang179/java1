package Session2;

import java.util.Scanner;

public class Hotgirl {
    String name;
    String birthyear;
    String address;
    public Hotgirl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nam sinh:");
        birthyear = sc.nextLine();
        System.out.println("Dia chi:");
        address = sc.nextLine();
    }
    public void cook(){
        System.out.println("Cooking..");
    }



}
