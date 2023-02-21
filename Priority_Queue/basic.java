import java.util.*;
class sample{
    public static void printList(PriorityQueue<Integer> pq){
        for(int ele:pq){
            System.out.print(ele+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(9);
        pq.add(-1);
        pq.add(-10);
        pq.add(50);

        printList(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}