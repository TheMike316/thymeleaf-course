package com.miho.thymeleafcourse.command

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CheckoutCommand(@field: [NotEmpty Size(min = 2, max = 50)] var firstName: String = "",
                           @field: [NotEmpty Size(min = 2, max = 50)] var lastName: String = "",
                           @field: [NotEmpty Size(min = 2, max = 50)] var addressLine1: String = "",
                           var addressLine2: String = "",
                           @field: [NotEmpty Size(min = 2, max = 50)] var city: String = "",
                           @field: [NotEmpty Size(min = 2, max = 2)] var stateCode: String = "",
                           @field: [NotEmpty Size(min = 2, max = 10)] var zip: String = "")
