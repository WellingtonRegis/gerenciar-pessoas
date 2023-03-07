package com.example.gerenciarpessoas.repositories;

import com.example.gerenciarpessoas.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
