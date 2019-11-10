/*
import java.util.Scanner;

public class Course110902 {

    public static String str(String s1,String s2){
        if(s1==null){
            return s2;
        }
        if(s2==null){
            return s1;
        }

        int c=(s1.length()>s2.length())?s1.length():s2.length();
        char[] s3 = new char[c];
        //String s3=new String();
        for(int i=0;i<s2.length()-1;i++){
            int a=s2.charAt(i);
            for(int j=0;j<s1.length()-1;j++){
                int b=s1.charAt(j);
                if(a!=b){
                    for(int k=0;k>0;k++){
                        s3[k]=s1.charAt(j);
                    }
                }
            }
            s1=new String(s3);
        }
        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个字符串，s1和s2：");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(str(s1,s2));
    }
}
*/
import java.util.Scanner;
public class Course110902 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String pattern = "[" + s2 + "]";
            String result = s1.replaceAll(pattern, "");
            System.out.println(result);
        }
    }
}