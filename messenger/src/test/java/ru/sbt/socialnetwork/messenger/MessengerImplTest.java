package ru.sbt.socialnetwork.messenger;

import org.junit.Before;
import org.junit.Test;
import ru.sbt.socialnetwork.domain.Message;
import ru.sbt.socialnetwork.domain.User;
import ru.sbt.socialnetwork.messenger.Messenger;
import ru.sbt.socialnetwork.messenger.MessengerImpl;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.viktor on 15/08/16.
 */
public class MessengerImplTest {
    private Messenger messenger;

    @Before
    public void setUp() {
        messenger = new MessengerImpl();
    }

    @Test
    public void getMessageTest() {
        Message message = new Message(1, 2, "SomeText");
        List<Message> newMessage = new ArrayList<Message>();
        newMessage.add(message);

        User user = new User(2, "Jack");

        messenger.sendMessage(message);

        List<Message> storedMessage = messenger.getMessage(user);
        assertEquals(newMessage, storedMessage);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMessageNoUserTest() {
        Message message = new Message(1, 2, "SomeText");
        List<Message> newMessage = new ArrayList<Message>();
        newMessage.add(message);

        User user = new User(6, "Jack");

        messenger.sendMessage(message);

        List<Message> storedMessage = messenger.getMessage(user);
        assertEquals(newMessage, storedMessage);
    }
}
