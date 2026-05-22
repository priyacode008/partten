import java.util.*;
class Numer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,j;
        System.out.println("enter the value");
        n=sc.nextInt();
        System.out.println("the matrix format");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}