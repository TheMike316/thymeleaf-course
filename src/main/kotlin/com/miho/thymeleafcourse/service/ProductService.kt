package com.miho.thymeleafcourse.service

import com.miho.thymeleafcourse.domain.Author
import com.miho.thymeleafcourse.domain.Product
import com.miho.thymeleafcourse.domain.ProductCategory
import org.springframework.stereotype.Service
import java.math.BigDecimal


@Service
class ProductService {

    private val productMap: Map<Long, Product> = createProductMap()

    fun getProduct(id: Long) = productMap[id]

    fun getAllProducts() = productMap.values

    private fun createProductMap(): Map<Long, Product> {
        val jt = Author()
        jt.firstName = "John"
        jt.lastName = "Thompson"
        jt.id = 1
        jt.image = "instructor_jt.jpg"

        val springIntroCat = ProductCategory()
        springIntroCat.id = 1
        springIntroCat.category = "Spring Introduction"

        val springCoreCat = ProductCategory()
        springCoreCat.id = 2
        springCoreCat.category = "Spring Core"

        val springBootCat = ProductCategory()
        springBootCat.id = 3
        springBootCat.category = "Spring Boot"

        val thymeleafCat = ProductCategory()
        thymeleafCat.id = 4
        thymeleafCat.category = "Thymeleaf"

        val geapCat = ProductCategory()
        geapCat.id = 5
        geapCat.category = "G.E.A.P"


        val springIntro = Product()
        springIntro.id = 1
        springIntro.name = "Introduction to Spring"
        springIntro.subtitle = "Start Learning Spring!"
        springIntro.author = jt
        springIntro.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        springIntro.price = BigDecimal("0")
        springIntro.imageUrl = "SpringIntroThumb.png"
        springIntro.productCategories.add(springIntroCat)
        springIntro.productCategories.add(springBootCat)


        val springCoreUltimate = Product()
        springCoreUltimate.id = 2
        springCoreUltimate.name = "Spring Core Ultimate"
        springCoreUltimate.subtitle = "Ultimate Bundle of Spring Core!"
        springCoreUltimate.author = jt
        springCoreUltimate.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        springCoreUltimate.price = BigDecimal("199")
        springCoreUltimate.imageUrl = "SpringCoreUltimateThumb.png"
        springCoreUltimate.productCategories.add(springCoreCat)
        springCoreUltimate.productCategories.add(springBootCat)

        val thymeleaf = Product()
        thymeleaf.id = 3
        thymeleaf.name = "Thymeleaf"
        thymeleaf.subtitle = "Thymeleaf and Spring!"
        thymeleaf.author = jt
        thymeleaf.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        thymeleaf.price = BigDecimal("199")
        thymeleaf.imageUrl = "ThymeleafThumb.png"
        thymeleaf.productCategories.add(thymeleafCat)

        val springCore = Product()
        springCore.id = 4
        springCore.name = "Spring Core"
        springCore.subtitle = "Spring Core - mastering Spring!"
        springCore.author = jt
        springCore.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        springCore.price = BigDecimal("199")
        springCore.imageUrl = "SpringCoreThumb.png"
        springCore.productCategories.add(springCoreCat)
        springCore.productCategories.add(springBootCat)

        val springCoreAdv = Product()
        springCoreAdv.id = 5
        springCoreAdv.name = "Spring Core Advanced"
        springCoreAdv.subtitle = "Advanced Spring Core!"
        springCoreAdv.author = jt
        springCoreAdv.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        springCoreAdv.price = BigDecimal("199")
        springCoreAdv.imageUrl = "SpringCoreAdvanced.png"
        springCoreAdv.productCategories.add(springCoreCat)
        springCoreAdv.productCategories.add(springBootCat)


        val springCoreDevOps = Product()
        springCoreDevOps.id = 6
        springCoreDevOps.name = "Spring Core Dev-Ops"
        springCoreDevOps.subtitle = "Deploying Spring in the Enterprise and the cloud!"
        springCoreDevOps.author = jt
        springCoreDevOps.description = "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use."
        springCoreDevOps.price = BigDecimal("199")
        springCoreDevOps.imageUrl = "SpringCoreDevOps.png"
        springCoreDevOps.productCategories.add(springCoreCat)
        springCoreDevOps.productCategories.add(springBootCat)


        return mapOf(1L to springIntro, 2L to springCoreUltimate, 3L to thymeleaf,
                4L to springCore, 5L to springCoreAdv, 6L to springCoreDevOps)
    }
}
