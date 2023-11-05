package com.jxx.moim.core.common.history;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@NoArgsConstructor
public class HistoryEntity {

    private LocalDateTime eventTime;
    private String eventBy;
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    @Enumerated(EnumType.STRING)
    private SystemType eventSystem;

    public HistoryEntity(HistoryForm historyForm) {
        this.eventTime = LocalDateTime.now();
        this.eventBy = historyForm.eventBy();
        this.eventType = historyForm.eventType();
        this.eventSystem = historyForm.systemType();
    }
}
