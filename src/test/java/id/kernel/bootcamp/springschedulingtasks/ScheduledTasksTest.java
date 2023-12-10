package id.kernel.bootcamp.springschedulingtasks;

import org.awaitility.Awaitility;
import org.awaitility.Duration;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
public class ScheduledTasksTest {
    @SpyBean
    ScheduledTasks tasks;

    @Test
    public void reportCurrentTime() {
        Awaitility.await().atMost(Duration.TEN_SECONDS).untilAsserted(() -> {
            Mockito.verify(tasks, Mockito.atLeast(2)).reportCurrentTime();
        });
    }
}
