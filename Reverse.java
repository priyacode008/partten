import java.util.*;
class Reverse{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("ennter the value");
        n=sc.nextInt();
        System.out.println("the matrix format:");
        for(i=0;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}