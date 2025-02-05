import java.util.*;
public class Max_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in arr:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.printf("Maximun no:"+ Max);

    }
    
}
