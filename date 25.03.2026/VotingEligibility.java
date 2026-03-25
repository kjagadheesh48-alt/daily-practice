public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible: No ID");
            }
        } else {
            System.out.println("Not eligible: Underage");
        }
    }
}