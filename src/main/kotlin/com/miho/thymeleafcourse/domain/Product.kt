package com.miho.thymeleafcourse.domain

import java.math.BigDecimal

data class Product(var name: String = "", var subtitle: String = "", var description: String = "",
                   var author: Author? = null, var price: BigDecimal = BigDecimal.ZERO, var productCategories: MutableList<ProductCategory> = mutableListOf(),
                   var imageUrl: String = "", var id: Long = -1)