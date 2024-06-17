package com.loki.designpatterns2.BuilderDP;

import lombok.Getter;

@WithBuilder
@Getter
public class DatabaseConfigurationBuilder {
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
    @Getter
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder(Builder builder){
        this.databaseUrl = builder.getDatabaseUrl();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.maxConnections = builder.getMaxConnections();
        this.enableCache = builder.isEnableCache();
        this.isReadOnly = builder.isReadOnly();
    }

    public static Builder createBuilder(){
        return new Builder();
    }

    public static class Builder {

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
        private boolean isReadOnly;

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public DatabaseConfigurationBuilder build(){
            return new DatabaseConfigurationBuilder(this);
        }
    }
}