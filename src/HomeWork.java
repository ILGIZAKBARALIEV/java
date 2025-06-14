import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String MyName;
        final int NUM = 85;
        String Word = "My Working File";
        MyName = Word+NUM;
        System.out.println(NUM+MyName);
        if (NUM > 0) {
            System.out.println("negativeNumber");
        }else if (NUM < 0) {
            System.out.println("positiveNumber");
        }else{
            System.out.println("the number is 0");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name=sc.nextLine();
        System.out.print("Hi"+MyName);


    }
}