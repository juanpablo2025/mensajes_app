package org.example;

public class Messages {


    int idMessage;
    String message;
    String messageAuthor;

    String fechaMensaje;

    public Messages() {
    }

    public Messages(int idMessage, String message, String messageAuthor, String fechaMensaje) {
        this.idMessage = idMessage;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.fechaMensaje = fechaMensaje;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
