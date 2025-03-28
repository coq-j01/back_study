import java.util.Arrays;
import java.util.Scanner;

public class codingtest_1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
//        자바 연습문제 - 초중급
//        // 1 알바천국
//        //알바가는 날 : 월1 수3 금5 일7
//        // 월(1) ~ 일(7)
//        System.out.print("요일 번호를 입력하시오:");
//        int day = sc.nextInt();
//        if(day == 1 || day==3 || day==5 || day ==7){
//            System.out.println("oh my god~");
//        }
//        else{
//            System.out.println("enhoy!");
//        }

        //2 로또 번호 발생기
//        int [] randnum = new int[6];
//        for(int i=0; i<6; i++){
//            randnum[i] = (int)(Math.random()*45+1);
//            System.out.print( " "+randnum[i]);
//            for(int j=0; j<i; j++) {
//                if (randnum[i] == randnum[j]) {
//                    i--;
//                    System.out.print("(중복발생! 재추첨)");
//                }
//            }
//        }
        //3 369게임
//        int endnum = sc.nextInt();
//        for(int i=1; i<=endnum; i++){
//            int Xnum = i%10;
//            if(Xnum == 3 || Xnum == 6 || Xnum == 9){
//                System.out.print("X ");
//            }
//            else System.out.print(i+" ");
//        }
        //4 컴퓨터와 함께 369게임하기
//        for(int i=1; i<=40; i++){
//            int Xnum = i%10;
//            String num;
//            if(Xnum == 3 || Xnum == 6 || Xnum == 9){
//                // 3,6,9를 X로 REPLACE하는게 더 편할 듯,,,
//                if(i/10==3 || i/10==6 ||i/10==9){
//                    num = "XX";
//                }
//                else num = "X";
//            }
//            else {
//                if(i/10==3 || i/10==6 ||i/10==9){
//                    num = "X";
//                }
//                else num = String.valueOf(i);
//            }
//            if(i%2==0){
//                System.out.print("나 : ");
//                String scannum = sc.next();
//                if(!num.equals(scannum)){
//                    System.out.println("컴퓨터 승!\n게임종료");
//                    break;
//                }
//            }
//            else{
//                System.out.println("컴퓨터 : "+num);
//            }
//            if(i==40){
//                System.out.println("무승부!\n게임종료");
//            }
//        }
        //5 텍스트 야구 게임
//        int ball;
//        int strike;
//        int out=0;
//        int count=0;
//        int go=0;
//        int i=1;
//        System.out.println("게임시작!");
//        while(true){
//            ball=0;
//            strike =0;
//            System.out.println(i+"번타자");
//            while(true){
//                Thread.sleep(1000);
//                int randball = (int)(Math.random()*2);
//                if(randball==0){
//                    System.out.println("스트라이크!");
//                    strike++;
//                }
//                else{
//                    System.out.println("볼~");
//                    ball++;
//                }
//                if(strike==3){
//                    System.out.println("삼진 아웃!");
//                    out++;
//                    break;
//                } else if (ball==4) {
//                    System.out.println("1루 진루!");
//                    go++;
//                    if(go>=4) {
//                        count++;
//                        System.out.println(count+"점");
//                    }
//                    break;
//                }
//            }
//            if(out==3) break;
//            i++;
//        }
//        System.out.println("게임종료!\n총점 : "+count+"점");
        //6 별찍기
//        System.out.print("홀 수를 입력하세요 : ");
//        int n = sc.nextInt();
//        int space = n/2;
//        for(int i=1; i<=n; i=i+2){
//            for(int j=0; j<(n-i)/2; j++) System.out.print(" ");
//            for(int k=1; k<=i; k++)System.out.print("*");
//            System.out.println();
//        }
        //7 수열의 합 Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)
//        System.out.print("임의의 정수 n(n<=50) : ");
//        int n = sc.nextInt();
//        int sum =0;
//        int lastsum;
//        for(int i=1; i<=n; i++){
//            lastsum=0;
//            for(int j=1; j<i; j++){
//                lastsum += j;
//            }
//            sum = sum + lastsum+i;
//        }
//        System.out.println("Sn = "+sum);
        //8 자리배치
        System.out.print("학생 수 : ");
        int num = sc.nextInt();
        System.out.print("자리 수 : ");
        int seat = sc.nextInt();
        sc.nextLine();
        System.out.print("학생 키 : ");
        String height = sc.nextLine();

        int[] heightarr = new int[num];
        String[] heightstr = height.split(" ");
        System.out.println(heightstr.length);
        for(int i=0; i<heightstr.length; i++){
            heightarr[i] = Integer.parseInt(heightstr[i]);

        }
       Arrays.sort(heightarr);

        for(int i=0; i<num ; i++){
            System.out.print(heightarr[i]+" ");
            if((i+1)%seat==0) System.out.println();
        }
    }
}
