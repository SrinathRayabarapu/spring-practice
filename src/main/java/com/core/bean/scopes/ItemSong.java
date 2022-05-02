package com.core.bean.scopes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope("prototype") // creates bean everytime we ask
public class ItemSong implements ISong{

    public ItemSong() {
        log.info("Object created");
    }

    @Override
    public String getSong() {
        return "O antava mava";
    }
}
