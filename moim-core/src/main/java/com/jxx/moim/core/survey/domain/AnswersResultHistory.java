package com.jxx.moim.core.survey.domain;

import com.jxx.moim.core.common.history.HistoryEntity;
import com.jxx.moim.core.common.history.HistoryForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class AnswersResultHistory extends HistoryEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private AnswersResult answersResult;

    public AnswersResultHistory(AnswersResult answersResult, HistoryForm historyForm) {
        super(historyForm);
        this.answersResult = answersResult;
    }

}
