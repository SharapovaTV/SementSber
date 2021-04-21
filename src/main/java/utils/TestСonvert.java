package utils;

public class TestСonvert {

    private TestСonvert() {
    }

    public static String convert(String str) {
        if (str == null || str.isEmpty()) {
            return "Неверно переданная строка";
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            if (i + 1 < str.length()) {
                char c2 = str.charAt(i + 1);
                if (c1 == c2) {
                    count++;
                } else {
                    result.append(count).append(c1);
                    count = 1;
                }
            } else result.append(count).append(c1);
        }
        return result.toString();
    }
}
