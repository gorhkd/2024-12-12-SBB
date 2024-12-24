package com.ll.__12_12_sbb;

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


}
