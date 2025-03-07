public class prime-number{
    public static void main(String[] args)  {
        for(int i=2; i<=100; i++){
            boolean number_is_Prime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    number_is_Prime = false;
                }
            }
            if(isPrime == true){
                System.out.println(i+"is a prime number");
            }
        }
    }
}