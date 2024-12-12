package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.Entity.Answer;
import com.ll.__12_12_sbb.Repository.AnswerRepository;
import com.ll.__12_12_sbb.Repository.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    @DisplayName("답변조회")
    void JpaAnswerDictionary() {

        Optional<Answer> ao = this.answerRepository.findById(1);
        assertTrue(ao.isPresent());
         Answer a = ao.get();
         assertEquals(2 , a.getQuestion().getId());
        }
}
