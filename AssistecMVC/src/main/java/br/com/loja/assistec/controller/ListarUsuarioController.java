package br.com.loja.assistec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.view.ListarUsuariosView;

public class ListarUsuarioController {
	public ListarUsuariosView lista;

	public ListarUsuarioController() {
		lista = new ListarUsuariosView();
		lista.setLocationRelativeTo(null);
		lista.setVisible(true);
		configurarListeners();
		carregarUsuarios();
	}

	private void configurarListeners() {

		lista.addListarUsuariosListeners(new ListarUsuariosListener());
		lista.addWindowListener(new JanelaAberturaListener());
	}

	private void carregarUsuarios() {

	}

	
	private class ListarUsuariosListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();
			switch(comando) {
			case "BotaoCadastrarAction":
				abrirCadastroUsuario(null);
				break;
			case "BotaoFecharAction":
				lista.dispose();
				
			default:
				break;
			}
		}
	}


	public void abrirCadastroUsuario(Usuario usuarioSelecionado) {
		//new CadastrarUsuaioController(this, usuarioSlecionado);
	}
	
	public class JanelaAberturaListener extends WindowAdapter{
		public void windowOpened(WindowEvent e) {
			carregarUsuarios();
		}
	}
}