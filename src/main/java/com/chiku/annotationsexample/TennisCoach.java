package com.chiku.annotationsexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach{

    // Field injection
    @Autowired
    @Qualifier("excellentFortuneService") // add identifier for bean to be autowired
    private FortuneService fortuneService;

    // set up default constructor
    public TennisCoach(){
        System.out.println(">> TenisCoach: inside default constructor");
    }

    // Constructor injection
    /*@Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }*/

    // setter injection
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortuneService();
    }
}
