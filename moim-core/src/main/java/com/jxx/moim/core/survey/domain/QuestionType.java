package com.jxx.moim.core.survey.domain;

import lombok.Getter;

@Getter
public enum QuestionType {
    CLOSED_ENDED("YES/NO"),
    OPEN_ENDED("주관식"),
    MULTIPLE("객관식");

    private String description;

    QuestionType(String description) {
        this.description = description;
    }
}
