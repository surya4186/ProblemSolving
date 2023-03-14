public class Mathematical {
    public static void check(String str, int n) {
        int count = 0, i = 0;
        for (i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            } else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                if ((str.charAt(i - 1) > 96 && str.charAt(i + 1) < 122)
                        && (str.charAt(i - 1) > 96 && str.charAt(i + 1) < 122)) {
                    continue;
                } else {
                    break;
                }
            }
        }
        if (count == 0 && i == n) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }

    public static void main(String[] args) {
        String str = "(a+b)(a*b)";
        int n = str.length();
        check(str, n);

    }
}