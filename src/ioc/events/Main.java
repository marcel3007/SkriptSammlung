package ioc.events;

public class Main {

    private EventHandler handler;

    private Main() {
        handler = new EventHandler();
    }

    public static void main(String[] args) {

        Main main = new Main();

        IEventListener listener = new InputEventListener();
        IEventListener listener2 = new ButtonClickEventListener();
        main.getHandler().add(listener);
        main.getHandler().add(listener2);


        main.onBtnClicked();
    }

    private EventHandler getHandler() {
        return handler;
    }

    private void onBtnClicked() {
        handler.handle(new Event(this, "Hallo"));
    }
}
