import java.util.Scanner;

public class Course110701 {
    public static int drink(int n){
        int total=0;
        while(n>2){
            total=total+n/3;
            n=n/3+n%3;
        }
        if(n==2){
            total+=1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        while(input.hasNext()){//连续输入
            n=input.nextInt();
            System.out.println(drink(n));
        }
    }
}
