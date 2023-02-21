import java.util.*;
class palindrome{
    public static boolean isPalidrome(String s,int i,int j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        else if(i>=j) return true;
        i++;
        j--;
        return isPalidrome(s,i,j);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st="abcba";
        if(isPalidrome(st,0,st.length()-1)) System.out.println("Is a Palindrome");
        else System.out.println("Is not a Palindrome");
    }
}