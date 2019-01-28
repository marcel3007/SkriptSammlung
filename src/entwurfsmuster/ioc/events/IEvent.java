package entwurfsmuster.ioc.events;

public interface IEvent {
    Object getSource();
    String getText();
}
