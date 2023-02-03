
package S2_2018;

public class Essay extends GradedActivity
{
    private final int grammar, spelling, length, content;

    public Essay(int grammar, int spelling, int length, int content) 
    {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        super.score = getScore();
    }
    
    public int getScore()
    {
        return grammar + spelling + length + content;
    }

    @Override
    public String toString() 
    {
        return "Essay score:\n" +
                "Grammar: " + grammar +
                "\nSpelling: " + spelling +
                "\nLength: " + length +
                "\nContent: " + content +
                "\n" + super.toString();
    }
    
}
