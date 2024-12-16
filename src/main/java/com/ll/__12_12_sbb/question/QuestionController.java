package com.ll.__12_12_sbb.question;


import com.ll.__12_12_sbb.answer.AnswerForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/question") // 프리픽스
@RequiredArgsConstructor   // 객체 자동 주입
@Controller
public class QuestionController {

    private final QuestionService questionService;

    // 1. URL과 맵핑, 주소 결정
    // 2. 어떤 model을 보낼지

    @GetMapping("/list") // 메인 페이지 (질문 확인)  || (질문 등록 페이지 필요)
    public String question(Model model) {
        List<Question> questionList = this.questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

    @GetMapping("/detail/{id}") // 질문 확인 및 응답 페이지 (답변 등록)
    public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answer){
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail";
    }

    @GetMapping("/create")
    public String questionCreate(QuestionForm questionForm) {
        return "question_create";
    }

    @PostMapping("/create")
    private String questionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult){
            if(bindingResult.hasErrors()){
                return "question_create";
            }
            this.questionService.create(questionForm.getSubject(), questionForm.getContent());
            return "redirect:/question/list";
    }
}
