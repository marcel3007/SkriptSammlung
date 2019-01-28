package entwurfsmuster.ioc.events;

public class InputEventListener implements IEventListener {

    @Override
    public void onInputEvent(IEvent event) {
        System.out.print("InputEventListener");
        System.out.print(" | EventSource: " + event.getSource());
        System.out.println(" | EventText: " + event.getText());
    }
}
