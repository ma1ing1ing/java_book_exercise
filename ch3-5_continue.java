import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("정수 5개 입력");
        int sum=0;
        for(int i=1;i<=5;i++){
            int input=s.nextInt();
            if(input<=0)continue;
            else sum+=input;
        }
        System.out.print("양수의 합은 "+sum);
        
        s.close();
    }
}
