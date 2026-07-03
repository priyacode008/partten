
public class Zoho{
    public static void main(String[] args){
        int i,j,r=5,c=20;


        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){

                if(i==1 && (j==1||j==2||j==3||j==4||j==5||j==7||j==8||j==9||j==10||j==12||j==15||j==17||j==18||j==19||j==20))
                    System.out.print("*");

                else if(i==2 && (j==4||j==7||j==10||j==12||j==15||j==17||j==20))
                    System.out.print("*");
                else if(i==3 && (j==3||j==7||j==10||j==12||j==13||j==14||j==15||j==17||j==20))
                    System.out.print("*");
                else if(i==4 && (j==2||j==7||j==10||j==12||j==15||j==17||j==20))
                    System.out.print("*");
                else if(i==5 && (j==1||j==2||j==3||j==4||j==5||j==7||j==8||j==9||j==10||j==12||j==15||j==17||j==18||j==19||j==20))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}