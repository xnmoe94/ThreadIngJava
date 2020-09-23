package com.ListHelper;

import java.util.*;

public class ListHelper extends Object {
    private List list;


    public ListHelper(){
        list = Collections.synchronizedList(new ArrayList());
    }
    public List getList(){
        return list;

    }

    public void  add(Object ob){
        list.add(ob);
    }

    public boolean addIfNoDuplicate(Object ob){
        synchronized (list){
            if(list.contains(ob) == false){
                list.add(ob);
                return true;

            }

            return false;
        }
    }

    public void sort(){
        synchronized (list){
            Collections.sort(list);
        }
    }

    public void printContent(){
        synchronized (list){
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }





}
