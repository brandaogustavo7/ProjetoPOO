package br.com.encontresuamateria.colecaodedados;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Aluno;


@Repository
public interface ColecaoAluno extends JpaRepository<Aluno, Long>{


}
