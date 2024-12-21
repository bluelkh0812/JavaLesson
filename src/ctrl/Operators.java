package ctrl;

public class Operators {
    public static void main(String[] args) {

        int sum = 0;

        int a = 10;
        int b = 3;

        float f1 = 10.0f;
        float f2 = 3.0f;
        float result;

        result = f1 / f2;
        System.out.println("result = " + result);

        result = f1 % f2;
        System.out.println("result = " + result);

        result = f1 / b;
        System.out.println("result = " + result);

        result = (float) a / b;
        System.out.println("result = " + result);

        //result = a + b - f1 * f2;

        //국어: 88, 수학 : 79, 영어 : 97 <--- 이 자료형들을 정수형 변수로 출력하세요

        a = -b; //부호를 바꾼다
        System.out.println("a의 값 : " + a);

        a = +a; //부호를 바꾼다
        System.out.println("a의 값: " + a);

        a = 10;
        sum = 0;
        sum += a;
        System.out.println("sum " + sum);

        sum -= a;  // sum = sum -a;
        System.out.println("sum " + sum);

        sum *= a;  // sum = sum *a;
        System.out.println("sum " + sum);

        sum /= a;  // sum = sum /a;
        System.out.println("sum " + sum);

        sum %= a;  // sum = sum %a;
        System.out.println("sum " + sum);

        // 관계(비교) 연산자
        a = 10;
        b = 3;

        boolean res;
        res = a > b;
        System.out.println("a > b의 결과 : " + res);

        res = a <= b;
        System.out.println("a <= b의 결과 : " + res);

        res = a == b;
        System.out.println("a == b의 결과 : " + res);

        res = a >= b;
        System.out.println("a >= b의 결과 : " + res);

        // 논리 연산자 : &&(AND), ||(OR), !(NOT)
        boolean flag1 = a > b;  // true
        boolean flag2 = a == b; // fales
        res = flag1 && flag2;  // true && false ===>
        System.out.println( flag1 + " && " + flag2 + " ==> " + res);

        res = flag1 || flag2;   // true && true ===>
        System.out.println(flag1 + " || " + flag2 + " ==> " + res);

        res = !flag1;
        System.out.println(" || " + flag1 + " ==> " + res);

        a = 10;
//        a++;     // a += 1, a = a + 1, Post fix
//        a--;     // a -= 1, a = a - 1 
//        ++a;     // a += 1, a = a + 1, Pre fix
//        --a;     // a -= 1, a = a - 1
        System.out.println(a++);
        System.out.println(++a);
        
        // 콘솔로부터 값 입력받기
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a에 들어갈 값을 입력하세요 >>> ");
//        a = sc.nextInt();  // int형 정수를 콘솔로부터 입력받아서 변수 a에 대입하기
//        sc.close();
//        b = a % 10; // 1의 자리를 구하는 연산
//        System.out.println("a의 값: " + a);
//        System.out.println("a의 1의자리의 값 : " + b);
//
//        // 삼항 연산자
//        String strOut = "";
//
//
//        strOut = a % 2 == 0 ? "짝수" : "홀수";    // 조건식 ? 조건식이 참일때 : 조건식이 거짓일때;
//        System.out.println(a + "는 " + strOut + "입니다.");
//
//        sc.close();

        // 기타 연산자 : instanceof
       // flag1 = strOut instanceof String;


        // 비트 연산자 : &, |, ", <<, >>
        a = 3;   //   0011
        b = 5;   // & 0101
        //            0001
        sum =  a & b;
        System.out.println("a & b : " + sum);

        sum =  a | b; // 0111
        System.out.println("a | b : " + sum);

        sum = ~a;  // 0011 --> 1100
        System.out.println("~a : b : " + sum);



    }
}
