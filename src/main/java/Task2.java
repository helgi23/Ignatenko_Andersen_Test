import java.util.Scanner;

public class Task2 {

    static String NAME = "Вячеслав";

    public static void main(String[] args) {
        nameChecker();
    }

    private static void nameChecker() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        if (name.equals(NAME)) {


            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
            nameChecker();
        }
        in.close();
    }
}
