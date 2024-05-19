public class Main{
    public static void main(String[] args){
        double score[][] = {{3.3, 3.4},
                            {3.9, 3.8},
                            {4.2, 4.1},
                            {4.4, 4.5}};
        double sum = 0;
        for(int year = 0; year<score.length;year++)
            for(int term=0; term<score[year].length; term++)
                sum += score[year][term];
        int n=score.length;
        int m=score[0].length;
        System.out.print("4학년 전체 평점 평균은 : "+ sum/(n*m));
    }
}
