import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        final int S_NUM = 5;
        final int NUM_OF_TESTS = 4;
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sName = "";

        for (int i = 0; i < S_NUM; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            sName = sc.nextLine();
            nameList.add(sName);
        }

        double testScore;

        double[] s1 = new double[NUM_OF_TESTS];
        System.out.println("\nEnter 4 test scores for " + nameList.get(0) + ": ");
        for (int k = 0; k < NUM_OF_TESTS; k++) {
            System.out.print("Test score for test " + (k + 1) + ": ");
            testScore = sc.nextDouble();
            s1[k] = testScore;
        }

        double[] s2 = new double[NUM_OF_TESTS];
        System.out.println("\nEnter 4 test scores for " + nameList.get(1) + ": ");
        for (int k = 0; k < NUM_OF_TESTS; k++) {
            System.out.print("Test score for test " + (k + 1) + ": ");
            testScore = sc.nextDouble();
            s2[k] = testScore;
        }

        double[] s3 = new double[NUM_OF_TESTS];
        System.out.println("\nEnter 4 test scores for " + nameList.get(2) + ": ");
        for (int k = 0; k < NUM_OF_TESTS; k++) {
            System.out.print("Test score for test " + (k + 1) + ": ");
            testScore = sc.nextDouble();
            s3[k] = testScore;
        }

        double[] s4 = new double[NUM_OF_TESTS];
        System.out.println("\nEnter 4 test scores for " + nameList.get(3) + ": ");
        for (int k = 0; k < NUM_OF_TESTS; k++) {
            System.out.print("Test score for test " + (k + 1) + ": ");
            testScore = sc.nextDouble();
            s4[k] = testScore;
        }

        double[] s5 = new double[NUM_OF_TESTS];
        System.out.println("\nEnter 4 test scores for " + nameList.get(4) + ": ");
        for (int k = 0; k < NUM_OF_TESTS; k++) {
            System.out.print("Test score for test " + (k + 1) + ": ");
            testScore = sc.nextDouble();
            s5[k] = testScore;
        }

        System.out.println("\nStudents in the class: ");
        System.out.println("1. " + nameList.get(0) +
                "\n2. " + nameList.get(1) +
                "\n3. " + nameList.get(2) +
                "\n4. " + nameList.get(3) +
                "\n5. " + nameList.get(4));

        boolean nameFound = false;
        String name = returnName(nameList);

        if(nameList.contains(name)){
            System.out.println("Showing " + name + "'s average test score and letter grade");
            for (int a = 0; a < nameList.size(); a++) {
                if (name.equalsIgnoreCase(nameList.get(a))) {
                    if (a == 0) {
                        System.out.print("Test scores for " + nameList.get(a) + ": ");
                        for (int z = 0; z < NUM_OF_TESTS; z++) {
                            System.out.print(s1[z] + "  ");
                        }
                        System.out.printf("\nAverage test score for %s: %.2f\nGrade is: %c", nameList.get(a), getAvg(s1), returnGrade(getAvg(s1)));
                    } else if (a == 1) {
                        System.out.print("Test scores for " + nameList.get(a) + ": ");
                        for (int z = 0; z < NUM_OF_TESTS; z++) {
                            System.out.print(s2[z] + "  ");
                        }
                        System.out.printf("\nAverage test score for %s: %.2f\nGrade is: %c", nameList.get(a), getAvg(s2), returnGrade(getAvg(s2)));
                    } else if (a == 2) {
                        System.out.print("Test scores for " + nameList.get(a) + ": ");
                        for (int z = 0; z < NUM_OF_TESTS; z++) {
                            System.out.print(s3[z] + "  ");
                        }
                        System.out.printf("\nAverage test score for %s: %.2f\nGrade is: %c", nameList.get(a), getAvg(s3), returnGrade(getAvg(s3)));
                    } else if (a == 3) {
                        System.out.print("Test scores for " + nameList.get(a) + ": ");
                        for (int z = 0; z < NUM_OF_TESTS; z++) {
                            System.out.print(s4[z] + "  ");
                        }
                        System.out.printf("\nAverage test score for %s: %.2f\nGrade is: %c", nameList.get(a), getAvg(s4), returnGrade(getAvg(s4)));
                    } else if (a == 4) {
                        System.out.print("Test scores for " + nameList.get(a) + ": ");
                        for (int z = 0; z < NUM_OF_TESTS; z++) {
                            System.out.print(s5[z] + "  ");
                        }
                        System.out.printf("\nAverage test score for %s: %.2f\nGrade is: %c", nameList.get(a), getAvg(s5), returnGrade(getAvg(s5)));
                    } else if(!name.equalsIgnoreCase(nameList.get(a))){
                        System.out.println("The name you inputted is not in our record. Exiting Program");
                        System.exit(0);
                    }
                }
            }
        }else{
            System.out.println("Name isn't in our record");
            System.exit(0);
        }
    }

    public static String returnName(ArrayList<String> nList) {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nType student name to view his/her average test score & letter grade:");

        String name = kb.nextLine();
        return name;
    }

    public static double getAvg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }

    public static char returnGrade(double avg)
    {
        char errorMessage = 'x';
        char grade;
        if(avg <= 100 && avg >= 91)
        {
            grade = 'A';
            return grade;
        }else if(avg <= 90 && avg >= 81)
        {
            grade = 'B';
            return grade;
        }else if(avg <= 80 && avg >= 71)
        {
            grade = 'C';
            return grade;
        }else if(avg <= 70 && avg >= 61)
        {
            grade = 'D';
            return grade;
        }else if(avg <= 60 && avg >= 0)
        {
            grade = 'F';
            return grade;
        }else{
            return errorMessage;
        }
    }
}
