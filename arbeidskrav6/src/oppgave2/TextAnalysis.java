package oppgave2;

import java.util.ArrayList;
import java.util.List;

public class TextAnalysis {
    private String str;
    private String strLC;
    private int[] signsAppearances = new int[30];

    public TextAnalysis(String str) {
        this.str = str;
        this.strLC = str.toLowerCase();

        for (int i = 0; i < strLC.length(); i++) {
            int signIndex = indexOfSign(strLC.charAt(i));
            this.signsAppearances[signIndex] += 1;
        }
    }

    private int indexOfSign(char sign) {
        char signLC = Character.toLowerCase(sign);
        int signUnicode = (int) signLC;

        if (!(((signUnicode >= 97 && signUnicode <= 122) || signUnicode == 230 || signUnicode == 248 || signUnicode == 229))) {
            return 29;
        }

        int signIndex = switch (signUnicode) {
            case 230 -> 26;
            case 248 -> 27;
            case 229 -> 28;
            default -> signUnicode - 97;
        };

        return signIndex;
    }

    public int getNumberOfDifferentLetters() {
        //Character[] differentLettersArray = new Character[10];
        //List<Character> differentLetters = new ArrayList<>();

        //for (int i = 0; i < this.strLC.length(); i++){
        //if (indexOfSign(strLC.charAt(i)) == 29 || differentLetters.contains(this.strLC.charAt(i))) {
        //continue;
        //}

        //differentLetters.add(this.strLC.charAt(i));
        //}

        //return differentLetters.size();

        int differentLetters = 0;
        for (int i = 0; i < this.signsAppearances.length - 1; i++) {
            if (this.signsAppearances[i] != 0) {
                differentLetters++;
            }
        }

        return differentLetters;
    }

    public int getTotalNumbetOfLetters() {
        int letters = 0;

        for (int i = 0; i < this.signsAppearances.length - 1; i++) {
            letters += signsAppearances[i];
        }

        return letters;
    }

    public double getPercentageOfNonLetters() {
        int signs = str.length();

        return (double) this.signsAppearances[29] / signs;
    }

    public int getNumberOfAppearances(char letter) {
        int letterIndex = indexOfSign(letter);

        return this.signsAppearances[letterIndex];
    }

    public char[] getMostCommonLetters() {
        List<Character> mostCommonLetter = new ArrayList<>();

        int maxValue = 0;
        for (int i = 0; i < this.signsAppearances.length - 1; i++) {
            if (this.signsAppearances[i] > maxValue) {
                maxValue = this.signsAppearances[i];
            }
        }

        for (int i = 0; i < this.signsAppearances.length - 1; i++) {
            if (this.signsAppearances[i] == maxValue) {
                int letterUnicode = switch (i) {
                    case 26 -> 230;
                    case 27 -> 248;
                    case 28 -> 229;
                    default -> i + 97;
                };
                mostCommonLetter.add((char) letterUnicode);
            }
        }

        char[] mostCommonLetterArray = new char[mostCommonLetter.size()];
        for (int i = 0; i < mostCommonLetterArray.length; i++) {
            mostCommonLetterArray[i] = mostCommonLetter.get(i);
        }
        return  mostCommonLetterArray;
    }
}

