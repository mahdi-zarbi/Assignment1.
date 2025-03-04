
import java.util.Scanner;

public class  practice_number{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number: ");
        int sum=0;
        int num = scanner.nextInt();
        scanner.close();

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("number "+num+" is perfect");
        }else{
            System.out.println("number "+num+" is not perfect");
        }
    } 
}
