package com.example.pupbuddy;

import com.example.pupbuddy.dto.Chore;
import com.example.pupbuddy.dto.Dog;
import com.example.pupbuddy.dto.Human;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import lombok.Data;

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
