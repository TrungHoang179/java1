package Session3;

import asm.Fraction;
import bt5.Std;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Car> oto = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Ten:");
            String ten = sc.nextLine();
            System.out.println("Hang:");
            String hang = sc.nextLine();
            System.out.println("Gia:");
            int gia = sc.nextInt();
            oto.add(new Car(ten,hang,gia));
        }
        Collections.sort(oto, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2){

                return o1.getPrice() - o2.getPrice()>0? 0:-1;
            }
        });
    }
}
