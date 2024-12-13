package com.ll.__12_12_sbb;


import com.ll.__12_12_sbb.question.Question;
import com.ll.__12_12_sbb.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/")
    public String root(Model model) {
        return "redirect:/question_list";
    }

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = this.questionService.gerList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

}
