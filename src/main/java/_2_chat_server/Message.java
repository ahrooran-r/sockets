package _2_chat_server;

import javax.websocket.MessageHandler;
import java.io.Serializable;

record Message(String from, String payload) implements MessageHandler, Serializable {
}
