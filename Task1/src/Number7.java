import java.util.Scanner;

public class Number7
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number");
        while (true){
            number = input.nextInt();
            if(number > 7) {
                System.out.println("Привет");
                break;
            }
            else {
                System.out.println("Попробуйте еще раз");
            }
        }
    }
}

