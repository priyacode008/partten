import java.util.*;
class Num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("enter the value");
        n=sc.nextInt();
        System.out.println("the matrix format:");
        for(i=1;i<=n;i++){
           for(j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}