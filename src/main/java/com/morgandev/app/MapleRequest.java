package com.morgandev.app;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MapleRequest {

    private String statement;

    public MapleRequest() {
    }

    @JsonCreator
    public MapleRequest(@JsonProperty("statement") String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }
}
