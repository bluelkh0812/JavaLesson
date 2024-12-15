public class Loops1 {
    public static void main(String[] args) {
        // 반복문
        // while ( 조건식 )
        // {
        //      위 조건식이 참(true)일때 실행되는 명령문들...
         // }

        int i = 0;
        while ( i < 5 ) {
            System.out.println("i의 값 : " + i );
            // i = i + 1;
             i += 1;
           // i++;

        }
        System.out.println("while 반복문 종료");

        System.out.println(i);
        i = 0;
        // i = 0
        // i = 2
        // i = 4
        // i = 6
        // i = 8
        while ( i < 10 ) {
            System.out.println("i의 값 : " + i );
            i += 2;
        }
        System.out.println("while 반복문 종료");

        i = 1;
      int total = 0; // 1 + 2 + 3 + 4 + 5 + 6 + ... + 10
        while ( i < 11 ) {
            total = total + i;
            i = i + 1;
        }
        System.out.println("total : " + total);

        // total = 1 + 3 + 5 + 7 + 9
        i = 1;
        total = 0;
        while ( i < 10 ) {
            System.out.println("i의 값 : " + i );
            total = total + i;
            i = i + 2;
        }
        System.out.println("total : " + total);
    }

}
