package JavaProgrammingI.Part6._01_ObjectsOnAList.TheMessagingService;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        Message message = new Message("Oraz", "1234");
        Message message1 = new Message("Amir", "2021");
        MessagingService messagingService = new MessagingService();
        messagingService.add(message);
        messagingService.add(message1);
        System.out.println(messagingService.getMessages());


    }
}
