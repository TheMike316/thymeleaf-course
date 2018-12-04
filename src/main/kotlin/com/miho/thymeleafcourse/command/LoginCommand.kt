package com.miho.thymeleafcourse.command

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class LoginCommand(@field: [NotBlank Size(min = 5, max = 50)] var username: String = "",
                   @field: [NotBlank Size(min = 16, max = 50)] var password: String = "")