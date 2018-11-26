package com.miho.thymeleafcourse.web

import com.miho.thymeleafcourse.command.CheckoutCommand
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import javax.validation.Valid

@Controller
class CheckoutController {

    @GetMapping("/checkout")
    fun checkoutForm(model: Model): String {
        model.addAttribute("checkoutCommand", CheckoutCommand())

        return "checkout-form"
    }

    @PostMapping("/do-checkout")
    fun doCheckout(@Valid checkoutCommand: CheckoutCommand, bindingResult: BindingResult) =
            if (bindingResult.hasErrors()) "checkout-form" else "checkout-complete"

}