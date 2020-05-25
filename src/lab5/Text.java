package lab5;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String textString) {
        String[] sentencesStrings = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
        }
        return textString.toString();
    }

    public void sortLetterQuantity(Text text, char letter) {
        String str = text.toString();
        str = str.replaceAll(", ", " ");
        str = str.replaceAll("\\? ", " ");
        str = str.replaceAll("\\. ", " ");
        str = str.replaceAll("! ", " ");
        str = str.replaceAll("\\.", " ");
        str = str.replaceAll("!", " ");
        str = str.replaceAll("\\?", " ");
        String[] sortedStr = str.split(" ");
        int[] countArray = new int[sortedStr.length];
        for (int i = 0; i < sortedStr.length; i++) {
            for (int j = 0; j < sortedStr[i].length(); j++) {
                if (sortedStr[i].charAt(j) == letter) {
                    countArray[i] += 1;
                }
            }
        }

        for (int i = 0; i < countArray.length - 1; i++) {
            for (int j = i + 1; j < sortedStr.length; j++) {
                if (countArray[j] < countArray[i]) {
                    var temp = countArray[i];
                    String tempSTR = sortedStr[i];


                    countArray[i] = countArray[j];
                    countArray[j] = temp;

                    sortedStr[i] = sortedStr[j];
                    sortedStr[j] = tempSTR;
                }
            }
        }
        System.out.println("Sorted text:");
        for (int i = 0; i < sortedStr.length; i++) {
            System.out.print(sortedStr[i] + "  ");
        }

    }
}