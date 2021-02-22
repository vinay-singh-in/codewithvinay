//How to time your code in Java?
class MeasureTime{
    public static void main(String[] args) {
        int N=123456789;
        int count=0;
        long t1,t2;
        t1=System.nanoTime();
        for( int temp=N; temp>0; temp/=10){
            count++;
        }
        t2=System.nanoTime();
        System.out.println("Number of Digits: "+count);
        System.out.println("Elapsed time: "+(t2-t1)+" nano seconds");
        t1=System.nanoTime();
        count=(""+N).length();
        t2=System.nanoTime();
        System.out.println("Number of Digits: "+count);
        System.out.println("Elapsed time: "+(t2-t1)+" nano seconds");
    }
}