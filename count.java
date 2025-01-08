import java.util.*;
public class count {
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum1=0;
        while (a>0){
            //int d=a%10;
            sum1=sum1+1;
            a=a/10;
        }
        System.out.print(sum1);
    }
    public static void main(String[]args){
        sum();
    }

}
