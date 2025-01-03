package com.ll.__12_12_sbb.answer;

import com.ll.__12_12_sbb.question.Question;
import com.ll.__12_12_sbb.question.QuestionService;
import com.ll.__12_12_sbb.user.SiteUser;
import com.ll.__12_12_sbb.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final AnswerService answerService;
    private final QuestionService questionService;
    private final UserService userService;

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable Integer id, @Valid AnswerForm answerForm, BindingResult bindingResult, Principal principal) {
        Question question = this.questionService.getId(id);

        if(bindingResult.hasErrors()){
            model.addAttribute("question", question);
            return "question_detail";
        }
        SiteUser author = this.userService.getUser(principal.getName());
        this.answerService.create(question, answerForm.getContent(), author);
        return String.format("redirect:/question/detail/%s", id);
    }

}
