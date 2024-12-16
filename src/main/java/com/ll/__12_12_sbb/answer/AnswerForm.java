package com.ll.__12_12_sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message = "아무거나 써줘!!")
    private String content;

}
