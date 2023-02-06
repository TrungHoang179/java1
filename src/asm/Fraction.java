package asm;

public class Fraction {
    public int tuso;
    public int mauso;
    public void print(){
        System.out.print(tuso+"/"+mauso);
    }
    public void rutgon(){
        int ucln = 1;
        int min = Math.min(Math.abs(tuso),Math.abs(mauso));
        for(int i =min;i>1;i--){
            if(tuso%i==0 && mauso%i==0){
                ucln =1;
                break;
            }
        }
        tuso= mauso/ucln;
        mauso= mauso/ucln;
    }
    public void nghichdao(){
        if(tuso!=0) {
            int tmp = tuso;
            tuso = mauso;
            mauso = tmp;
        }
    }
    public Fraction add(Fraction f){
        int ts = tuso*f.mauso + mauso*f.tuso;
        int ms = mauso*f.mauso;
        Fraction tong = new Fraction();
        tong.tuso = ts;
        tong.mauso = ms;
        return tong;
    }
    public Fraction sub(Fraction f){
        int ts = tuso*f.mauso - mauso*f.tuso;
        int ms = mauso*f.mauso;
        Fraction hieu = new Fraction();
        hieu.tuso = ts;
        hieu.mauso = ms;
        return hieu;
    }
    public Fraction x(Fraction f){
        int ts = tuso*f.tuso;
        int ms = mauso*f.mauso;
        Fraction tich = new Fraction();
        tich.tuso = ts;
        tich.mauso= ms;
        return tich;
    }
    public Fraction chia(Fraction f){
        if(f.tuso!=0){
        int ts = tuso*f.mauso;
        int ms = mauso*f.tuso;
        Fraction thuong = new Fraction();
        thuong.tuso= ts;
        thuong.mauso= ms;
        return thuong;
        }
        return null;
    }
}
