// Check for a magic number in a single line
import java.util.*;
class MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int number = in.nextInt();
        if(number%9==1){
            System.out.println("Magic number");
        }else{
            System.out.println("Not a Magic number");
        }
        in.close();
    }
}