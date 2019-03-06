package chatspike;

/**
 * Created by brynach on 03/03/2019.
 */
public class Message {

    private String sentBy;
    private String content;

    public Message(String sentBy, String content) {
        this.sentBy = sentBy;
        this.content = content;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
