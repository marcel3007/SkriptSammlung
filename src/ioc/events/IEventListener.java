package ioc.events;

import java.util.EventListener;

public interface IEventListener extends EventListener {
    void onInputEvent(IEvent event);
}
