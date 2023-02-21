import java.util.*;
class sample{
    public static char removed(String s){
        if(s.length()==0) System.out.println("0");
        return s.charAt(s.length()-1);
    }
    public static char top(String s){
        if(s.length()==0) System.out.println("0");
        return s.charAt(0);
    }
    public static boolean Paranthesis(String s,int i,int j,int open,int close){
        if(i==j || i>j){
            if(open==close) return true;
            else return false;
        }
        if(top(s)=='(' || removed(s)=='(') open+=1;
        if(top(s)==')' || removed(s)==')') close+=1;
        s=s.substring(i+1,s.length()-j-1);
        return Paranthesis(s,i+1,j-1,open,close);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Paranthesis(s,0,s.length(),0,0));
    }
}