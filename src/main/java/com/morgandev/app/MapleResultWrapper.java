package com.morgandev.app;

import com.morgandev.app.result.MapleResult;

public class MapleResultWrapper {

    private MapleResult mapleResult;

    public MapleResultWrapper(MapleResult mapleResult) {
        this.mapleResult = mapleResult;
    }

    public boolean getErrors() {
        return mapleResult.hasErrors();
    }

    public String getErrorMessage() {
        return mapleResult.hasErrors() ? mapleResult.getException().getMessage() : "";
    }

    public String getSqlStatements() {
        return mapleResult.getSqlStatements();
    }


}
