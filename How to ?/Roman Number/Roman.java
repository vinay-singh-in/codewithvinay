class Roman {
    private static int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String convertToRoman(int n) {
        if (n > 3999)
            throw new IllegalArgumentException();
        String roman = "";
        int times;
        for (int x = 0; n > 0; x++) {
            times = n / value[x];
            roman += symbol[x].repeat(times);
            n %= value[x];
        }
        return roman;
    }

    public static void main(String args[]) {
        System.out.println("12: " + convertToRoman(12)); // XII
        System.out.println("2021: " + convertToRoman(2021)); // MMXXI
    }
}