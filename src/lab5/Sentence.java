package lab5;

public class Sentence {
    private static final String punctuationSymbols = ".,!?";
    private PartOfSentence[] partOfSentence;
    public Sentence(String s){
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
        partOfSentence = new PartOfSentence[split.length];
        for (int i = 0; i < split.length; i++) {
            if(punctuationSymbols.contains(split[i])){
                partOfSentence[i] = new Punctuation(split[i]);
            } else {
                partOfSentence[i] = new Word(split[i]);
            }
        }
    }

}
