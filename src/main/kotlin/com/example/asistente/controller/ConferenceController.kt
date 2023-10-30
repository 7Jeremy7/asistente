package com.example.asistente.controller


import com.example.asistente.model.Conference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.example.asistente.service.ConferenceService


@RestController
@RequestMapping("/Conference")
class ConferenceController {
    @Autowired
    lateinit var ConferenceService: ConferenceService

    @GetMapping
    fun list ():List <Conference>{
        return ConferenceService.list()
    }
    @PostMapping
    fun save (@RequestBody modelo: Conference): ResponseEntity<Conference> {
        return ResponseEntity(ConferenceService.save(modelo), HttpStatus.OK)
    }
}