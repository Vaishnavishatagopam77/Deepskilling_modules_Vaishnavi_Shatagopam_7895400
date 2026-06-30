import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
public class MockingTest {
    @Test
    void testMocking() {

        // Create Mock
        ExternalAPI api = mock(ExternalAPI.class);

        // Stub Method
        when(api.getData()).thenReturn("Mockito Success");

        // Pass Mock
        DataService service = new DataService(api);

        // Test
        assertEquals("Mockito Success", service.fetchData());

    }

}