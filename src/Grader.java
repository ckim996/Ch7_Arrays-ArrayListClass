public class Grader
{
    private double[] testScores;

    public Grader(double[] scoreArray)
    {
        this.testScores = scoreArray;
    }

    public double getLowestScore()
    {
        double lowest = testScores[0];
        for(int i = 1; i <testScores.length;i++)
        {
            if(testScores[i] < lowest)
            {
                lowest = testScores[i];
            }

        }
        return lowest;
    }

    public double getAverage()
    {
        double sum = 0;
        double avg = 0;
        double lowest =getLowestScore();

        if(testScores.length < 2)
        {
            System.out.println("You must have at least two test scores!");
        }else {

            for (int i = 0; i < testScores.length; i++) {
                sum += testScores[i];
            }
            sum -= lowest;

            avg = sum / (testScores.length - 1);
        }
        return avg;
    }
}
