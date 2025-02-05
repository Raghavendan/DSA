public class Sumofmaxmin {
        public static void main(String []args){
            int[] A = {-2,1,-4,5,3};
            int result=solve(A);
            System.out.println(result);
        }
        public static int solve(int[] A) {
            int Max=Integer.MIN_VALUE;
            int Min=Integer.MAX_VALUE;
            for(int i=0;i<A.length;i++){
                if(A[i]>Max){
                    Max=A[i];
                }
                else if(A[i]<Min){
                    Min=A[i];
                }
            }
            System.out.println(Max);
            System.out.println(Min);
            return Max+Min;

    
        }
    
    
    
}
