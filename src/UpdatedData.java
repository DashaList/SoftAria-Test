import java.util.ArrayList;

public class UpdatedData {
    private final ArrayList<String> deletedPages;
    private final ArrayList<String> newPages;
    private final ArrayList<String> changedPages;

    public UpdatedData(ArrayList<String> deletedPages,
                       ArrayList<String> newPages,
                       ArrayList<String> changedPages) {
        this.deletedPages = deletedPages;
        this.newPages = newPages;
        this.changedPages =changedPages;
    }
    public ArrayList<String> getDeletedPages() {
        return deletedPages;
    }
    public ArrayList<String> getNewPages() {
        return newPages;
    }
    public ArrayList<String> getChangedPages() {
        return changedPages;
    }
}
