import java.util.Vector;

public class DirectoryDetails extends FileDetails {

    private Vector<FileDetails> files;
    public int numFiles = 0;

    public DirectoryDetails(String path, String name){
        super(path,name);
        files = new Vector<FileDetails>();
    }

    // composite
    public void addFile(FileDetails fileDetails) {
        files.add(fileDetails);
        numFiles++;
    }

    public void accept(IVisitor v) {
        for (FileDetails f : files) {
            f.accept(v);
        }
        v.visit(this);
    }

}
