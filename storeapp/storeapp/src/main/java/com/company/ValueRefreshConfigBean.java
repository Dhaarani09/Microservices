package com.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ValueRefreshConfigBean {

    private String colour;

    public ValueRefreshConfigBean(@Value("${application.theme.colour}") String colour) {
        super();
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
