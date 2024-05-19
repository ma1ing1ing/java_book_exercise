import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.println("초단위의 정수를 입력하세요");
        int sec = a.nextInt();
        int s = sec%60;
        int m =(sec/60)%60;
        int h = sec/3600;

        System.out.print(+sec+"초는 "+h+"시간, "+m+"분, "+s+"초 입니다.");
        
        a.close();
    }
}
