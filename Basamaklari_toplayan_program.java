import java.util.Scanner;
public class Basamaklari_toplayan_program {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=inp.nextInt();
        int tempNumber=number;
        int basValue,total=0;

        while(tempNumber!=0){
            basValue=tempNumber%10;
            total=basValue+total;
            tempNumber/=10;
        }
        System.out.println("Sum of the your number digits is:"+total);
    }
}



