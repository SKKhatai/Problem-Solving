package com.practice.problem;

import java.util.*;

public class Problem {

    public static int arrayChallenge(int num) {
        // Convert the number to a list of digits
        List<Integer> digits = new ArrayList<>();
        for (char c : Integer.toString(num).toCharArray()) {
            digits.add(Character.getNumericValue(c));
        }

        // Check if the number has adjacent pairs of equal digits
        for (int i = 0; i < digits.size() - 1; i++) {
            if (digits.get(i).equals(digits.get(i + 1))) {
                return 0;
            }
        }

        // List to keep track of digit combinations and multiplication count
        LinkedList<Map.Entry<List<Integer>, Integer>> check = new LinkedList<>();
        check.add(new AbstractMap.SimpleEntry<>(digits, 1));

        while (!check.isEmpty()) {
            Map.Entry<List<Integer>, Integer> current = check.removeFirst();
            digits = current.getKey();
            int multiplications = current.getValue();

            // Use a HashSet to ensure unique digit iterations
            for (int digit : new HashSet<>(digits)) {
                // Multiply the digit by the number formed by the digit list
                StringBuilder sb = new StringBuilder();
                for (int d : digits) {
                    sb.append(d);
                }
                int multipliedNum = digit * Integer.parseInt(sb.toString());

                // Convert the multiplied number to a list of digits
                List<Integer> multDigits = new ArrayList<>();
                for (char c : Integer.toString(multipliedNum).toCharArray()) {
                    multDigits.add(Character.getNumericValue(c));
                }

                // Check if the last digit of the original list matches the first digit of the result
                if (digits.get(digits.size() - 1).equals(multDigits.get(0))) {
                    return multiplications;
                }

                // Check if the multiplied result has adjacent pairs of equal digits
                boolean hasAdjacent = false;
                for (int i = 0; i < multDigits.size() - 1; i++) {
                    if (multDigits.get(i).equals(multDigits.get(i + 1))) {
                        hasAdjacent = true;
                        break;
                    }
                }
                if (hasAdjacent) {
                    return multiplications;
                }

                // Add the new digit combination to the queue for further checking
                check.add(new AbstractMap.SimpleEntry<>(multDigits, multiplications + 1));
            }
        }

        return -1;  // If no result is found
    }

    public static void main(String[] args) {
        System.out.println(arrayChallenge(123));  // Example usage
    }
}
