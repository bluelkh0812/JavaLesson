package ctrl;

public class Loops5 {
    public static void main(String[] args) {
        // for()문
        // for(초기식; 조건식; 증감식) {
        //      반복실행할 명령문들...
        //      ...
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i += 2)
            System.out.println("i의 값 : " + i);

        int total = 0;
        for (int i = 1; i <= 10; i++)
            total += 1;
        {
            System.out.println("total = " + total);
        }
        total = 0;
        for (int i = 1; i < 10; i += 2) {
            total += i;
        }
        System.out.println("total = " + total);

    }
}
