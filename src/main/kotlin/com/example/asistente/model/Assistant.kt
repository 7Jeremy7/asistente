package com.example.asistente.model

import jakarta.persistence.*


@Entity
@Table(name = "asssistant")
class Assistant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var title: String? = null
    var description: String? = null
    var city: String? = null
    @Column(name="total_assistant")
    var totalAssistant: Long? = null
}


