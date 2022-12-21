import java.util.Random;

public class Array {

    public static void main(String[] args){
        System.out.println("Имеем массив:");
        Random randI = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randI.nextInt(100);
            System.out.print(myArray[i]+";");
        }
        System.out.println('\n' + "Числа кратные трем:");
        for (int j : myArray) {
            if (j % 3 == 0)
                System.out.print(j + ";");
        }
    }

}
