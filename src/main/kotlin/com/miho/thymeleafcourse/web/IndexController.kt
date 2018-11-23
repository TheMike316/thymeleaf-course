package com.miho.thymeleafcourse.web

import com.miho.thymeleafcourse.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController(private val productService: ProductService) {

    @RequestMapping("/")
    fun getIndex(model: Model): String {
        model.addAttribute("products", productService.getAllProducts())

        return "index"
    }
}