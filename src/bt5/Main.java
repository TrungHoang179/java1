package bt5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     //   Std[] hs = new Std[10];
        ArrayList<Std> hs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ngay sinh:");
            String ns = sc.nextLine();
            System.out.println("Dia chi:");
            String dc = sc.nextLine();
            System.out.println("Lop:");
            String lh = sc.nextLine();
            System.out.println("Diem tb:");
            double tb = sc.nextDouble();
            hs.add(new Std(ten,ns,dc,lh,tb));
        }

        //for(int i =0;i<hs.length-1;i++){
            //for(int j=0;j<hs.length-i-1;j++){
                //if(hs[j].getAvgMark()>hs[j+1].getAvgMark()){
                    //Std tmp;
                    //tmp = hs[j];
                    //hs[j] = hs[j+1];
                    //hs[j+1] = tmp;
                //}
            //}
        //}

        Collections.sort(hs, new Comparator<Std>(){
            @Override
            public int compare(Std o1, Std o2){
                return o1.getAvgMark() - o2.getAvgMark()>0? 0:-1;
            }
        });

        //for(int i=0;i<hs.length;i++){
          //  hs[i].stdInfor();
        // cao nhat: hs[0]
        // thap nhat: hs[hs.length-1]
       // }

        //for(int i=0;i<hs.length;i++){
            //if(hs[i].getAvgMark()>=9){
              //  hs[i].stdInfor();
            //}
        //}
        //xuat sac
    }
}
