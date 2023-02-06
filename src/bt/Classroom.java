package bt;

import Session2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {
    String className;
    String room;
    ArrayList<hs> list = new ArrayList<>();

    public Classroom(String className, String room, ArrayList<hs> list) {
        this.className = className;
        this.room = room;
        this.list = list;
    }

    public String getClassName() {
        return className;
    }

    public String getRoom() {
        return room;
    }

    public ArrayList<hs> getList() {
        return list;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setList(ArrayList<hs> list) {
        this.list = list;
    }

    public void update(hs s){
        for(int i=0; i<list.size();i++){
            if(list.get(i).id == s.id){
                list.get(i).name = s.name;
                list.get(i).email = s.email;
                list.get(i).mark = s.mark;
                return;
            }
        }
    }
    public void sort(){
        Collections.sort(list, new Comparator<hs>() {
            @Override
            public int compare(hs o1, hs o2) {
                return o1.mark < o2.mark?-1:0;
            }
        });
    }
}
