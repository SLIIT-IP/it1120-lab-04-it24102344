import java.util.Scanner;

public class IT24102344Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam and lab marks
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        // Validate marks
        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Marks should be between 0 and 100.");
            return;
        }

        // Input percentages
        System.out.print("Enter percentage for exam marks: ");
        double examPercentage = scanner.nextDouble();
        System.out.print("Enter percentage for lab marks: ");
        double labPercentage = scanner.nextDouble();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("Percentages should add up to 100.");
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.println("Final mark: " + finalMark);
    }
}