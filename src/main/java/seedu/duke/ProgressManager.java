package seedu.duke;

import java.util.logging.*;


public class ProgressManager {

    private ResultsList sessionResults;

    private static Logger logger = Logger.getLogger("ProgressManagerLogger");

    public ProgressManager(ResultsList sessionResults) {
        this.sessionResults = sessionResults;
    }

    public void clearProgress() {
        logger.log(Level.INFO, "Clearing session progress.");
        sessionResults.clearResults();
    }
}
