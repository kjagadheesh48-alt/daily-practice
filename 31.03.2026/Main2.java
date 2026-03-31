import java.util.*;
public class Main2 {

    public static int maxSubArray(ArrayList<Integer> list) {
        int maxsum = list.get(0);
        int currentsum = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            currentsum = Math.max(list.get(i), currentsum + list.get(i));
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (type 'stop' to end):");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                list.add(sc.nextInt());
            } else {
                String s = sc.next();
                if (s.equalsIgnoreCase("stop")) {
                    break;
                }
            }
        }
        if (list.size() == 0) {
            System.out.println("No input given!");
        } else {
            int result = maxSubArray(list);
            System.out.println("Maximum Subarray Sum: " + result);
        }

        sc.close();
    }
}