import java.util.Scanner;

public class Rightname {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        while (true){
            String name = input.nextLine();
            if(name.equalsIgnoreCase("вячеслав")) {
                System.out.println("Привет Вячеслав");
                break;
            }
            else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
