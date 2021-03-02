// How to check for a Prime
class Prime{
    public static boolean isPrime(int n){
        if(n<2) return false;
        else if(n==2) return true;
        else if(n%2==0) return false;
        else{
            int limit=(int)Math.sqrt(n);
            for( int divisor=3; divisor<=limit; divisor+=2){
                if(n%divisor==0){
                    return false;
                }
            }
            return true;
        } 
    }
    public static void main(String[] args) {
        System.out.println(isPrime(30)); //false
        System.out.println(isPrime(101)); //true
    }
}