import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a[] = new int[5];
        int sum=0;
        
        System.out.println("정수를 입력하세요.");
        for(int i=0; i<5; i++){
            a[i] = s.nextInt();
                sum+=a[i];
        }
        System.out.print("평균은 "+ sum/a.length);
        s.close();
    }
}
