class Solution {
    public int calPoints(String[] operations) {
        int result = 0; // Stores the running total of all valid scores

        Stack<Integer> stack = new Stack<>(); // Stack to store valid scores

        // Traverse each operation
        for (String op : operations) {

            // "+" means add the last two valid scores
            if (op.equals("+")) {

                int top = stack.pop();              // Get the most recent score
                int newTop = top + stack.peek();    // Sum of last two scores

                stack.push(top);                    // Restore the popped score
                stack.push(newTop);                 // Push the new calculated score

                result += newTop;                   // Update total score

            }

            // "D" means double the previous valid score
            else if (op.equals("D")) {

                stack.push(2 * stack.peek());       // Push double of last score
                result += stack.peek();             // Add it to the total

            }

            // "C" means invalidate the previous valid score
            else if (op.equals("C")) {

                result -= stack.pop();              // Remove last score from total and stack

            }

            // Otherwise, it is an integer score
            else {

                stack.push(Integer.parseInt(op));   // Convert string to integer and push
                result += stack.peek();             // Add the new score to the total

            }
        }

        return result; // Return the final score
    }
}