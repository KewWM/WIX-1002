
package S1_2017;

public class GradedActivity
{
    protected int score;

    public int getScore()
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }

    public char getGrade (int score)
    {
        char grade = 'O';
        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }

    @Override
    public String toString() 
    {
        String s = "Total score: " + score + "\nEssay grade: " + getGrade(score);
        return s;
    }
    
    
    
}
