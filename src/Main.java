public class Main {
    public static String countAndSayConv(String s) {
        String result = "";

        char prevChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (prevChar == s.charAt(i)) {
                count++;
            } else {
                result = result + count + prevChar;
                count = 1;
            }
            prevChar = s.charAt(i);
        }

        result = result + count + prevChar;

        return result;
    }


    public static String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = countAndSayConv(result);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}