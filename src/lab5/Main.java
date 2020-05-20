package lab5;

public class Main {
    public static void main(String[] args) {

        Letter[] letters = {
                new Letter('H'),
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o'),
                new Letter('o'),
        };

        Word word = new Word(letters);

        Letter[] letters2 = {
                new Letter('w'),
                new Letter('o'),
                new Letter('r'),
                new Letter('l'),
                new Letter('l'),
                new Letter('d'),
        };

        Word word2 = new Word(letters2);

        Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation2 = new Punctuation("!");

        Sentence sentence = new Sentence(new SentenceElement[]{
                word,
                punctuation,
                word2,
                punctuation2,
        });

        Word word4 = new Word(new Letter[]{
                new Letter('M'),
                new Letter('y')
        });

        Word word5 = new Word(new Letter[]{
                new Letter('n'),
                new Letter('a'),
                new Letter('m'),
                new Letter('e')
        });

        Word word6 = new Word(new Letter[]{
                new Letter('i'),
                new Letter('s')
        });

        Word myName = new Word(new Letter[]{
                new Letter('P'),
                new Letter('a'),
                new Letter('v'),
                new Letter('l'),
                new Letter('l'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o')

        });

        Sentence sentence2 = new Sentence(new SentenceElement[]{
                word4,
                word5,
                word6,
                myName,
                punctuation2,
        });


        Text text = new Text(new Sentence[]{sentence, sentence2});

        System.out.println(text);

//        !!! CLIENT IS ALIVE
//        Client client = new Client(text);
//        client.startLiveInTheSystem();
        text.sortLetterQuantity(text, 'l');
        System.out.println("\nDone! :)");
    }
}