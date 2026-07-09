package org.example.sxmain.model;

import java.util.Objects;

public class Message {
    private String sender;
    private String content;
    private String type;

    public Message() {

    }

    public Message(String inSender, String inContent, String inType) {
        this.sender = inSender;
        this.content = inContent;
        this.type = inType;
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(sender, message.sender) && Objects.equals(content, message.content) && Objects.equals(type, message.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, content, type);
    }
}
