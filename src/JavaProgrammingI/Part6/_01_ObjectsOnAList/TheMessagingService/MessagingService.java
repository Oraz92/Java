package JavaProgrammingI.Part6._01_ObjectsOnAList.TheMessagingService;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> arrayList;

    public MessagingService() {
        this.arrayList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.arrayList.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.arrayList;
    }
}
