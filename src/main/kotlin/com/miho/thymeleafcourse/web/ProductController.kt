package com.miho.thymeleafcourse.web

import com.miho.thymeleafcourse.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class ProductController(private val productService: ProductService) {

    @GetMapping("/product")
    fun getProduct() = "redirect:/index"

    @GetMapping("/product/{id}")
    fun getProductById(@PathVariable id: Long, model: Model): String {
        model.addAttribute("product", productService.getProduct(id))

        return "product"
    }
}