import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("나이를 입력하세요. : ");
        int age = s.nextInt();

        if((age>=20)&&(age<30))
            System.out.print("20대 입니다.");
        else
            System.out.print("20대가 아닙니다.");
        s.close();
    }
}
