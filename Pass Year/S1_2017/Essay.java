
package S1_2017;

public class Essay extends GradedActivity 
{
    protected int grammar, spelling, length, content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        super.score = getScore();
    }
    
    public int getScore()
    {
        return (grammar + spelling + length + content);
//        if (grammar <= 30)
//            setScore(getScore() + grammar);
//        if (spelling <= 20)
//            setScore(getScore() + spelling);
//        if (length <= 20)
//            setScore(getScore() + length);
//        if (content <= 30)
//            setScore(getScore() + content);
    }    

    @Override
    public String toString() 
    {
        String a = "Essay score:\nGrammar: " + grammar + 
                    "\nSpelling: " + spelling +
                    "\nLength: " + length +
                    "\nContent: " + content + 
                    "\n\n" + super.toString();
        return a;
    }
    
    
}
