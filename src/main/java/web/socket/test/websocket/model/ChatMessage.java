package web.socket.test.websocket.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private MessageType messageType;
    private String      content;
    private String      sender;
}
