import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a[] = new int[5];
        int max=0;
        System.out.print("양수 5개를 입력하시오");
        for(int i=0; i<5; i++){
            a[i] = s.nextInt();
            if(a[i]>max)
                max=a[i];
        }
        System.out.print("가장 큰 수는 "+max+"입니다.");
        s.close();
    }
}
