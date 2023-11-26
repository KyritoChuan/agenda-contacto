package com.api.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.api.agenda.models.Contacto;

import jakarta.transaction.Transactional;

public interface AgendaRepository extends JpaRepository<Contacto, Integer> {
    Contacto findByEmail(String email);

    // @Transactional
    // @Modifying
    // @Query("Delete from contacto c where c.email=?1")
    // void eliminarEmail(String email);
}
