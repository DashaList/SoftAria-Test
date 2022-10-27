import java.util.*;

public class PagesDataTable {

    private final HashMap<String, String> data;
    public PagesDataTable(String[][] data) {
        this.data = new HashMap<>();
        for (String[] datum : data) {
            this.data.put(datum[0], datum[1]);
        }
    }

    public HashMap<String, String> getData() {
        return data;
    }
}