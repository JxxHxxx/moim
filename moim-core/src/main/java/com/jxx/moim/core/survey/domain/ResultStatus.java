package com.jxx.moim.core.survey.domain;

import lombok.Getter;

@Getter
public enum ResultStatus {
    PENDING("진행 중"),
    DONE("진행 완료"),
    SUBMIT_COMPLETED("제출 완료"),
    SUBMIT_CANCEL("제출 취소");

    private String description;

    ResultStatus(String description) {
        this.description = description;
    }
}
