package com.chiku.annotationsexample;

import org.springframework.stereotype.Component;

@Component
public class ExcellentFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "Excellence is your potion!!!!!!!!!!!!!";
    }
}
