public class GradeCheck {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Grade A");
            } else {
                System.out.println("Grade B");
            }
        } else {
            if (marks >= 35) {
                System.out.println("Grade C");
            } else {
                System.out.println("Fail");
            }
        }
    }
}