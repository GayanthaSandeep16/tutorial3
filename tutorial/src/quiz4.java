public class quiz4 {
    public static void main(String[] args){
        int num1=1;
        int num2=1;
        int count=10;
        int num3;
        System.out.print(num1+" "+num2);

        for (int n=2;n<count;n++){
            num3 = num1+num2 ;
            System.out.print(" "+num3);
            num1= num2;
            num2=num3;

            }
        }
    }

