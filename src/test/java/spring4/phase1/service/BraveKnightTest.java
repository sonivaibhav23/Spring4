package spring4.phase1.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import spring4.phase1.domain.Quest;

/**
 * Created by vaibhav.soni on 3/22/2017.
 */

public class BraveKnightTest {

    /*@Mock
    Quest quest;

    @InjectMocks
    BraveKnight braveKnight;

    @Before
    public void setUp(){
        braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
    }*/

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
