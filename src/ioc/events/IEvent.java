package ioc.events;

public interface IEvent {
    Object getSource();
    String getText();
}
