package com.example.algoritma;

public abstract class Message {
    public String recipient;

    public abstract void sendMessage();	// l2

    static class TextMessage extends Message {

        @Override
        public final void sendMessage() {
            System.out.println("My message to " + recipient + " is Java");
        }
    }

    public static void main(String[] args) {
        Message m = new TextMessage();
        m.recipient = "216 111 2222";
        m.sendMessage();
    }

}
