package com.example.asistente.service

import com.example.asistente.model.Assistant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import com.example.asistente.repository.AssistantRepository

@Service
class AssistantService {
    @Autowired
    lateinit var AssistantRepository: AssistantRepository

    fun list ():List<Assistant>{
        return AssistantRepository.findAll()
    }
    fun save(model: Assistant): Assistant {
        try{
            return AssistantRepository.save(model)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun update(model: Assistant): Assistant {
        try {
            AssistantRepository.findById(model.id)
                    ?: throw Exception("ID no existe")

            return AssistantRepository.save(model)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}