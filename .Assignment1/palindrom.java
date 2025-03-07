import java.util.Scanner;

public class palindrom{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter number : ");
        int number=scanner.nextInt();
        scanner.close();
        int fake=number,num2=0;
        while(fake!=0){
            int baghi=fake%10;
            num2=(num2*10)+baghi;
            fake/=10;
        }

        if(num2==number){
            System.out.println("number "+num2+ " is palindrom");
        }
        else{
            System.out.println("number "+number+" is not palindrom");
        }

    }
}
