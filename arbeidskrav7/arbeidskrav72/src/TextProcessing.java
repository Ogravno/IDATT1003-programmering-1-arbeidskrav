public class TextProcessing {
    private String str;

    TextProcessing(String str) {
        this.str = str;
    }

    public int wordCount() {
        String[] strWords = this.str.split(" ");
        return strWords.length;
    }

    public double averageWordLength() {
        String[] strWords = this.str.split(" ");

        double totalWordLength = 0;
        for (int i =0; i< strWords.length; i++) {
            totalWordLength += strWords[i].length();
        }

        double averageWordLength = totalWordLength / strWords.length;
        return averageWordLength;
    }

    public double averageWordCountPerPeriod() {
        String[] strPeriods = this.str.split("[.//!//://?]");

        double totalWordCount = 0;
        for (int i=0; i< strPeriods.length; i++) {
            String[] periodWords = strPeriods[i].trim().split(" ");
            totalWordCount += periodWords.length;
        }

        double averageWordCount = totalWordCount / strPeriods.length;
        return averageWordCount;
    }

    public void replaceWord(String wordToReplace, String replacement) {
        String regex = "(?i)" + wordToReplace;
        this.str = this.str.replaceAll(regex, replacement);
    }

    public String getString() {
        return this.str;
    }

    public String getStringUppercase() {
        return this.str.toUpperCase();
    }
}
