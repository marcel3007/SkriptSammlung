package entwurfsmuster.ioc.events;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventHandler {

    private final List<IEventListener> listenerList = new CopyOnWriteArrayList<>();

    boolean add(IEventListener listener) {

        if (listener == null)
            return false;

        if (listenerList.contains(listener))
            return false;

        return listenerList.add(listener);


    }

    public void clear() {
        listenerList.clear();
    }

    void handle(IEvent event) {
        for (IEventListener listener : listenerList) {
            if (listener != null)
                listener.onInputEvent(event);
        }
    }
}
