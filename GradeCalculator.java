import java.util.Scanner;

 class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double totalMarks = 0;
        double totalMaxMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = scanner.nextDouble();
            System.out.print("Enter maximum marks for Subject " + i + ": ");
            double maxMarks = scanner.nextDouble();
            
            totalMarks += marks;
            totalMaxMarks += maxMarks;
        }
        
        double percentage = (totalMarks / totalMaxMarks) * 100;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Maximum Marks: " + totalMaxMarks);
        System.out.println("Percentage: " + percentage + "%");
        
        // Grading system example
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}
