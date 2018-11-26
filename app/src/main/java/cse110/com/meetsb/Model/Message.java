package cse110.com.meetsb.Model;
import android.media.Image;
import android.net.Uri;

import java.io.Serializable;

public class Message implements Serializable{
    private String id;
    private String userId;
    private String text;
    private Object time;
    private Boolean seen;
    private MessageType messageType;

    public Message(){}

    public Message(String id, String userId, String text, Object time, Boolean seen, MessageType messageType) {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.time = time;
        this.seen = seen;
        this.messageType = messageType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    @Override
    public String toString() {
        return " messages -> "+this.getText()+"\n";
    }
}
