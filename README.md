//import java.util.*;
public class Main{
    public static void main(String[]args){
        //Scanner sc=new Scanner(System.in);
        int c=sum();
        System.out.print(c);
    }
    public static int sum(){
        int a=123;
        int sum=0;
        while(a>0){
            int d=a%10;
            sum=sum*10+d;
            a=a/10;
            //return sum;
            
        }
         return sum;
    }
}
