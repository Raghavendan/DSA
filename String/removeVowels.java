package String;
import java.util.*;
public class removeVowels {
    public static void main(String []args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();
        vowels(s);
        sc.close();
    }
    public static void vowels(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                continue;
            }
            else{
                System.out.print(ch);
            }
        }
    }
}
