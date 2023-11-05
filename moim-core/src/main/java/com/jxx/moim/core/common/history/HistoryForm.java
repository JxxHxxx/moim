package com.jxx.moim.core.common.history;

public record HistoryForm(
        String eventBy,
        EventType eventType,
        SystemType systemType
) {

    public static HistoryForm of(String eventBy, EventType eventType, SystemType systemType) {
        return new HistoryForm(eventBy, eventType, systemType);
    }
}
