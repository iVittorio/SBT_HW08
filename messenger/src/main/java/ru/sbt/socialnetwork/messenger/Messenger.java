package ru.sbt.socialnetwork.messenger;

import ru.sbt.socialnetwork.domain.Message;
import ru.sbt.socialnetwork.domain.User;

import java.util.List;

/**
 * Created by i.viktor on 15/08/16.
 */
public interface Messenger {
    void sendMessage(Message message);

    List<Message> getMessage(User user);
}
