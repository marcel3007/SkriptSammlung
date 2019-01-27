package ioc.events;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    void constructor_sourceNull() {
        Event event = new Event(null, "test");
        assertNull(event.getSource());
    }

    @Test
    void constructor_sourceNotNull() {
        Event event = new Event(this, "test");
        assertEquals(this, event.getSource());
    }

    @Test
    void constructor_textNull() {
        Event event = new Event(this, null);
        assertNull(event.getText());
    }
    @Test
    void constructor_textNotNull() {
        Event event = new Event(this, "test");
        assertEquals("test", event.getText());
    }

    @Test
    void getSource_sourceNull() {
        assertNull(new Event(null, "test").getSource());
    }

    @Test
    void getSource_sourceValid() {
        assertEquals(this, new Event(this, "test").getSource());
    }

    @Test
    void getText_textNull() {
        assertNull(new Event(this, null).getText());
    }

    @Test
    void getText_textValid() {
        assertEquals("test", new Event(this, "test").getText());
    }

    @Test
    void getText_textEmpty() {
        assertEquals("", new Event(this, "").getText());
    }


}