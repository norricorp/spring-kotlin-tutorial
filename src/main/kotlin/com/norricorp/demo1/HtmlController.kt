package com.norricorp.demo1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController() {

  @GetMapping("/")
  fun blog(model: Model): String {
    println("NORRIS: into htmlcontroller")
    model["title"] = "Blog"
    return "blog"
  }

}
