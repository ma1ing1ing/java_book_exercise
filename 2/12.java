import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int score = s.nextInt();
        char grade;

        if(score>=90)
            grade='A';
        else if(score>=80)                
            grade='B';
        else
            grade='c';
        
        if(score<60)
            System.out.print("조금 더 노력하세요");
        else
            System.out.print("학점은 "+grade+"입니다.");
            
        s.close();
    }
}
