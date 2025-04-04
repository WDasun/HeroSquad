package com.HeroSquad.HeroSquad;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HeroSquadApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");

        Hero superman = context.getBean(Superman.class);
        Hero wonderWoman1 = context.getBean(WonderWoman.class);
        Hero talkingCat = context.getBean(TalkingCat.class);

        superman.action();
        wonderWoman1.action();
        talkingCat.action();

        WonderWoman wonderWoman2 = context.getBean(WonderWoman.class);
        System.out.println("wonderWoman1 and wonderWoman2 same instances : "+(wonderWoman1 == wonderWoman2));
    }

}
