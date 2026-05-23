import java.util.*;
class Letter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,r,c;
        System.out.println("enter the row");
        r=sc.nextInt();
        System.out.println("enter the column");
        c=sc.nextInt();
        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){
                if(i==1&& (j==1||j==4))
                    System.out.print("*");
                else if(i==2&& (j==1||j==3))
                    System.out.print("*");
                else if(i==3&& j==1)
                    System.out.print("*");
                else if(i==4&& (j==1||j==3))
                    System.out.print("*");
                else if(i==5&& (j==1||j==4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}