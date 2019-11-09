import java.util.*;

public class Course110702 {
    //暴力法
    public static int count(int[] A, int n) {
        if (A == null || n == 0) {
            return 0;
        }
        return num(A,n);
    }

    public static int num(int[] A,int n){
        int count=0;
        if(A==null || n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入 n 的值：");
        int n=input.nextInt();
        System.out.println("请输入数组A：");
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=input.nextInt();
        }
        System.out.println("请输入开始地址：");
        int p=input.nextInt();
        System.out.println("请输入结束地址：");
        int q=input.nextInt();
        System.out.println("逆序对个数："+count(A,n));
    }
}
