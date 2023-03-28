package br.com.encontresuamateria.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.encontresuamateria.basicas.Usuario;
import br.com.encontresuamateria.colecaodedados.ColecaoUsuarios;

public class CadastroUsuario implements InterfaceCadastroUsuario{
	
	@Autowired
	private ColecaoUsuarios colecaoUsuario;

	@Override
	public Usuario procurarUsuarioId(long id) {
		return colecaoUsuario.findById(id).orElse(null);
	}
	
	@Override
	public List<Usuario> procurarUsuarioNome(String nome){
		return colecaoUsuario.findByNomeContaining(nome);
	}
	@Override
	public List<Usuario> listarUsuarios(){
		return colecaoUsuario.findAll();
	}

	@Override
	public Usuario salvarUsuario(Usuario Entity) {
		return colecaoUsuario.save(Entity);
	}

	@Override
	public void deletarUsuario(Usuario usuario) {
		colecaoUsuario.delete(usuario);
	}
	
	@Override
	public void deletarUsuarioId(long id) {
		colecaoUsuario.deleteById(id);
	}

}
