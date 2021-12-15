
public class StatisticsVisitor implements IVisitor {

	@Override
	public void visit(DirectoryDetails t) {
        System.out.println("The directory " + t.getName() + " has " + t.numFiles + " files." );
	}

	@Override
	public void visit(HtmlFileDetails t) {
        System.out.println("The file " + t.getName() + " contains " + t.getLines() + " lines." );
	}

	@Override
	public void visit(JpgFileDetails t) {
        System.out.println("The picture " + t.getName() + " has an average of " + (double)t.getSize() / (t.getWidth() * t.getHeight()) + " bytes per pixel." );
	}

	@Override
	public void visit(Mp3FileDetails t) {
        System.out.println("The bitrate of " + t.getName() + " is " + (double)t.getSize() / t.getLengthSec() + " bytes per second." );
	}

	@Override
	public void visit(PptxFileDetails t) {
        System.out.println("The average slide size in " + t.getName() + " is " + (double)t.getSize() / t.getSlides() + " lines." );
		
	}

	@Override
	public void visit(TxtFileDetails t) {
        System.out.println("The file " + t.getName() + " contains " + t.getWords() + " words." );
	}

	@Override
	public void visit(DocxFileDetails t) {
        System.out.println("The file " + t.getName() + " has an average of " + (double)t.getWords() / t.getPages() + " words per page." );
	}
}
