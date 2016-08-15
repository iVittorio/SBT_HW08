package ru.sbt.socialnetwork.domain;

/**
 * Created by i.viktor on 15/08/16.
 */
public class Message {
    private final int toUserId;
    private final int fromId;
    private final String text;

    public Message(int fromId, int toUserId, String text) {
        this.fromId = fromId;
        this.toUserId = toUserId;
        this.text = text;
    }

    public int getFromId() {
        return fromId;
    }

    public String getText() {
        return text;
    }

    public int getToUserId() {
        return toUserId;
    }
}
