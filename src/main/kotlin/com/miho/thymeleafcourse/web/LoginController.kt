package com.miho.thymeleafcourse.web

import com.miho.thymeleafcourse.command.LoginCommand
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.validation.Valid

@Controller
@RequestMapping("/login")
class LoginController {

    @GetMapping
    fun getLoginForm(model: Model): String {
        model.addAttribute("loginCommand", LoginCommand())

        return "login-form"
    }

    @PostMapping
    fun login(@Valid loginCommand: LoginCommand, bindingResult: BindingResult) =
            if (bindingResult.hasErrors()) "login-form" else "redirect:/"
}