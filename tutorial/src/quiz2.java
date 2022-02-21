import java.util.Scanner;

public class quiz2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer");
        int a= input.nextInt();
        System.out.println("please enter integer more than first one");
        int b = input.nextInt();

        for (int i=a; i<=b;i++){
            System.out.println(i);

        }


    }
}
