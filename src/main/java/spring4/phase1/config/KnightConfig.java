package spring4.phase1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring4.phase1.domain.Knight;
import spring4.phase1.domain.Quest;
import spring4.phase1.domain.SlayDragonQuest;
import spring4.phase1.service.BraveKnight;

/**
 * Created by vaibhav.soni on 3/21/2017.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
