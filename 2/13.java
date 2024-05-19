import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("점수를 입력하세요(0-100)");
        System.out.println("학년을 입력하세요(1-4)");

        int score = s.nextInt();
        int grade = s.nextInt();
        String pass;
        
        if(score>=60)
            if(grade==4)
                pass=((score>=70)?("합격 입니다."):("불합격 입니다."));
            else
                pass="합격입니다.";
        else
            pass="불합격 입니다.";
         
	System.out.print(pass);

        s.close();
    }
}
