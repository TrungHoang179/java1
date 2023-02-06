package asm;

public class Main {
    public static void main(String[] args){
        Fraction t1 = new Fraction();
        t1.tuso = 1;
        t1.mauso = 2;

        Fraction t2 = new Fraction();
        t2.tuso = 4;
        t2.mauso = 2;

        Fraction t = t1.add(t2);
        Fraction h = t1.sub(t2);
        Fraction n = t1.x(t2);
        Fraction c = t1.chia(t2);

        t.rutgon();
        h.rutgon();
        n.rutgon();
        c.rutgon();

        t.print();
        h.print();
        n.print();
        c.print();
    }
}
