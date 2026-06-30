package other;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VerifyTest {

    @Test
    void testVerify() {

        // Create a mock object
        ExternalAPI api = mock(ExternalAPI.class);

        // Stub the method
        when(api.getData()).thenReturn("Verified");

        // Pass mock object to service
        DataService service = new DataService(api);

        // Call the method
        service.fetchData();

        // Verify that getData() was called exactly once
        verify(api).getData();
    }
}