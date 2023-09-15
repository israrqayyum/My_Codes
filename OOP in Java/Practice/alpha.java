class GradedActivity {
    private double score;
    public void setScore(double s) {
        this.score = s;
    }
    public double getScore() {
        return this.score;
    }
    public char getGrade() {
        // Sample grading system, adjust as needed.
        if (this.score >= 90.0) {
            return 'A';
        } else if (this.score >= 80.0) {
            return 'B';
        } else if (this.score >= 70.0) {
            return 'C';
        } else if (this.score >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
interface Relatable {
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}

class FinalExam extends GradedActivity implements Relatable{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;
        super.setScore((questions - missed) * pointsEach);
    }

    public double getPointsEach() {
        return this.pointsEach;
    }

    public int getNumMissed() {
        return this.numMissed;
    }

    @Override
    public boolean equals(GradedActivity g) {
        return this.getScore() == g.getScore();
    }

    @Override
    public boolean isGreater(GradedActivity g) {
        return this.getScore() > g.getScore();
    }

    @Override
    public boolean isLess(GradedActivity g) {
        return this.getScore() < g.getScore();
    }
}
public class alpha{
    public static void main(String[] args) {
        GradedActivity activity = new GradedActivity();
        activity.setScore(100);    
        FinalExam exam = new FinalExam(2, 1);
        System.out.println("Graded Activity score: " + activity.getScore());
        System.out.println("Graded Activity grade: " + activity.getGrade());

        System.out.println("Final Exam score: " + exam.getScore());
        System.out.println("Final Exam grade: " + exam.getGrade());

        System.out.println("Are the scores equal? " + exam.equals(activity));
        System.out.println("Is the exam score greater? " + exam.isGreater(activity));
        System.out.println("Is the exam score less? " + exam.isLess(activity));
    }
}
