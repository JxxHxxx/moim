package com.jxx.moim.core.survey.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    public Question(String name, QuestionType questionType) {
        this.name = name;
        this.questionType = questionType;
    }
}
