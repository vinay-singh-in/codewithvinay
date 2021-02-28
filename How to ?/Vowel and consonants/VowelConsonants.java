// How to concisely check for vowels and consonants in Java
class VowelConsonantsDemo{
    private static String vowels="aeiouAEIOU";
    public static boolean isVowel(char ch){
        return vowels.indexOf(ch)>-1;
    }
    public static boolean isConsonant(char ch){
        return Character.isLetter(ch) && !isVowel(ch);
    }
    public static void main(String[] args) {
        char c='a';
        System.out.println(c+": "+isVowel(c));
        c='b';
        System.out.println(c+": "+isVowel(c));
        c='8';
        System.out.println(c+": "+isVowel(c));
        c='8';
        System.out.println(c+": "+isConsonant(c));
        c='q';
        System.out.println(c+": "+isConsonant(c));
        
    }
}