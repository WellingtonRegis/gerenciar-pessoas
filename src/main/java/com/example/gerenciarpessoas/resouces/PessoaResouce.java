package com.example.gerenciarpessoas.resouces;

import com.example.gerenciarpessoas.entities.Pessoa;
import com.example.gerenciarpessoas.repositories.PessoaRepository;
import com.example.gerenciarpessoas.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResouce {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PessoaService pessoaService;



    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa>list = pessoaService.findAll();
        return ResponseEntity.ok().body(list);
    }


}
