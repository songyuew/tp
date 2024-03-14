package seedu.duke;

import java.util.ArrayList;

public class ResultsList {
    protected ArrayList<Results> sessionResults;
    protected int count;

    public ResultsList() {
        sessionResults = new ArrayList<>();
        count = 0;
    }

    public void addResult(Results roundResults) {
        sessionResults.add(roundResults);
        count++;
    }

    public Results getSpecifiedResult(int index) {
        return sessionResults.get(index);
    }

    public ArrayList<Results> getAllResults() {
        return sessionResults;
    }

    public String toString() {
        StringBuilder listOfResults = new StringBuilder();
        for (int i = 0; i < count; i++) {
            listOfResults.append((i + 1)).append(". ").append(sessionResults.get(i).getScore()).append("\n");
        }
        return listOfResults.toString();
    }
}
