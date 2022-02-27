package com.example.pupbuddy;

import com.example.pupbuddy.dto.Chore;
import com.example.pupbuddy.dto.Dog;
import com.example.pupbuddy.dto.Human;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PupBuddyApplicationTests {

    /**
     * Validate that the DTO properties can be set and retrieved for each class
     * @author Mahesh Gowda
     */
    @Test
    void verifyChoreProperties() {
        String choreName =  "TestChore";

        Chore chore = new Chore();
        chore.setName(choreName);
        assertEquals(choreName, chore.getName());
    }

    @Test
    void verifyDogProperties() {
        String dogName =  "Testy";

        Dog dog = new Dog();
        dog.setName(dogName);
        assertEquals(dogName, dog.getName());
    }

    @Test
    void verifyHumanProperties() {
        String humanName =  "Test Ing";

        Human human = new Human();
        human.setName(humanName);
        assertEquals(humanName, human.getName());
    }

    @Test
    void contextLoads() {
    }

}
