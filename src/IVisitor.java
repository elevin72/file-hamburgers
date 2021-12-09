

public interface IVisitor {

    public void visit(DirectoryDetails t);
    public void visit(HtmlFileDetails t);
    public void visit(JpgFileDetails t);
    public void visit(Mp3FileDetails t);
    public void visit(PptxFileDetails t);
    public void visit(TxtFileDetails t);

}
