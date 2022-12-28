package Session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int x = 10;
        double y = 3.14;
        String s = " Hello";
        System.out.println("x = " + x);
        y = y + 20 * x;
        if (y > 100) {
            System.out.println("y = " + y);
        } else {
            System.out.println("x =" + x);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i =" + x);
        }
        int S1 = 0;
        for (int i = 0; i <= 1000; i++) {
            S1 = S1 + i;
        }
        System.out.println("S1 = " + S1);
        int S2 = 0;
        for (int i = 0; i <= 1000; i++) {
            S2 = S2 + 1 / i;
        }
        System.out.println("S2 = " + S2);

        int z = tinhtong(10,15);
            boolean t = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap 1 so nguyen");
            int n = sc.nextInt();
            System.out.println("Nhap 1 so thuc");
            double d = sc.nextInt();
            System.out.println("Nhap 1 string");
            String str = sc.nextLine();
            System.out.println("n: "+n);
            System.out.println("d: "+d);
            System.out.println("str: "+str);

    }
    static int tinhtong( int a, int b){
        return a + b;
    }
    static int tinhhieu( int a, int b){
        return a - b;
    }
    static int tinhtich( int a, int b){
        return a * b;
    }
    static int tinhthuong( int a, int b){
        return b == 0 ? null : a / b;
    }
}
