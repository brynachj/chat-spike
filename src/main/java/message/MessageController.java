package message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by brynach on 03/03/2019.
 */
@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topics/messages")
    public Message message(Message message) {
        return new Message("The Server", "Your message " + message.getContent() + "has been received.");
    }
}
