import java.util.*;

import javax.lang.model.util.SimpleElementVisitor14;
class Byte{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("enter the value");
        n=sc.nextInt();
        System.out.println("the matrix format:");
        for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
            if((i+j)%2==0)
                System.out.print("1");
            else
                System.out.print("0");
            }
            System.out.println(" ");
        }
    }
}