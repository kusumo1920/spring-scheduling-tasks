package id.kernel.bootcamp.springschedulingtasks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSchedulingTasksApplicationTests {
    @Autowired
    private ScheduledTasks scheduledTasks;

    @Test
    void contextLoads() {
        // Basic integration test that shows the context starts up properly
        Assertions.assertThat(scheduledTasks).isNotNull();
    }

}
