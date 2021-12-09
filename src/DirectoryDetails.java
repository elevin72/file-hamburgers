import java.util.HashSet;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {

    private HashSet<FileDetails> files;

    public DirectoryDetails(String path, String name){
        super(path,name);
        files = new HashSet<FileDetails>();
    }

    // composite
    public void addFile(FileDetails fileDetails) {
        files.add(fileDetails);
    }

    public void accept(IVisitor v) {
        for (FileDetails f : files) {
            f.accept(v);
        }
        v.visit(this);
    }

}
