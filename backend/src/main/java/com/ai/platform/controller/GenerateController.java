package com.ai.platform.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generate")
public class GenerateController {

    @PostMapping
    public String generate(@RequestBody String prompt) {
        // TODO: call LLM API
        return "Generated code for: " + prompt;
    }
}
