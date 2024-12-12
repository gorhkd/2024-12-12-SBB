package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.Entity.Answer;
import com.ll.__12_12_sbb.Entity.Question;
import com.ll.__12_12_sbb.Repository.AnswerRepository;
import com.ll.__12_12_sbb.Repository.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Transactional // 테스트 동안 서버가 안끊김.
    @Test
    @DisplayName("답변조회")
    void JpaAnswerDictionary() {
        // findById(2); 는 실행 후 세션이 바로 끊겨서 Lazy오류 생김
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다." , answerList.get(0).getContent());

    }
}
