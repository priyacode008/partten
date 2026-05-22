import java.util.*;
class Alphapet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
     System.out.println("enter the value");
     n=sc.nextInt();
     System.out.println("the matrix format");
     for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.print((char)(j+64)+" ");
        }
        System.out.println();
     }
    }
}