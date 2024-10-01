package WordProcessor;

public class LetterCache {
    private static HLetter hObj;
    private static ILetter iObj;

    public static InterfaceLetter getCharacterObject(char c) {
        if(c == 'h') {
            if(hObj == null) {
                hObj = new HLetter();
            }
            return hObj;
        }
        else {
            if(iObj == null) {
                iObj = new ILetter();
            }
            return iObj;
        }
    }
}
