package WordProcessor;

public class HLetter implements InterfaceLetter {
    public final char c = 'h';
    public FontType fontType;
    public int fontSize;

    public HLetter() {
        this.fontSize = 18;
        this.fontType = FontType.AERIAL;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Printing letter "+c+" at x:"+x+" y:"+y+" fontsize:"+fontSize+" fontType:"+fontType);
    }
}
