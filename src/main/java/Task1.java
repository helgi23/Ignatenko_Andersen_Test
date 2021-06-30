import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        number_7();
    }

    private static void number_7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Неправильное число");
            number_7();
        }
        in.close();
    }
}
