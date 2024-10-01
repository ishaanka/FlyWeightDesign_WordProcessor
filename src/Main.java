import WordProcessor.InterfaceLetter;
import WordProcessor.LetterCache;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        InterfaceLetter hLetter = LetterCache.getCharacterObject('h');
        InterfaceLetter iLetter = LetterCache.getCharacterObject('h');

        hLetter.display(1,0);
        hLetter.display(5,6);
        iLetter.display(1,1);
        iLetter.display(5,7);
    }
}