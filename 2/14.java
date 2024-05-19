import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("월(1-12)을 입력하세요.");

        int month = s.nextInt();
        
        switch(month){
            case 1: case 2: case 12:
                System.out.print("겨울입니다.");
                break;
            case 3: case 4: case 5:
                System.out.print("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.print("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.print("가을입니다.");
                break;
            default:
                System.out.print("잘못된 입력입니다.");
        }
            
        s.close();
    }
}
