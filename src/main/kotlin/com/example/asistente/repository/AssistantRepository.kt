package com.example.asistente.repository

import com.example.asistente.model.Assistant
import org.springframework.data.jpa.repository.JpaRepository

interface AssistantRepository: JpaRepository<Assistant, Long?> {

    fun findById (id: Long?): Assistant?

}