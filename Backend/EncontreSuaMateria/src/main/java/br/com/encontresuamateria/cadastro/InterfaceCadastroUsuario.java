package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.encontresuamateria.basicas.Usuario;

@Repository
public interface InterfaceCadastroUsuario {
	
	Usuario procurarUsuarioId(long id);
	
	List<Usuario> procurarUsuarioNome(String nome);
	
	List<Usuario> listarUsuarios();
	
	Usuario salvarUsuario(Usuario Entity);
	
	void deletarUsuario(Usuario usuario);
	
	void deletarUsuarioId(long id);
}
