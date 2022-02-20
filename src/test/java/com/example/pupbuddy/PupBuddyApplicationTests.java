package com.example.pupbuddy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PupBuddyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void selectFeedDinner_recordsFeedDinnerActivityAsDone() {
        givenActivitiesFeedAvailable();
        whenFeedSelected();
        whenFeedDinnerActivityLoggedDone();
        thenFeedDinnerActivityRecordedDone();
    }

    private void givenActivitiesFeedAvailable() {
    }

    private void whenFeedSelected() {
    }

    private void whenFeedDinnerActivityLoggedDone() {
    }

    private void thenFeedDinnerActivityRecordedDone() {
    }

    void feedDinnerActivityLoggedAsDone_returnsErrorMessageForDuplicateTask() {
        givenFeedDinnerActivityLoggedDoneForDate();
        whenAttemptLogFeedDinnerActivityForSameDate();
        thenReturnErrorMessageDuplicateTask();
    }

    private void givenFeedDinnerActivityLoggedDoneForDate() {
    }

    private void whenAttemptLogFeedDinnerActivityForSameDate() {
    }

    private void thenReturnErrorMessageDuplicateTask() {
    }

}
