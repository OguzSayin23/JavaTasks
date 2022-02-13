package test.java.Array;

public class task95 {
    //Student-1
    //Student-2
    //Student-3
    //Math Chemistry History Sport
    //1. Calculate the avg score of student-1
    //2. Calculate the total math scores
    public static void main(String[] args) {
        int[][] scores = {{68,75,54,80}, {100,64,20,50},{10,35,40,90}};

        int total1 =0;
        int totalMath=0;
        for (int i = 0; i < scores[0].length; i++) {
            total1 = total1 +scores[0][i];
        }
        System.out.println("avg1 = " + total1/(scores[0].length));
        for (int i = 0; i < scores.length; i++) {
            totalMath += scores[i][0];
        }
        System.out.println("the total math scores:"+totalMath);
    }
}
