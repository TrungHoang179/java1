package bt6;

import java.util.ArrayList;

public class PhoneNum {
     private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNum(String name, ArrayList<String> phones) {
        this.name = name;
        this.phones = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public  void addPhone(String phone){
        if(!phones.contains(phone)){
            phones.add(phone);
        }
    }
    public void updatePhone(String oldPhone, String newPhone){
        if(phones.contains(oldPhone)){
            int i = phones.indexOf(oldPhone);
            phones.add(i,newPhone);
        }
    }

    public  void deletePhone(String phone){
        if(phones.contains(phone)){
            phones.remove(phone);
        }
    }
}

