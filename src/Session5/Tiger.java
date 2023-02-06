package Session5;

public class Tiger  extends Animal{

    public  void eatMeat(){
        System.out.println("5kg/day");

    }

    public  void eatMeat(String msg){
        this.setWeight(20);
        System.out.println(msg+ "5kg/day");
    }

    public  void eatMeat(String msg, int d){
        System.out.println(d+ msg+ "5kg/day");
    }

    public void run(){
        System.out.println("Tiger running...");//overwrite
    }
}
