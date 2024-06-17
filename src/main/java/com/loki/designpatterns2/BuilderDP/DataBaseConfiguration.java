package com.loki.designpatterns2.BuilderDP;

import lombok.Getter;

public class DataBaseConfiguration {

    @Getter
    private String databaseUrl;
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private int maxConnections;
    @Getter
    private boolean enableCache;
    private final boolean isReadOnly;

    public DataBaseConfiguration(String databaseUrl, String username, String password, int maxConnections, boolean enableCache, boolean isReadOnly) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        this.maxConnections = maxConnections;
        this.enableCache = enableCache;
        this.isReadOnly = isReadOnly;
    }

    public final boolean isReadOnly() {
        return isReadOnly;
    }
}
