package Arraylist;

import java.util.*;

public class Remove_even {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(11);
        System.out.println(list);


        Even(list);
        System.out.println(list);


        
    }
    public static void Even(ArrayList<Integer>list){
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }

    }
    
}
