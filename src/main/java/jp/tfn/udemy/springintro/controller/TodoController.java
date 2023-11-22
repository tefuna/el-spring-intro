package jp.tfn.udemy.springintro.controller;

import java.time.OffsetDateTime;
import java.util.List;

import jp.tfn.udemy.springintro.codedef.TodoTypeEnum;
import jp.tfn.udemy.springintro.entity.Todo;
import jp.tfn.udemy.springintro.entity.TodoType;
import jp.tfn.udemy.springintro.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService service;

    @ModelAttribute(name = "todoTypeRadio")
    public TodoTypeEnum[] getTodoTypes() {
        return TodoTypeEnum.values();
    }

    @GetMapping("/")
    public String index(TodoForm todoForm, Model model, @ModelAttribute("complete") String complete) {

        List<Todo> todos = service.findAll();
        model.addAttribute("todos", todos);
        // model.addAttribute("todoTypeRadio", TodoTypeEnum.values());

        return "todo/index";
    }

    @PostMapping("/register")
    public String index(@Validated TodoForm todoForm,
            BindingResult result,
            RedirectAttributes redirectAttrs,
            Model model) {

        if (result.hasErrors()) {
            return "todo/index";
        }

        // save database
        Todo todo = convertTodo(todoForm);
        service.save(todo);

        redirectAttrs.addFlashAttribute("complete", "registered");
        return "redirect:/todo/";
    }

    private static Todo convertTodo(TodoForm form) {
        Todo todo = new Todo();

        TodoTypeEnum.getEnum(form.getTodoTypeId());
        TodoType todoType = new TodoType();
        todoType.setTodoTypeId(form.getTodoTypeId());
        todo.setTodoType(todoType);
        todo.setTitle(form.getTitle());
        todo.setDetail(form.getDetail());
        todo.setDeadline(OffsetDateTime.parse(form.getDeadline()));

        return todo;
    }

}
