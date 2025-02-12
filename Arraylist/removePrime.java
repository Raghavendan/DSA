package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrime {
    public static void main(String []args){
        // int []a={};
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraylst");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(list);
        removePrimes(list);


    }
    public static void removePrimes(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(isPrime(list.get(i))){
                            list.remove(i);
                            i--;
                        }
                    }
                    System.out.println(list);
                }
                private static boolean isPrime(Integer integer) {
                    for(int i=2;i*i<=integer;i++){
                        if(integer%i==0){
                            return false;
                        }
                    }
                    return true;
                
                }
}
