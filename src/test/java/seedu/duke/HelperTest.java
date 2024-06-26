package seedu.duke;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelperTest {

    private static final Helper helperTest = new Helper();

    @Test
    // check number of prompts in the helper's command list
    public void getCommandsCount_correctNumOfCommandsInList_expect8(){
        assertEquals(8, helperTest.getCommandsCount());
    }

    //@@author ngxzs
    @Test
    void generateRandomNumber_onlyOneTopicToChooseFrom_expect1() {
        int upperLimitOneTopic = 2;
        assertEquals(1, helperTest.generateRandomNumber(upperLimitOneTopic));
    }
}
