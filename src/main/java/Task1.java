import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        number_7();
}

    private static void number_7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num > 7){

            System.out.println("Привет");

        }else{
            System.out.println("Your number is wrong!");
            number_7();
        }
        in.close();
    }
}
