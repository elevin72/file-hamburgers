

public class ShortRepresentationVisitor implements IVisitor {

	@Override
	public void visit(DirectoryDetails t) {
        System.out.println(t.getName());
	}

	@Override
	public void visit(HtmlFileDetails t) {
        System.out.println(t.getName());
		
	}

	@Override
	public void visit(JpgFileDetails t) {
        System.out.println(t.getName());
		
	}

	@Override
	public void visit(Mp3FileDetails t) {
        System.out.println(t.getName());
		
	}

	@Override
	public void visit(PptxFileDetails t) {
        System.out.println(t.getName());
		
	}

	@Override
	public void visit(TxtFileDetails t) {
        System.out.println(t.getName());
		
    }

	@Override
	public void visit(DocxFileDetails t) {
        System.out.println(t.getName());
		
	}
}
