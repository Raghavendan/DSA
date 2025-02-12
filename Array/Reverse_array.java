import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No.of.Elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();

    }

    
}
