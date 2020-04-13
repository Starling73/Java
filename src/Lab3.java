/*
Зачетка №9124

С3 = 1    Тип  StringBuffer
С17 = 12  Відсортувати слова заданого тексту за кількістю входжень визначеного символу в них.

*/


public class Lab3 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("aerghoih aeirhghg aeirhghjrehh aregaejrhkga rehgkjaerkhhhghgjf");
        char symbol = 'h';
        String str = sb.toString();
        String[] Text = str.split(" ");
        int[] countArray = new int[Text.length];
        for (int i = 0; i < Text.length; i++) {
            for (int j = 0; j < Text[i].length(); j++) {
                if (Text[i].charAt(j) == symbol) {
                    countArray[i] += 1;
                }
            }
        }

        for (int i = 0; i < countArray.length - 1; i++) {
            for (int j = i + 1; j < Text.length; j++) {
                if (countArray[j] < countArray[i]) {
                    var temp = countArray[i];
                    String tempSTR = Text[i];


                    countArray[i] = countArray[j];
                    countArray[j] = temp;

                    Text[i] = Text[j];
                    Text[j] = tempSTR;
                }
            }
        }

        for (int i = 0; i < Text.length; i++) {
            System.out.print(Text[i] + "  ");
        }
    }
}
