import java.util.ArrayList;

public class MessageGenerator {
    private final String recipientName;

    public MessageGenerator(String recipientName) {
        this.recipientName = recipientName;
    }

    public String createMessage(UpdatedData updatedData) {
        ArrayList<String> deletedPages = updatedData.getDeletedPages();
        ArrayList<String> newPages = updatedData.getNewPages();
        ArrayList<String> changedPages = updatedData.getChangedPages();

        String message = "Здравствуйте, дорогая " + this.recipientName + ".\n\n"
                + "За последние сутки во вверенных Вам сайтах изменений не произошло.\n\n";

        if (!deletedPages.isEmpty() || !newPages.isEmpty() || !changedPages.isEmpty()) {
            message = "Здравствуйте, дорогая " + this.recipientName + ".\n\n"
                    + "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n\n";

            if (!deletedPages.isEmpty()) {
                message += "Исчезли следующие страницы: " + String.join(", ", deletedPages) + ".\n";
            }
            if (!newPages.isEmpty()) {
                message += "Появились следующие новые страницы: " + String.join(", ", newPages) + ".\n";
            }
            if (!changedPages.isEmpty()) {
                message += "Изменились следующие страницы: " + String.join(", ", changedPages) + ".\n";
            }
        }
        message += "\n" +
                "С уважением,\n"
                + "автоматизированная система мониторинга.";

        return message;
    }

}
