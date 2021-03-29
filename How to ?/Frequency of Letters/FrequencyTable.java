class FrequencyTable {
    public static void showFrequencyTable(String input) {
        input = input.toUpperCase();
        int len = input.length();
        int freq[] = new int[26];
        char ch;
        for (int i = 0; i < len; i++) {
            ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                freq[ch - 'A']++;
            }
        }
        System.out.println("Frequency table for: " + input);
        for (int i = 0; i < freq.length; i++) { 

            if (freq[i] > 0) {
                System.out.println((char)(i+'A') + ": " + freq[i]);
            }
        }

    }

    public static void main(String args[]) {
        showFrequencyTable("Television");
    }
}