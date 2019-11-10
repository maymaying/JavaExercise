import java.util.Scanner;
import java.util.Stack;

public class Course110802 {
    /*
    public static boolean chkParenthesis(String A, int n) {
        char[] a=A.toCharArray();
        int m=0;
        for(int i=0;i<A.length()-1;i++){
            char c=a[i];
            if(c=='('){
                m++;
            }else if(c==')'){
                if(m>0){
                    m--;
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
    */

    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> lefts = new Stack<Character>();
        if(A == null || A.length() != n){
            return false;
        }
        for(int i = 0; i < n; i++){
            if(A.charAt(i) == '('){
                lefts.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(lefts.empty()){
                    return false;
                }else{
                    lefts.pop();
                }
            }else{
                return false;
            }
        }
        if(!lefts.empty()){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String A=sc.nextLine();
        int n=A.length();
        System.out.println("“"+A+"”，"+n);
        System.out.println(chkParenthesis(A,n));
    }
}