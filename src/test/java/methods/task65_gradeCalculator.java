package test.java.methods;

public class task65_gradeCalculator {
    //Write a method that accepts 3 grades and prints the grade according to the below table
    //Sample Output:
    //calculateGrade(100,100,100) - > A
    //calculateGrade(50,50,50) - >F
    public static void main(String[] args) {
        calculateGrade(100,100,100);
        calculateGrade(50,50,50);
    }

    public static void calculateGrade(int score1, int score2, int score3){
            double score = (double)(score1+score2+score3)/3;
        if(score>0&&score<60) {
            System.out.println("Grade F");
        }else if(score>=60&&score<70) {
            System.out.println("Grade D");
        }else if(score>=70&&score<80) {
            System.out.println("Grade C");
        }else if(score>=80&&score<90) {
            System.out.println("Grade B");
        }else if(score>=90&&score<=100) {
            System.out.println("Grade A");
        }
    }
}
