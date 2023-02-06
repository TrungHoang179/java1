package Session4;

import bt5.Std;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Std[] hs = new Std[10];

        ArrayList<Std> ls = new ArrayList<>();

        ls.add(new Std("Trung","25/12/2004","8 Ton That Huyet","T2207A",8.5));//Std[0]
        // in thong tin Std[0]
        ls.get(0).stdInfor();

        ArrayList<String> strs = new ArrayList<>();
    }
}
