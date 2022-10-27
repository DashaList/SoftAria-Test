import java.util.ArrayList;
import java.util.Map;

public class DataUpdater {

    private static ArrayList<String> findDeletedPages(Map<String, String> yesterdayData, Map<String, String> todayData) {
        ArrayList<String> deletedPages = new ArrayList<>();

        yesterdayData.forEach((k, v) -> {
            if (!todayData.containsKey(k)) {
                deletedPages.add(k);
            }
        });

        return deletedPages;
    }

    private static ArrayList<String> findChangedPages(Map<String, String> yesterdayData, Map<String, String> todayData) {
        ArrayList<String> changedPages = new ArrayList<>();

        yesterdayData.forEach((k, v) -> {
            if (todayData.containsKey(k) && !v.equals(todayData.get(k))) {
                changedPages.add(k);
            }
        });

        return changedPages;
    }

    private static ArrayList<String> findNewPages(Map<String, String> yesterdayData, Map<String, String> todayData) {
        ArrayList<String> newPages = new ArrayList<>();

        todayData.forEach((k, v) -> {
            if (!yesterdayData.containsKey(k)) {
                newPages.add(k);
            }
        });

        return newPages;
    }

    public static UpdatedData createUpdatedData(Map<String, String> yesterdayData,
                                                Map<String, String> todayData) {
        return new UpdatedData(findDeletedPages(yesterdayData, todayData),
                               findNewPages(yesterdayData, todayData),
                               findChangedPages(yesterdayData, todayData));
    }
}
