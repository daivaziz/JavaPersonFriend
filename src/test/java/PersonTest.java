import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getName() {
        Person person = new Person( "Zenonas");
        assertEquals("Zenonas", person.getName());
    }

    @Test
    public void getFriend() {
        Person person = new Person("Zenonas");
        Person second = new Person(person, "Kazys");
        assertNull(person.getFriend());
        assertEquals(person ,second.getFriend());
    }
}