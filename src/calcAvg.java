import java.util.Scanner;

public class calcAvg {
    public static void main(String[] args) {
        int numOfScore;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many test scores do you have: ");
        numOfScore = sc.nextInt();

        double[] scores = new double[numOfScore];

        for(int i = 0; i< scores.length;i++)
        {
            System.out.print("Enter Score #" + (i+1) + ": ");
            scores[i] = sc.nextInt();
        }

        Grader gr = new Grader(scores);
        System.out.println("Your adjusted avg score is: " + gr.getAverage());
        System.out.println("Your lowest score excluded was: " + gr.getLowestScore());
    }
}
