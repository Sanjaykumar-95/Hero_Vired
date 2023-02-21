import java.util.Stack;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        System.out.println(stack.empty());
        System.out.println(stack.empty());
        stack.push(20);
        stack.push(30); 
        stack.push(40);
        stack.push(50);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}