package com.example.pupbuddy;

import com.example.pupbuddy.dto.Chore;
import com.example.pupbuddy.dto.Dog;
import com.example.pupbuddy.dto.Human;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    /**
     * Validate that the DTO properties can be set and retrieved for each class
     * Thanks to Mahesh Gowda
     */
    @Test
    void verifyChoreProperties() {
        String choreName =  "TestChore";

        Chore chore = new Chore();
        chore.setChoreName(choreName);
        assertEquals(choreName, chore.getChoreName());
    }

    @Test
    void verifyDogProperties() {
        String dogName =  "Testy";

        Dog dog = new Dog();
        dog.setDogName(dogName);
        assertEquals(dogName, dog.getDogName());
    }

    @Test
    void verifyHumanProperties() {
        String humanName =  "Test Ing";

        Human human = new Human();
        human.setHumanName(humanName);
        assertEquals(humanName, human.getHumanName());
    }

}
