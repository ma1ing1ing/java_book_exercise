public class Main{
    public static void main(String[] args){
        int n[] = {1,2,3,4,5};
        int sum=0;
        for(int k : n){
            System.out.print(k+" ");
            sum += k;
        }
        System.out.println("합은 "+ sum);

        String a[] = {"사과", "배", "바나나", "포도", "딸기"};
        for(String s : a)
            System.out.print(s+ " ");           
    }
}
