

public class SizeVisitor implements IVisitor {

    public int totalSize = 0;

	@Override
	public void visit(DirectoryDetails t) {
	}

	@Override
	public void visit(HtmlFileDetails t) {
	}

	@Override
	public void visit(JpgFileDetails t) {
        totalSize += t.getSize();
	}

	@Override
	public void visit(Mp3FileDetails t) {
        totalSize += t.getSize();
	}

	@Override
	public void visit(PptxFileDetails t) {
        totalSize += t.getSize();
	}

	@Override
	public void visit(TxtFileDetails t) {
        totalSize += t.getSize();
	}

	@Override
	public void visit(DocxFileDetails t) {
        totalSize += t.getSize();
	}
}
