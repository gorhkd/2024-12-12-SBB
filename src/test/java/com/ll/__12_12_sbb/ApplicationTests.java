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


// 의존성 주입 (필드 주입, 생성자 주입, 세터 주입)
// 주입 방법에 따라 장단점이있다.
// 추상화 단게......


@SpringBootTest
class ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;


}
