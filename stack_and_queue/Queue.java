import java.util.*;
class main{
    public static void push(int value,ArrayList<Integer> queue){
        queue.add(value);
    }

    public static void printQueue(ArrayList<Integer> queue){
        for(int ele:queue) System.out.print(ele+" ");
    }

    public static int top(ArrayList<Integer> queue){
        return queue.get(0);
    }

    public static void pop(ArrayList<Integer> queue){
        if(queue.size()==0){
            System.out.println("Queue is Empty");
        }
        else System.out.println("Removed Value is"+queue.remove(0));
    }

    public static void printSize(ArrayList<Integer> queue){
        System.out.println(queue.size());
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        push(1,al);
        push(2,al);
        push(3,al);

        printQueue(al);
        System.out.println();
        printQueue(al);
        System.out.println();
        System.out.println(top(al));
        
        pop(al);
        System.out.println();
        printQueue(al);
        System.out.println();
        printSize(al);
    }
}