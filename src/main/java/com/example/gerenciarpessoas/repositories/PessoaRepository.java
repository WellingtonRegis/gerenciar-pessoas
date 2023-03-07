package com.example.gerenciarpessoas.repositories;

import com.example.gerenciarpessoas.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
