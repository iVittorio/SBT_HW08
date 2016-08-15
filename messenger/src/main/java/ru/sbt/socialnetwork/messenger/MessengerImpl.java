package ru.sbt.socialnetwork.messenger;

import ru.sbt.socialnetwork.domain.Message;
import ru.sbt.socialnetwork.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.viktor on 15/08/16.
 */
public class MessengerImpl implements Messenger {

    private final List<Message> messages;

    public MessengerImpl() {
        messages = new ArrayList<Message>();
    }

    public List<Message> getMessage(User user) {
        List<Message> listMsg = new ArrayList<Message>();
        for (Message msg : messages) {
            if(user.getId() == msg.getToUserId()) {
                listMsg.add(msg);
            } else throw new IllegalArgumentException("Нет сообщений с данным пользователем");
        }
        return listMsg;
    }

    public void sendMessage(Message message) {
        messages.add(message);
    }
}
