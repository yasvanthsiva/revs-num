import java.util.*;
public class factorial {
public static void main(String[]args){
    System.out.print(sum());
}
public static int sum(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int s=1;
    if(a>0){
    for(int i=1;i<=a;i++){
            s=s*i;
        }
        //return s+d;
    }
    
    return s;
} 
}


