package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.Entity.Question;
import com.ll.__12_12_sbb.Repository.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    @DisplayName("Id 컬럼은 기본 메서드")
    void testJpaDictionary() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent()){
            Question q = oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }
    }

    @Test
    @DisplayName("Id를 제외한 컬럼은 findBy + 컬럼명")
    void testJpaDictionaryFromSubject() {
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
    }

    @Test
    @DisplayName("findBy + 컬럼명 + And + 컬럼명")
    void testJpaDictionaryFromSubjectAndContent() {
        Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        assertEquals(1, q.getId());
    }

    @Test
    @DisplayName("findBy + 컬럼명 + Like")
    void testJpaDictionaryFromLike() {
        List<Question> qLisst = this.questionRepository.findBySubjectLike("sbb%");
        Question q = qLisst.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }




}
