package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.Entity.Question;
import com.ll.__12_12_sbb.Repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpaDictionaryFromSubject() {
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
    }
}
