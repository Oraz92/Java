package JavaProgrammingI.Part6._01_ObjectsOnAList.TheMessagingService;

import java.util.Objects;
public class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    // created using the "insert code" feature of NetBeans
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Message other = (Message) object;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        return Objects.equals(this.content, other.content);
    }
}
