package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.answer.AnswerRepository;
import com.ll.__12_12_sbb.question.Question;
import com.ll.__12_12_sbb.question.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

// 1. 질문 데이터 저장
// 2. 질문 데이터 조회 (Id, Subject, SubjectAndContent, SubjectLike)
// 3. 질문 데이터 수정
// 4. 질문 데이터 삭제
// 5. 답변 데이터 저장
// 6. 답변 데이터 조회
// 7. 답변 데이터를 통해 질문 데이터 조회
// 8. 질문 데이터를 통해 답변 데이터 찾기

@SpringBootTest
class ApplicationTests {
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    @DisplayName("질문 데이터 추가")
    void JpaQuestionCreate() {
        Question q1 = new Question();
        q1.setSubject("sbb 문의합니다.");
        q1.setContent("sbb는 무엇인가요?");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("sbb가 뭐야?");
        q2.setContent("sbb 게시판은 뭐죠?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);
    }

//    @Test
//    @DisplayName("질문 데이터 삭제")
//    void JpaQuestionDeleted() {
//        Optional<Question> q1 = this.questionRepository.findById(9);
//        assertTrue(q1.isPresent());
//         Question q = q1.get();
//         this.questionRepository.delete(q);
//
//         Optional<Question> q2 = this.questionRepository.findById(10);
//         assertTrue(q2.isPresent());
//         Question o = q2.get();
//         this.questionRepository.delete(o);
//         }
}
