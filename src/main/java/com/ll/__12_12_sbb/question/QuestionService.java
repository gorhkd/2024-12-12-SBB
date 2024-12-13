package com.ll.__12_12_sbb.question;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> gerList() {
        return this.questionRepository.findAll();
    }
}
