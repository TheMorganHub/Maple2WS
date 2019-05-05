package com.morgandev.app;

public class MapleResponse {

    private String sqlStatement;

    public MapleResponse() {
    }

    public MapleResponse(MapleRequest request) {
        MapleInstance instance = new MapleInstance();
        this.sqlStatement = instance.convert(request.getStatement());
    }

    public String getSqlStatement() {
        return sqlStatement;
    }
}
