package com.eventoapp.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.app.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

}
