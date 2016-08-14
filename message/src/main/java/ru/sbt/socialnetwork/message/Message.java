package ru.sbt.socialnetwork.message;

/**
 * Created by chapaev on 14.08.2016.
 */
public interface Message {
    void sentMessage(String toUserId, String text);

    String readMessage(String fromUserId);
}
