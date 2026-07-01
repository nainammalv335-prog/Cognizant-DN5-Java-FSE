
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

interface ExternalApi {
    String getData();
}

public class Exercise1_MockingAndStubbing {

    @Test
    void testMockingAndStubbing() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        String result = mockApi.getData();

        assertEquals("Mock Data", result);
    }
}
