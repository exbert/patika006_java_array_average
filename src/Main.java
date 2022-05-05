public class Main {
    public static void main(String[] args) {

        int[] list = {15, 6, 7, 12, 7, 9, 3};
        double average = 0.0;

        for (int i = 0; i < list.length; i++) {
            average += list[i];
        }

        average = average / list.length;

        System.out.println("Average is : " + average);
    }
}
