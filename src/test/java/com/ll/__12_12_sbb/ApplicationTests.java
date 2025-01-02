package com.ll.__12_12_sbb;

import com.ll.__12_12_sbb.answer.AnswerRepository;
import com.ll.__12_12_sbb.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;

//    @Test
//    @DisplayName("질문 데이터 저장")
//    void test1() {
//        Question q1 = new Question();
//        q1.setSubject("SBB 게시판 질문");
//        q1.setContent("질문을 어떻게하나요?");
//        q1.setCreateTime(LocalDateTime.now());
//        questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("SBB 게시판 답변");
//        q2.setContent("답변을 어떻게하나요?");
//        q2.setCreateTime(LocalDateTime.now());
//        questionRepository.save(q2);
//    }
//
//    @Test
//    @DisplayName("질문 데이터 조회")
//    void test2() {
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Optional<Question> q = this.questionRepository.findById(1);
//        if(q.isPresent()) {
//          assertEquals("SBB 게시판 질문", q.get().getSubject());
//        }
//
//        Question sub = this.questionRepository.findBySubject("SBB 게시판 질문");
//        assertEquals(1, sub.getId());
//
//        Question con = this.questionRepository.findByContent("답변을 어떻게하나요?");
//        assertEquals(2, con.getId());
//
//        Question sum = this.questionRepository.findBySubjectAndContent("SBB 게시판 질문", "질문을 어떻게하나요?");
//        assertEquals(1, sum.getId());
//
//        List<Question> questionList = this.questionRepository.findBySubjectLike("SBB%");
//        assertEquals(2, questionList.size());
//    }
//
//    @Test
//    @DisplayName("질문 수정")
//    void test3() {
//        Optional<Question> q = this.questionRepository.findById(3);
//        assertTrue(q.isPresent());
//        Question oq = q.get();
//        oq.setSubject("수정된 제목");
//        this.questionRepository.save(oq);
//    }
//
//    @Test
//    @DisplayName("질문 삭제")
//    void test4() {
//        assertEquals(4, this.questionRepository.count());
//        Optional<Question> q = this.questionRepository.findById(4);
//        assertTrue(q.isPresent());
//        Question qo = q.get();
//        this.questionRepository.delete(qo);
//        assertEquals(3, this.questionRepository.count());
//    }
//
//    @Test
//    @DisplayName("답변 데이터 저장하기")
//    void test5() {
//        Optional<Question> q = this.questionRepository.findById(1);
//        assertTrue(q.isPresent());
//        Question qo = q.get();
//
//        Answer answer = new Answer();
//        answer.setContent("질문을 하면 됩니다.");
//        answer.setCreateDate(LocalDateTime.now());
//        answer.setQuestion(qo);
//        this.answerRepository.save(answer);
//    }
//
//    @Test
//    @DisplayName("답변 데이터 조회")
//    void test6() {
//        Optional<Answer> a = this.answerRepository.findById(1);
//        assertTrue(a.isPresent());
//        Answer ao = a.get();
//        assertEquals(1, ao.getQuestion().getId());
//    }
//
//    @Transactional
//    @Test
//    @DisplayName("질문 데이터로 답변 찾기, 답변 데이터로 질문 찾기")
//    void test7() {
//        Optional<Question> q = this.questionRepository.findById(1);
//        assertTrue(q.isPresent());
//        Question qo = q.get();
//
//        List<Answer> answerList = qo.getAnswerList();
//
//        assertEquals(1, answerList.size());
//        assertEquals("질문을 하면 됩니다.", answerList.get(0).getContent());
//    }
//
//    @Test
//    @DisplayName("100개 질문 생성")
//    public void craete() {
//        for(int i = 0; i < 100; i++){
//            Question q = new Question();
//            q.setSubject("보글보글 스폰지밥");
//            q.setContent("스폰지밥 - 뚱이 - 징징이 - 핑핑이");
//            q.setCreateDate(LocalDateTime.now());
//            this.questionRepository.save(q);
//        }
//    }

}

