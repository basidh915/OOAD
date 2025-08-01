import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Subject IDs -> Mathematics = 1; Chemistry = 2; Physics = 3;");
        System.out.println("Enter the Number of students");
        n = scanner.nextInt();

        int[][] marks = new int[n + 1][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Marks of the Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the Marks for Subject " + (j + 1) + ":");
                marks[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        int choice = 0;

        while (choice != 4) {

            System.out.println("Choose an option:");
            System.out.println("1 - View Subject Averages");
            System.out.println("2 - View Student Averages and Totals");
            System.out.println("3 - View Grades of All Students");
            System.out.println("4 - Exit");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    double avg_sub;
                    for (int i = 0; i < 3; i++) {
                        double sum = 0;
                        System.out.println("Average Marks for Subject " + (i + 1) + ":");
                        for (int j = 0; j < n; j++) {
                            sum += marks[j][i];
                        }
                        avg_sub = sum / n;
                        System.out.println(avg_sub);
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        double avg_stu;
                        double sum = 0;
                        for (int j = 0; j < 3; j++) {
                            sum += marks[i][j];
                        }
                        avg_stu = sum / 3;
                        System.out.println("Average marks for Student " + (i + 1) + ":" + avg_stu);
                        System.out.println("Total marks for Student " + (i + 1) + ":" + sum);
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println("Grades of the Student " + (i + 1) + " for Subject " + (j + 1) + ":");
                            int sub_marks = 0;
                            sub_marks = marks[i][j];
                            if (sub_marks >= 90) {
                                System.out.println("Grade A");
                            } else if (sub_marks >= 80 && sub_marks <= 89) {
                                System.out.println("Grade B");
                            } else if (sub_marks >= 70 && sub_marks <= 79) {
                                System.out.println("Grade C");
                            } else if (sub_marks >= 60 && sub_marks <= 69) {
                                System.out.println("Grade D");
                            } else {
                                System.out.println("Fail");
                            }
                        }
                        System.out.println("\n");
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
