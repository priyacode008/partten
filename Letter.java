
public class Letter{
    public static void main(String[] args){
        
        int i,j,r=5,c=4;
       
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