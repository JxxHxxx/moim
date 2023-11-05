package com.jxx.moim.core.common.history;

public enum EventType {
    CREATE("C", "생성"),
    UPDATE("U", "변경"),
    DELETE("D" , "삭제");

    private final String eventCode;
    private final String description;

    EventType(String eventCode, String description) {
        this.eventCode = eventCode;
        this.description = description;
    }

    public String code() {
        return this.eventCode;
    }

    public String description() {
        return this.description;
    }
}
