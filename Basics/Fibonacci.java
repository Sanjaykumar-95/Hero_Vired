import java.util.*;
class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f0=0,f1=1,f2=0;
        System.out.print(f0+" "+f1+" ");
        while(f2<=n){
            f2=f0+f1;
            System.out.print(f2+" ");
            f0=f1;
            f1=f2;
        }
    }
}