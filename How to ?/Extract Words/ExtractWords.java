//How to extract words from a sentence in Java?
class ExtractWords{
    public static void main(String[] args) {
        String sentence = "He said, \"Hello, How \tare you?!\"";
        String word[] = sentence.split("[ \t\n,?.!\"]+");
        System.out.println("Number of words: "+word.length);
        for( int i=0; i<word.length;i++){
            System.out.println("word["+i+"] = "+word[i]);
        }
        
    }
}