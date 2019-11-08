package LintCode;

public class ReverseInteger {
    public int reverse(int x) {
        String number = String.valueOf(x);
        StringBuilder reverseNumber = new StringBuilder();
        int k = number.length();
        reverseNumber.setLength(k);
        if (k % 2 == 0) {
            for (int i = 0; i < Math.floor(k / 2); i++) {
                reverseNumber.setCharAt(i, number.charAt(k - i - 1));
                reverseNumber.setCharAt(k - i - 1, number.charAt(i));
            }
        }
        if (k % 2 != 0) {
            for (int i = 0; i < Math.floor(k / 2); i++) {
                reverseNumber.setCharAt(i, number.charAt(k - i - 1));
                reverseNumber.setCharAt(k - i - 1, number.charAt(i));
            }
            reverseNumber.setCharAt((int) (Math.floor(k / 2) + 1), number.charAt((int) (Math.floor(k / 2) + 1)));
        }
        return Integer.valueOf(reverseNumber.toString());
    }

    public static void main(String[] arg) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(12345));
    }
}
