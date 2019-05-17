package com.morgandev.app;

import com.morgandev.app.bootstrap.MapleRuntime;

public class MapleResponse {

    private String sqlStatement;

    public MapleResponse() {
    }

    public MapleResponse(MapleRequest request) {
        MapleRuntime instance = new MapleRuntime();
        this.sqlStatement = instance.convert(request.getStatement());
    }

    public String getSqlStatement() {
        return sqlStatement;
    }
}
