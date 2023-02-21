
//push() --> It will push an element to the stack  --> It will increase the size of the stack
//pop() --> It will pop an element to the stack --> It will decrease the size of the stack
//top() --> It will return the topmost value of stack  -->--> It will not change the size of the stack
//empty() --> return true if stack length is 0 else return false

import java.util.*;
class Stack{
    public static void printStack(ArrayList<Integer> stack){
        for(int e:stack){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void push(int ele,ArrayList<Integer> stack){
        stack.add(ele);
    }

    public static int pop(ArrayList<Integer> stack){
        if(stack.size()==0){
            return Integer.MAX_VALUE;
        }
        return stack.remove(stack.size()-1);
    }

    public static int top(ArrayList<Integer> stack){
        if(stack.size()==0) return 0;
        return stack.get(0);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> stack=new ArrayList<>();
        push(2,stack);
        push(5,stack);
        push(10,stack);

        printStack(stack);
        push(1,stack);
        push(20,stack);
        push(Integer.MAX_VALUE,stack);
        printStack(stack);

        

        int removedValue = pop(stack);
        if(stack.size()==0) System.out.println("Stack is Empty");
        else System.out.println("Removed Value: "+removedValue);
        printStack(stack);

        System.out.println("Top Element:"+top(stack));
    }
}