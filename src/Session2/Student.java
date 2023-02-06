package Session2;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    int age=18; //attribute
    public void eat(){
        System.out.println("Eating..");
    }
    public void learn(){
        System.out.println("Learning..");
    }
    public Student(){
        // auto run when create obj
        //System.out.println("Xin chao");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap email:");
        email = sc.nextLine();
    }
}
