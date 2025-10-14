public class Main {
    public static void main(String[] args) {
        TextProcessing myString = new TextProcessing("hello world hello world. hei verden, hei verden hei? hello, world hello");

        System.out.println(myString.getString());
        System.out.println("Word count: " + myString.wordCount());
        System.out.println("Average word length: " + myString.averageWordLength());
        System.out.println("Average word count per period: " + myString.averageWordCountPerPeriod());

        String wordToReplace = "hello";
        String replacement = "goodbye";
        myString.replaceWord(wordToReplace, replacement);
        System.out.println("'" + wordToReplace + "' replaced with '" + replacement + "'");

        System.out.println(myString.getString());
        System.out.println(myString.getStringUppercase());
    }
}