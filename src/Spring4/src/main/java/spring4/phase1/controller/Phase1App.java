package spring4.phase1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring4.phase1.config.KnightConfig;
import spring4.phase1.domain.Knight;

/**
 * Created by vaibhav.soni on 3/22/2017.
 */
public class Phase1App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
