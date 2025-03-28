public class ex03 {
    public static void main(String[] args) {
        //데이터 타입(자료형)
        //기본자료형 8개
        //정수형 : int(4) long(8) short(2) byte(1)
        //실수형 : float(4) double(8)
        //논리형 : boolean(1)
        //문자형(내부적으로 숫자형) : char(2)
        int myInt = 10;
        System.out.println( myInt );
        long myLong = 20L; //L long 리터럴로 초기화
        System.out.println( myLong );
        short myShort = 30;
        System.out.println( myShort );
        byte myByte = 40;
        System.out.println( myByte );

        //실수형
        //float 4 double 8
        float myFloat = 6.14f; //float 리터럴 초기화
        double myDouble = 3.14d; //double 리터럴 초기화
        System.out.println( myFloat );
        System.out.println( myDouble );

        //논리형
        boolean myBool = true;
        System.out.println("myBool = "+ myBool);

        //문자형char
        char myChar='가';
        System.out.println("my Char = "+myChar);
        //정수형으로 변환이 가능하다.
        System.out.println( (int)myChar ); //44032 0xAC00
        System.out.println( (char)0xAC00 ); //가
        //문자코드표 - 아스키코드표, 유니코드표
        System.out.println( (char)65 );
        System.out.println( (int)'A' );

        //문자열형 String
        String myString = "가나다";
        System.out.println("myString = " + myString);

    }
}
