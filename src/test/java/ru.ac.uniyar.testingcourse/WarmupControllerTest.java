package ru.ac.uniyar.testingcourse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarmupControllerTest {
    MockedTimeProvider systemMockup = new MockedTimeProvider();

    @Test
    void simpleCase() {
        WarmupController cont = new WarmupController();
        cont.markLaserOn();
        systemMockup.setMockedTime(120000);
        assertThat(cont.getRemainingTime()).isEqualTo(0.0);
    }

    @Test
    void FullCooling() {
        systemMockup.setMockedTime(0);
        WarmupController cont = new WarmupController();
        MockedTimeProvider systemMockup = new MockedTimeProvider();
        cont.markLaserOn();
        systemMockup.setMockedTime(120000);
        assertThat(cont.getRemainingTime()).isNotNull();
    }
}
