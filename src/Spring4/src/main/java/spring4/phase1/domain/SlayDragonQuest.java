package spring4.phase1.domain;

import java.io.PrintStream;

/**
 * Created by vaibhav.soni on 3/22/2017.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to slay the dragon");
    }
}
