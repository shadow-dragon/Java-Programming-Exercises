
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if (this.guessedLetters.contains(letter)) {
        } else {
            this.guessedLetters = this.guessedLetters + letter;
            if (this.word.contains(letter)) {
                hiddenWord();
            } else {
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        int i = 0;

        int length = this.word.length();
        String S = "_";
        String s = "";
        while (i < length) {
            s = s + S;
            i++;
        }
        StringBuilder last = new StringBuilder(s);
        int n = 0;
        int p = this.guessedLetters.length();
        while (n < p) {
            char cha = this.guessedLetters.charAt(n);
            String aString = "" + cha;
            if (this.word.contains(aString)) {
                int index = word.indexOf(aString);
                last.setCharAt(index, cha);

                if (index < p) {
                    String wor = this.word.substring(index + 1);
                    if (wor.contains(aString)) {
                        int inde = wor.indexOf(aString);
                        last.setCharAt(index + inde + 1, cha);
                    }
                }
            }
            n++;
        }
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        last.append("");
        return last.toString();
    }
}
