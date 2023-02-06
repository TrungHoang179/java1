package bt5;

import java.util.Scanner;

public class Std {
    private String name;
    private String birthday;
    private String address;
    private String className;
    private double avgMark;

    public Std(String name, String birthday, String address, String className, double avgMark) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.className = className;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getClassName() {
        return className;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    public void danhGia(){
        if(avgMark<4 && avgMark>= 0){
            System.out.println("Hoc sinh yeu");
        }
        else if(avgMark<6 && avgMark>= 4){
            System.out.println("Hoc sinh trung binh");
        }
        else if(avgMark<8 && avgMark>= 6){
            System.out.println("Hoc sinh kha");
        }
        else if(avgMark<=9 && avgMark>= 8){
            System.out.println("Hoc sinh gioi");
        }
        else if(avgMark<=10 && avgMark>9){
            System.out.println("Hoc sinh xuat sac");
        }else{
            System.out.println("Hoc sinh co trinh do ko the danh gia");
        }
    }
    public void stdInfor(){
        System.out.println(name+birthday+address+className+avgMark);
    }
}
