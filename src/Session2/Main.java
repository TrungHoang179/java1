package Session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int x=10;
        Student s1 = new Student();
        s1.age++;
        s1.eat();
        Student s2 = new Student();
        s2.learn();
        Student s3 = new Student();
        System.out.println("S1:"+s1.name);
        System.out.println("S2:"+s2.email);
        System.out.println("S3:"+s3.name);
        // array
        int[] arrNums = new int[10];
        arrNums[0]=21;
        arrNums[1]=3;

        for(int i=0;i<10;i++){
            arrNums[i]=i;
        }

        //arrNums[10]=18;
        //arrNums[10]++;
        //System.out.println(arrNums[10]);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every one");

        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));

        for(int i=0;i<strs.size();i++){
            System.out.println(strs.get(i));
        }

        ArrayList<Student> sts = new ArrayList<>(); // mang cac sinh vien
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);

        sts.add(new Student());

        Hotgirl h1 = new Hotgirl();
        Hotgirl h2 = new Hotgirl();
        Hotgirl h3 = new Hotgirl();
        Hotgirl h4 = new Hotgirl();
        Hotgirl h5 = new Hotgirl();

        ArrayList<Hotgirl> hgs = new ArrayList<>();
        hgs.add(h1);
        hgs.add(h2);
        hgs.add(h3);
        hgs.add(h4);
        hgs.add(h5);
    }
}
