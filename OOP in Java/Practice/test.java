import java.util.Scanner;
class gradedActivity{
    private double score;
    public void setScore(double s){
        this.score=s;
    }
    public double getScore(){
        return this.score;
    }
    public char getGrade(){
        if(this.score>=90.0){
            return 'A';
        } 
        else if(this.score>=80.0){
            return 'B';
        } 
        else if(this.score>=70.0){
            return 'C';
        } 
        else if (this.score>=60.0){
            return 'D';
        } 
        else{
            return 'F';
        }
    }
}

interface relatable{
    public boolean equals(gradedActivity g);
    public boolean isGreater(gradedActivity g);
    public boolean isLess(gradedActivity g);
}

class finalExam extends gradedActivity implements relatable{
    private
    int numQuestions;
    double pointsEach;
    int numMissed;
    public finalExam(int numQuestions,int missed){
        this.numQuestions=numQuestions;
        this.numMissed=numMissed;
        this.pointsEach=100.0/numQuestions;
        super.setScore((numQuestions-missed)*pointsEach);
    }
    public double getPointsEach(){
        return this.pointsEach;
    }
    public int getNumMissed(){
        return this.numMissed;
    }
    @Override
    public boolean equals(gradedActivity g) {
        return this.getScore()==g.getScore();
    }
    @Override
    public boolean isGreater(gradedActivity g) {
        return this.getScore()>g.getScore();
    }
    @Override
    public boolean isLess(gradedActivity g) {
        return this.getScore()<g.getScore();
    }
}
public class test{
    public static void main(String[] args) {
        gradedActivity activity=new gradedActivity();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Score:");
        double d=sc.nextDouble();
        activity.setScore(d);    
        System.out.println("Enter Number of Questions:");
        int x=sc.nextInt();
        System.out.println("Enter Number of Questions missed:");
        int y=sc.nextInt();
        finalExam exam = new finalExam(x,y);
        System.out.println("Graded Activity score: "+activity.getScore());
        System.out.println("Graded Activity grade: "+activity.getGrade());
        System.out.println("Final Exam score: " + exam.getScore());
        System.out.println("Final Exam grade: " + exam.getGrade());
        System.out.println("Are the scores equal? " + exam.equals(activity));
        System.out.println("Is the exam score greater? " + exam.isGreater(activity));
        System.out.println("Is the exam score less? " + exam.isLess(activity));
    }
}

