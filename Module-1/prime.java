import java.util.Scanner;

class prime {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of primes: ");
        int n = scan.nextInt();
        int count = 0;
        int number = 2;
        while(count < n){
            if(isPrime(number)){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        scan.close();
    }
    public static boolean isPrime(int num){
        if(num <=1 ){
            return false;       
        }   
        for(int i=2; i <= Math.sqrt(num); i++){
            if(num % 2 == 0){
                return false;
            }
        }
        return true;
    }
}