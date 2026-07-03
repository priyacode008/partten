
public class Add{
    public static void main(String[] args){

        int i,j,n=5,v=0;
        
        System.out.println("the matrix format:");
        for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
            v++;
                System.out.print(v);
            }
            System.out.println(" ");
        }
    }
}