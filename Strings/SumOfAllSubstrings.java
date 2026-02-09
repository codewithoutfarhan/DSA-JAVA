package Strings;

public class SumOfAllSubstrings {
    public static void main(String[] args) {

        int x = 7624;
        String s = String.valueOf(x);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                int num = Integer.parseInt(s.substring(i, j));
                sum += num;
            }
        }

        System.out.println(sum);
    }
}

