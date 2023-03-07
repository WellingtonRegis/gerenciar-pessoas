package com.example.gerenciarpessoas.config;

import com.example.gerenciarpessoas.entities.Endereco;
import com.example.gerenciarpessoas.entities.Pessoa;
import com.example.gerenciarpessoas.repositories.EnderecoRepository;
import com.example.gerenciarpessoas.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa1 = new Pessoa(null, "Arme", 20, 789654321-82, "armearme@Gmail.com", 95599-1484);
        Pessoa pessoa2 = new Pessoa(null, "Amy", 19, 789654654-78, "amyidoll@Gmail.com", 96699-1484);
        Pessoa pessoa3 = new Pessoa(null, "Edel Frost", 22, 789654753-85, "edelfrost@Gmail.com", 98899-1484);
        Pessoa pessoa4 = new Pessoa(null, "Elesis Sieghart", 26, 789654357-98, "elesissieghart@Gmail.com", 93399-1484);
        Pessoa pessoa5 = new Pessoa(null, "Holy", 23, 789654482-45, "holyholica@Gmail.com", 97799-1484);
        Pessoa pessoa6 = new Pessoa(null, "lin", 24, 789654975-32, "lingaon@Gmail.com", 92299-1484);


        Endereco endereco1 = new Endereco(null, "Rua Jose Abramo", 98456-987, 987, "São Paulo", pessoa1);
        Endereco endereco2 = new Endereco(null, "Rua Das Flores", 98456-977, 97, "São Paulo", pessoa2);
        Endereco endereco3 = new Endereco(null, "Rua Da meca", 98456-927, 87, "São Paulo", pessoa3);
        Endereco endereco4 = new Endereco(null, "Rua Jose Alvim", 98456-654, 79, "São Paulo", pessoa4);
        Endereco endereco5 = new Endereco(null, "Rua Vitoria", 98456-123, 754, "São Paulo", pessoa5);
        Endereco endereco6 = new Endereco(null, "Rua Bela Vista", 98456-054, 555, "São Paulo", pessoa6);

        pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6));
        enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4, endereco5, endereco6));

}
}
