package ioc.events;

public class ButtonClickEventListener implements IEventListener {

    @Override
    public void onInputEvent(IEvent event) {
        System.out.print("ButtonClickEventListener");
        System.out.print(" | EventSource: " + event.getSource());
        System.out.println(" | EventText: " + event.getText());
    }
}
