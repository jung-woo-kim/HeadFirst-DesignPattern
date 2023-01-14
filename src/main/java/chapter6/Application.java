package main.java.chapter6;

public class Application {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommendImpl commend = new CommendImpl(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommend(commend);
        invoker.onButtonPushed();
    }
}
