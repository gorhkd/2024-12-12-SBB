package com.ll.__12_12_sbb.question;


import com.ll.__12_12_sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @OneToMany(mappedBy = "quesiton", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
