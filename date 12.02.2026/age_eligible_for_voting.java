class age_eligible_for_voting{
    static boolean isEligibleForVoting(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int age=2;
        if(isEligibleForVoting(age)){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("You are not eligible for voting.");
        }
    }
}