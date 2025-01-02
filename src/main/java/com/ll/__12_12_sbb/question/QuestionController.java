package com.ll.__12_12_sbb.question;


import com.ll.__12_12_sbb.answer.AnswerForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

        private final QuestionService questionService;

        @GetMapping("/list")
        public String list(Model model, @RequestParam(value="page", defaultValue="0") int page) {
            Page<Question> paging = this.questionService.getList(page);
            model.addAttribute("paging", paging);
            return "question_list";
        }

        @GetMapping("/detail/{id}")
        public String detail(Model model, @PathVariable Integer id, AnswerForm answerForm) {
            Question question = this.questionService.getId(id);
            model.addAttribute("question", question);
            return "question_detail";
        }

        @GetMapping("/create")
        public String questionCreate(QuestionForm questionForm) {
            return "question_form";
        }

        @PostMapping("/create")
        public String create(@Valid QuestionForm questionForm, BindingResult bindingResult) {
            if(bindingResult.hasErrors()){
             return "question_form";
            }
            this.questionService.create(questionForm.getSubject(), questionForm.getContent());
            return "redirect:/question/list";

        }

}
