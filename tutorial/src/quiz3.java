import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Enter a letter");
        char let=input.next().charAt(0);

        for (int i=num; i>0;i--){
            System.out.print("output: "+let);
        }
    }
}
