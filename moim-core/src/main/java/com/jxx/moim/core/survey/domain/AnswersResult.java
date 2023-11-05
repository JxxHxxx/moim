package com.jxx.moim.core.survey.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class AnswersResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWERS_RESULT_PK")
    private Long pk;

    private Long answererId;
    @Enumerated(EnumType.STRING)
    private ResultStatus status;


    public void changeResultStatusTo(ResultStatus status) {
        this.status = status;
    }
}
