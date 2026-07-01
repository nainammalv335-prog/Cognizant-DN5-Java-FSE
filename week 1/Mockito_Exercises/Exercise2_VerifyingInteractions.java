
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

interface NotificationService {
    void sendNotification(String message);
}

public class Exercise2_VerifyingInteractions {

    @Test
    void testVerifyInteraction() {

        NotificationService mockService = mock(NotificationService.class);

        mockService.sendNotification("Hello");

        verify(mockService).sendNotification("Hello");
    }
}
