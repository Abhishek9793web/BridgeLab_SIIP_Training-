public class Logical {
    public static String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1 * n2;
        return String.valueOf(result);
    }

//    public static void main(String[] args) {
//        String num1 = "111";
//        String num2 = "11";
//        String product = multiply(num1, num2);
//        System.out.println("Result: " + product);
//
//    }

    public static String swap(String input) {
        String[] parts = input.split("\\."); // Escape '.' as it's a regex
        if (parts.length == 2) {
            return parts[1] + "." + parts[0];
        } else {
            return input; // Return original if format is invalid
        }
    }

    public static void main(String[] args) {
        String input = "11.223333";
        String swapped = swap(input);
        System.out.println("Swapped: " + swapped);  // Output: 22.11
    }
}
