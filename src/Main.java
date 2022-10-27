public class Main {
    public static void main(String[] args) {

        PagesDataTable yesterdayData = new PagesDataTable(new String[][]{{"url1", "html1"},
                                                                {"url2", "html2"},
                                                                {"url3", "html3"},
                                                                {"url4", "html4"}});

        PagesDataTable todayData = new PagesDataTable(new String[][]{{"url1", "html1"},
                                                            {"url2", "html2_new"},
                                                            {"url5", "html5"},
                                                            {"url6", "html6"}});

        UpdatedData updatedData = DataUpdater.createUpdatedData(yesterdayData.getData(), todayData.getData());
        MessageGenerator messageGenerator = new MessageGenerator("Елена Ивановна");
        String updateMessage = messageGenerator.createMessage(updatedData);
        System.out.println(updateMessage);
    }
}