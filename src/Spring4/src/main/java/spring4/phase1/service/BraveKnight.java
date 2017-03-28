package spring4.phase1.service;

import spring4.phase1.domain.Knight;
import spring4.phase1.domain.Quest;

/**
 * Created by vaibhav.soni on 3/22/2017.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
