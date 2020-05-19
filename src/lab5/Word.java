package lab5;

public class Word extends PartOfSentence{
    private Letter[] letters;

    public Word(String s) {
        letters = new Letter[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
        }
    }
}
