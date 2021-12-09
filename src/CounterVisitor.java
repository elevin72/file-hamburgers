
public class CounterVisitor implements IVisitor {

    public int counter = 0;

    @Override
    public void visit(DirectoryDetails t) {
    }

    @Override
    public void visit(HtmlFileDetails t) {
        counter++;
    }

    @Override
    public void visit(JpgFileDetails t) {
        counter++;
    }

    @Override
    public void visit(Mp3FileDetails t) {
        counter++;
    }

    @Override
    public void visit(PptxFileDetails t) {
        counter++;
    }

    @Override
    public void visit(TxtFileDetails t) {
        counter++;
    }

}
