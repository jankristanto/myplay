import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    @Test 
    public void createAndRetrieveUser() {
        // Create a new user and save it
        new User("jan@ontelstudio.com", "rahasia", "Jan").save();
        
        // Retrieve the user with bob username
        User bob = User.find("byEmail", "jan@ontelstudio.com").first();
        
        // Test 
        assertNotNull(bob);
        assertEquals("Jan", bob.fullname);
    }

}
