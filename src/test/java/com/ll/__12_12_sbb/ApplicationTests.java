package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.Entity.Question;
import com.ll.__12_12_sbb.Repository.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    @DisplayName("수정")
    void testJpaModify() {
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
       Question q = oq.get();
       q.setSubject("수정된 제목");
       this.questionRepository.save(q);  // 알아서 기존 객체를 찾아서 갱신함.
    }

}
