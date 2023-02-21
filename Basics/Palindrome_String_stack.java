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


    public static boolean isValid(String s,int i,int j){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') s.push('(');
            else if(s.charAt(i)==')' && st.size()==0) return false;
            else st.pop();
        }
        return st.size()==0;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s,0,s.length()));
    }
}