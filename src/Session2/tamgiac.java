package Session2;

import java.util.Scanner;

public class tamgiac {
    int canh1;
    int canh2;
    int canh3;
   public tamgiac(){
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("Canh 1:");
           canh1 = sc.nextInt();
           System.out.println("Canh 2:");
           canh2 = sc.nextInt();
           System.out.println("Canh 3:");
           canh3 = sc.nextInt();
       }while (!kiemtra());
   }
   public boolean kiemtra(){
       return canh1+canh2>canh3 && canh2+canh3>canh1 && canh1+canh3>canh2;
   }
   public int tinhchuVi(){
       return canh1+canh2+canh3;
   }
   public double tinhdienTich(){
       double p = tinhchuVi()/2.0;
       return p;
   }


}
