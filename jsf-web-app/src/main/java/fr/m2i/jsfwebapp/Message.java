package fr.m2i.jsfwebapp;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "message", eager = true)
public class Message {

    private String message;

    public Message() {
        this.message = "Le message depuis le Bean Message";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}