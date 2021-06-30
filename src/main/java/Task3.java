public class Task3 {


    public static void main(String[] args) {
        multipleOf_3();
    }

    private static void multipleOf_3() {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) + 1);
            System.out.println(array[i]);
        }
        System.out.println("Числа кратные '3': ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }


}


