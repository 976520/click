package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.slf4j.LoggerFactory

@Controller
class BlogController {

    private val logger = LoggerFactory.getLogger(BlogController::class.java)

    @GetMapping("/")
    fun blog(model: Model): String {
        logger.info("Accessing blog page") 
        model["title"] = "Click"
        return "click"
    }

    @GetMapping("/error")
    fun handleError(model: Model): String {
        model["title"] = "Error"
        return "error"
    }
}
