import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        String name = s.next();
        String city = s.next();
        int age = s.nextInt();
        double weight = s.nextDouble();
        boolean solo = s.nextBoolean();
        System.out.print(name+" "+city+" "+age+" "+weight+" "+solo);
        s.close();
    }
}
