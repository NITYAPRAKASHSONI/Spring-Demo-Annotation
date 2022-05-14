package org.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortunes() {
        return "Today Is your Lucky Day";
    }
}
