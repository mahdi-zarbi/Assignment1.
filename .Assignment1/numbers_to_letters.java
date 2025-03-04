import java.util.Scanner;

public class numbers_to_letters {

    public static int yekan(int number){   //اعداد بین ۱تا۹
        switch(number){
            case 1:System.out.print("one");break;
            case 2:System.out.print("two");break;                                     
            case 3:System.out.print("three");break; 
            case 4:System.out.print("four");break;  
            case 5:System.out.print("five");break; 
            case 6:System.out.print("six");break; 
            case 7:System.out.print("seven"); break; 
            case 8:System.out.print("eight");break; 
            case 9:System.out.print("nine");break;            
        }
        return 0;
    }

    public static int dah(int number){    //اعداد بین ۱۰ تا ۱۹
        switch(number){
            case 0:System.out.print("ten");break;
            case 1:System.out.print("eleven");break;
            case 2:System.out.print("twelve");break;                                     
            case 3:System.out.print("thirteen");break; 
            case 4:System.out.print("fourteen");break;  
            case 5:System.out.print("fifteen");break; 
            case 6:System.out.print("sixteen");break; 
            case 7:System.out.print("seventeen"); break; 
            case 8:System.out.print("eighteen");break; 
            case 9:System.out.print("nineteen");break;
        }
        return 0;
    } 

    public static int dahgan(int number){    //اعداد بین ۲۰ تا ۹۹
        switch(number){
            case 2:System.out.print("twenty-");break;                                     
            case 3:System.out.print("thirty-");break;
            case 4:System.out.print("forty-");  break;
            case 5:System.out.print("fifty-"); break;
            case 6:System.out.print("sixty-"); break;
            case 7:System.out.print("seventy-");  break;
            case 8:System.out.print("eighty-");break;
            case 9:System.out.print("ninety-");break;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter number : ");
        int number= scanner.nextInt();
        scanner.close();
        int num=0;
        int fake=number;
        while(fake!=0){          //تشخیص مرتبه عدد
            fake/=10;
            num++;
        }

        switch(num){
                
            case 5:                         //اعداد ۵ رقمی
                switch(number/10000){
                    case 1:dah(number/10000%10);break;
                    default:dahgan(number/10000);
                        if(number/10000<10||number/10000>19){
                            yekan(number/1000%10);
                        }
                }
                System.out.print(" thousand ");
                yekan(number/100%10);
                System.out.print(" hundred ");
                if(number%100<10||number%100>19){
                    dahgan(number/10%10);
                    yekan(number%10);
                }else{
                    dah(number%100);
                }               
            break;
        

            case 4:                       //اعداد ۴ رقمی
                yekan(number/1000);
                System.out.print(" thousand ");
                yekan(number/100%10);
                System.out.print(" hundred ");
                if(number%100<10||number%100>19){
                    dahgan(number/10%10);
                    yekan(number%10);
                }else{
                dah(number%100);
                }               
            break;

            case 3:                      //اعداد ۳ رقمی
                yekan(number/100%10);
                System.out.print(" hundred ");
                if(number%100<10||number%100>19){
                    dahgan(number/10%10);
                    yekan(number%10);
                }else{
                    dah(number%100);
                }               
                break;

            case 2:                       //اعداد ۲ رقمی
                if(number%100<10||number%100>19){
                    dahgan(number/10%10);
                    yekan(number%10);
                }else{
                    dah(number%100);
                }               
                break;

            case 1:                       //اعداد تک رقمی
                yekan(number%10);
                break;                            
            }
        System.out.println("\n"); 
    } 
}