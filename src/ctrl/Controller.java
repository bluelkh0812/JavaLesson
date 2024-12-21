package ctrl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //조건문
        /* 첫번째
         *  if ( 조건식 ) {
         *   // 지역(LOCAL)
         *   조건식이 참인경우 실행된 명령문 1
         *   조건식이 참인경우 실행된 명령문 2
         *   조건식이 참인경우 실행된 명령문 3
         *   ...
         * }
         * */

//        /**
//         * if ( 조건식 ) {
//         *  조건식이 참인경우 실행할 명령문들...
//         *  } else {
//         *   조건식이 거짓인경우 실행할 명령문들...
//         */

        // 콘솔로부터 입력받을 수 있는 입력 객체를 생성한다.
        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요 >>> ");
        //int number = sc.nextInt(); // 콘솔로부터 정수를 입력받아 number라는 변수에 대입

        // number를 판단하여 출력 여부를 결정한다.
//        if (number % 2 == 0) {
//            System.out.println("입력한값 " + number + "는 짝수입니다.");
//
//        }

//        if (number % 2 == 0) {
//            System.out.println("입력한값 " + number + "는 짝수입니다.");
//        } else {
//            System.out.println("입력한값 " + number + "는 홀수입니다");
//        }

        // 응용문제
        //임의의 정수를 입력받아서 해당 정수가 6의 배수인지 판단하여 출력하는 프로그램을 작성하세요

        // 숫자를 입력하세요 >>> 36
        // 입력한 값 36은 6의 배수입니다.
        // 숫자를 입력하세요 >>> 35
        // 입력한 값 35는 6의 배수가 아닙니다.

        // 응용문제 2
        // 국어, 역사 두 과목의 시험 점수를 입력 받아서,
        // 두 과목의 평균 값이 60점 이상이면 합격, 미만이면 불합격을 출력하세요

        // 출력형식 {
        // 국어 점수를 입력하세요 >>> 80
        // 역사 점수를 입력하세요 >>> 80
        // 평균은 80.0입니다, 합격입니다,


        // 국어 점수를 입력하세요 >>> 50
        // 역사 점수를 입력하세요 >>> 50
        // 평균은 50.0입니다, 불합격입니다,

//        int kor;  // 국어 점수
//        int hist; // 역사 점수
//        int total; // 총점
//        float avg; // 평균
//
//        System.out.println("국어 점수를 입력하세요 ");
//        kor = sc.nextInt();
//
//        System.out.println("역사 점수를 입력하세요 ");
//        hist = sc.nextInt();
//
//        total = kor + hist; // 총점을 구한다.
//        avg = total / 2.0F;
//        if ( avg >= 60.0F ) {
//            System.out.println("평균은 " + avg + "점 입니다.", "합격입니다.");
//        } else {
//            System.out.println("평균은 " + avg + "점 입니다.", "불합격입니다.");
//        }


//        Scanner sc = new Scanner(System.in);


//        if (number % 6 == 0) {
//            System.out.println("입력한 값 " + number + "는 6의 배수입니다.");
//        } else {
//            System.out.println("입력한 값 " + number + "는 6의 배수가 아닙니다.");
//        }

        // 응용문제 3
        // 키를 입력받아서 120.0cm 이상이면 놀이기구 탑승 가능, 미만이면 탑승 불가를 출력하세요.
        //
        // 키를 입력하세요 >>> 177.6
        // 놀이기구 탑승 가능

        // 키를 입력하세요 >>> 113.5
        // 놀이기구 탑승 불가
//        System.out.println("키를 입력하세요 >>>");
//        // 변수
//        float height;
//        height = sc.nextFloat();
//        if height >= 120.0f

        // 지하철 요금 계산기
        // 일반(19세 이상 65세 미만) : 1500 원
        // 청소년(14세 이상 19세 미만) : 1000원
        // 어린이(8세 이상 14세 미만) : 500원
        // 유아(0 ~ 7세) : 0원
        // 어르신(65세 이상) : 0원

        int age;
        age = sc.nextInt();

        if (age >= 65) {
            System.out.println("지하철 요금은 0원입니다");

        } else if (age >= 19 && age < 65) {
            System.out.println("지하철 요금은 1500원입니다.");
        } else if (age >= 14 && age < 19) {
            System.out.println("지하철 요금은 1000원입니다.");
        } else if (age >= 8 && age < 14) {
            System.out.println("지하철 요금은 500원입니다.");
        } else {
            System.out.println("지하철 요금은 0원입니다.");

        }

        // switch ~ case
        /*
        switch ( 변수 )
        {
        case 값1 : {
            변수의 값이 1일때 실행할 명령문들...
        }
        case 값2: {
            변수의 값이 2일때 실행할 명령문들...
        }
        case 값3 : {
            변수의 값이 3일때 실행할 명령문들...
         }
         */

        System.out.println("1, 돈까스");
        System.out.println("2, 냉면");
        System.out.println("3, 김밥");
        System.out.println("4, 순대");
        System.out.println("5, 어묵");
        System.out.println("6, 안시킴");

        System.out.println("메뉴 번호를 선택하세요 >>>");
        int menu = sc.nextInt();

        switch (menu) {
            case 1: {
                System.out.println("냉면 주문 완료했습니다.");
                // break;
            }

            case 2: {
                System.out.println("냉면 주문 완료했습니다.");
                // break;
            }

            case 3: {
                System.out.println("김밥 주문 완료했습니다.");
                // break;

            }

            case 4: {
                System.out.println("순대 주문 완료했습니다.");
                // break;

            }

            case 5: {
                System.out.println("어묵 주문 완료했습니다.");
                // break;

            }

            // 1~5에 해당하지 않는 경우
            default: {
                System.out.println("주문을 안하고 그냥 나가겠습니다.");
                // break;
            }
        }


        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}
