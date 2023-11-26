package com.api.agenda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.agenda.models.Contacto;
import com.api.agenda.repositories.AgendaRepository;

@Repository
public class AgendaDaoImpl implements AgendaDao {
    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public void agregarContacto(Contacto contacto) {
        agendaRepository.save(contacto);
    }

    @Override
    public Contacto recuperarContacto(String email) {
        return agendaRepository.findByEmail(email);
    }

    // @Override
    // public void eliminarContacto(String email) {
    // agendaRepository.eliminarEmail(email);
    // }

    @Override
    public List<Contacto> devolverContactos() {
        return agendaRepository.findAll();
    }

    @Override
    public void eliminarContacto(int idContacto) {
        agendaRepository.deleteById(idContacto);
    }

    @Override
    public void actualizarContacto(Contacto contacto) {
        agendaRepository.save(contacto);
    }

    @Override
    public Contacto recuperarContacto(int idContacto) {
        return agendaRepository.findById(idContacto).orElse(null);
    }

}
