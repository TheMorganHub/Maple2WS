package com.morgandev.app;

import com.morgandev.app.bootstrap.MapleRuntime;
import com.morgandev.app.result.MapleResult;

public class MapleResponse {

    private MapleResult mapleResult;

    public MapleResponse() {
    }

    public MapleResponse(MapleRequest request) {
        MapleRuntime instance = new MapleRuntime();
        this.mapleResult = instance.convert(request.getStatement());
    }

    public MapleResultWrapper getResult() {
        return new MapleResultWrapper(mapleResult);
    }
}
