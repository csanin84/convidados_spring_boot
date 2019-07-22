package com.algaworks.festa.repository;

import com.algaworks.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConvidado extends JpaRepository<Convidado, Long> {
}
