package ru.ac.uniyar.testingcourse;

import mockit.Mock;
import mockit.MockUp;

public class MockedTimeProvider extends MockUp<System> implements TimeProvider {
    long mockedTime = 0;

    @Override
    @Mock
    public long currentTimeMillis() {
        return mockedTime;
    }

    public void setMockedTime(long testTime) {
        this.mockedTime = (long) testTime;
    }
}
