class Roman {
    private static String romanSymbols = "IVXLCDM";
    private static int values[] = { 1, 5, 10, 50, 100, 500, 1000 };

    public static int getValue(char ch) {
        int index = romanSymbols.indexOf(ch);
        if (index == -1)
            throw new IllegalArgumentException();
        return values[index];
    }

    public static int romanToInteger(String roman) {
        roman = roman.toUpperCase();
        int answer = 0, current, next;
        current = getValue(roman.charAt(0));
        for (int position = 1; position < roman.length(); position++) {
            next = getValue(roman.charAt(position));
            if (current >= next)
                answer += current;
            else
                answer -= current;
            current = next;
        }
        answer += current;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("M: " + romanToInteger("M"));// 1000
        System.out.println("MMXXI: " + romanToInteger("MMXXI"));// 2021
        System.out.println("CM: " + romanToInteger("CM"));// 900
        System.out.println("MMXXIV: " + romanToInteger("MMXXIV"));// 2024
    }
}
