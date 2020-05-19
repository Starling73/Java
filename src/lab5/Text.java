package lab5;

public class Text {
    private Paragraph[] paragraphs;
    public Text(String s){
        String[] split = s.split("\n");
        paragraphs = new Paragraph[split.length];
        for (int i = 0; i < split.length; i++) {
            paragraphs[i] = new Paragraph(split[i]);
        }
    }
}
