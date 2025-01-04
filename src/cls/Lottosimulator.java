package cls;

public class Lottosimulator {
    public static void main(String[] args) {
        WinLotto win = new WinLotto();
        System.out.println( "당첨번호 : " + win );  // 당첨 번호 출력

        int[] arr = new int[5];
        Lotto[] users = new Lotto[5];
        for(int i=0; i<5; i++) {
            users[i] = new Lotto();
            System.out.println( "구매번호 : " + users[i] );

            int rank = win.checkLotto(users[i]);
            System.out.println(users[i]);
        }

        Lotto user = new Lotto();   // 5줄
        System.out.println( user );

        int rank = win.checkLotto(user);
        System.out.printf("%d 등\n", rank);

        // win.print();
//
//        String str = win.toString();
//        System.out.println( str );
//        System.out.println( win );

    }
}
