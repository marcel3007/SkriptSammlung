package ioc.events;

public class InputEventListener implements IEventListener {

    @Override
    public void onInputEvent(IEvent event) {
        System.out.println("EventSource" + event.getSource());
        System.out.println("EventText" + event.getText());
    }
}
