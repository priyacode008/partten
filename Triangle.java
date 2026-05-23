import java.util.*;
class Triangle{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int i,j,r,c;
        System.out.println("enter the row");
        r=sc.nextInt();
        System.out.println("enter the column");
        c=sc.nextInt();
        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){
                if(i==1&& j==3)
                    System.out.print("1");
                else if(i==2&& j==2)
                    System.out.print("2");
                else if(i==2&& j==4)
                    System.out.print("3");
                else if(i==3&& j==1)
                    System.out.print("4");
                else if(i==3&& j==3)
                    System.out.print("5");
                else if(i==3&& j==5)
                    System.out.print("6");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}