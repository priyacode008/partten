
public class Small{
    public static void main(String args []){
        
        int i,j,n=5;
        
        System.out.println("the matrix format");
        for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
            System.out.print((char)(j+96)+" ");
           }
           System.out.println();
        }
    }
}