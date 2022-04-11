import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double i, count = 0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number=");
        i = input.nextInt();

        for (int k = 0; k <= i; k++) {
            if (k % 3 == 0 && k % 4 == 0) {
                count++;
                total += k;
            }

        }double avarge=(total / count);
        System.out.println("Number avarge =" + avarge);


    }

}
