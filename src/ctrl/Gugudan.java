package ctrl;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        int dan = 2;

        while(dan < 10) {
            i = 1;
            System.out.printf("%d단", dan);
            while (i < 10) {
                System.out.printf("dan x %d = %d\n", dan, i, dan * i);
                i += 1;
            }

            System.out.println();
            dan += 1;
        }

    }
}