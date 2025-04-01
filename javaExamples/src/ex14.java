public class ex14 {
    public static void main(String[] args) {
        //반복문 for while do-while
        // * JS문법과 거의 유사함.

        //패턴
        //for( 초기화; 조건; 증감 ) {
        //   실행문;
        //}
        for( int i=0; i<5; i++){
            System.out.println("i = " + i);
        }

        //무한반복문 만드는 법
        //for(;;){}
        //while (true){}

        //1부터 100사이의 3의 배수만 출력하시오.
        for(int i=1; i<100; i++){
            if( i%3 == 0 ){
                System.out.println("i = " + i);
            }
        }
        //디버깅 잘하려면? 삽질이 많이 해봐야 된다.
        //책. 클린코드
        //1. 로그를 잘 찍어본다.
        //2. 간략하게 코드를 만들어 본다. 줄인다.
        //3. 런타임 디버거를 사용해 본다.
        //4. 컴퓨터 꼈다 켠다.
        //5. 간단한 샘플을 만들어 테스트 해본다.


        //런타임 디버깅 사용법
        //*반복문에서 코드의 흐름을 파악하거나, 변수의 값을
        //확인하는 용도로 사용.
        //*print문만으로 전체 맥락을 파악하기 어려울때 사용.
        //실행 > 디버그 (Shift + F9) 기능 이용
        //Break Point(중단점)을 설정한다. CTRL + F8
        //스텝오버(F8) : 다음 줄로 이동
        //스텝인투(F7) : 함수 안으로 이동
        //다시시작(F9) : 계속해서 진행(Resume)
        //스텝아웃(SHIFT+F8) : 함수 밖으로 이동


    }
}