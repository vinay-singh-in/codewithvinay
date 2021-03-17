import java.util.*;
class Mobius{
    private int N, product,temp, factorCount;
    private boolean duplicateFound;
    private String primeFactors;
    public Mobius(int N){
        this.N = N;
        product=1;
        primeFactorization();
    }
    public void primeFactorization(){
        temp=N;
        duplicateFound=false;
        factorCount=0;
        primeFactors=N+" = ";
        int divisor=2, half=N/2;
        factorize(divisor);
        for(divisor=3; divisor<=half; divisor+=2){
            factorize(divisor);
        }
    }
    public void factorize(int divisor){
        int currentFactorCount=0;
        while(temp%divisor==0){
            primeFactors+=divisor+" x ";
            temp/=divisor;
            currentFactorCount++;
            factorCount++;
            product*=-1;
        }
        if(duplicateFound==false){
            duplicateFound = currentFactorCount>1;
        }
    }
    public int getMobius(){
        if(N==1)return 1;
        if(duplicateFound) return 0;
        return product;
    }
    public String toString(){
        primeFactors = primeFactors.substring(0, primeFactors.length()-2);
        String output="\t"+primeFactors+"\n\t";
        if(N==1){
            output="\t1 = 1\n\tNO PRIME FACTORS";
        }else if(duplicateFound){
            output+="DUPLICATE  PRIME  FACTORS";
        }else{
            output+="NUMBER OF DISTINCT PRIME FACTORS = "+factorCount;
        }
        output+="\n\tM("+N+") = "+getMobius();
        return output;
    }
}
class ISC2021SpecimenQ3{
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.print("INPUT:\t");
        int N = in.nextInt();
        Mobius obj = new Mobius(N);
        System.out.println(obj);
        in.close();
    }
}