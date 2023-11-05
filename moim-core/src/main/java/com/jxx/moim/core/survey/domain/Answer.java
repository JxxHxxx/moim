package com.jxx.moim.core.survey.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 *  답변은 int, String, boolean 타입이 될 수 있다. 이걸 풀어내야 한다.
 *  2023-11-05 상속으로 풀까 생각
 */

@Getter
@NoArgsConstructor
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_PK")
    private Long pk;

    private int grade;
    private Long answererId;
    private LocalDateTime createTime;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY)
    private AnswersResult result;

}
