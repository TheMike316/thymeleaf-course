package com.miho.thymeleafcourse.command

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CheckoutCommand(@NotEmpty @Size(min = 2, max = 50) var firstName: String = "",
                           @NotEmpty @Size(min = 2, max = 50) var lastName: String = "",
                           @NotEmpty @Size(min = 2, max = 50) var addressLine1: String = "",
                           var addressLine2: String = "",
                           @NotEmpty @Size(min = 2, max = 50) var city: String = "",
                           @NotEmpty @Size(min = 2, max = 2) var stateCode: String = "",
                           @NotEmpty @Size(min = 2, max = 10) var zip: String = "")