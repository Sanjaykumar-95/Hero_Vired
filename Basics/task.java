import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={2,3,8,9,17,16};
        int n=ar.length;
        int k=3;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=ar[j];
            }
            al.add(sum);
        }
        for(int ele:al) System.out.print(ele+" ");
    }
}