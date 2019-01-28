package entwurfsmuster.ioc.events;

public class Event implements IEvent {

    private final Object source;
    private final String text;

    Event(Object source, String text) {
        this.source = source;
        this.text = text;
    }

    @Override
    public Object getSource() {
        return source;
    }

    @Override
    public String getText() {
        return text;
    }
}
