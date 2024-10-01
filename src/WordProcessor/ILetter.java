package WordProcessor;

public class ILetter implements InterfaceLetter{
    public final char c = 'i';
    public FontType fontType;
    public int fontSize;

    public ILetter() {
        this.fontSize = 18;
        this.fontType = FontType.AERIAL;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Printing letter "+c+" at x:"+x+" y:"+y+" fontsize:"+fontSize+" fontType:"+fontType);
    }
}
