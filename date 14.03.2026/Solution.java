import java.util.*;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) return "";

        String ans = "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int i = 0; i < first.length(); i++){
            if(i < last.length() && first.charAt(i) == last.charAt(i)){
                ans = ans + first.charAt(i);
            } 
            else{
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");
        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }

        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}