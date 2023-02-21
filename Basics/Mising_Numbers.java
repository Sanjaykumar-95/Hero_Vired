import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int ar[]=new int [n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();

        Map<Integer,Integer> hm=new HashMap<>();
        for(int ele:ar) hm.put(ele,1);

        Arrays.sort(ar);
        int num=ar[ar.length-1];

        for(int i=1;i<=num;i++){
            if(hm.get(i)==null) System.out.print(i+" ");
        }
    }
}