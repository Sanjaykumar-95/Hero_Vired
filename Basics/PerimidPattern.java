import java.util.*;
class PerimidPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1,b=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<b;k++){
                System.out.print("*");
            }
            b+=2;
            space--;
            System.out.println();
        }
    }
}