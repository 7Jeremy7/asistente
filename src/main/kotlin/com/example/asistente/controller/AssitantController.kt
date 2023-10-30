package com.example.asistente.controller

import com.example.asistente.model.Assistant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.example.asistente.service.AssistantService

@RestController
@RequestMapping("/Asistente")
class AssitantController {
    @Autowired
    lateinit var AssistantService: AssistantService

    @GetMapping
    fun list ():List <Assistant>{
        return AssistantService.list()
    }
    @PostMapping
    fun save (@RequestBody modelo: Assistant): ResponseEntity<Assistant> {
        return ResponseEntity(AssistantService.save(modelo), HttpStatus.OK)
    }
}