import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int score = s.nextInt();

        if(score>90)
            System.out.print("A입니다.");
        else if(score>80)
            System.out.print("B입니다.");
        else if(score>70)
            System.out.print("C입니다.");
        else if(score >60)
            System.out.print("조금 더 노력하세요");
        
        s.close();
    }
}
