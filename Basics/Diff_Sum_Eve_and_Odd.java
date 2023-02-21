import java.util.*;
class sampe{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int ev=0,odd=0;
        for(int ele:ar){
            if(ele%2==0) ev+=ele;
            else odd+=ele;
        }
        System.out.println(Math.abs(ev-odd));
    }
}