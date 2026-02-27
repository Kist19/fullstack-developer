package com.arthurkist.cadastrousuarios;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CadastroUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroUsuariosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UsuariosService usuariosService) {
		return args -> {

			Scanner scanner = new Scanner(System.in);

			System.out.println("=== CADASTRO DE USUÁRIO ===");

			System.out.println("Qual seu nome? ");
			String nome = scanner.nextLine();
			System.out.println("Qual seu email? ");
			String email = scanner.nextLine();
			System.out.println("Qual sua senha? ");
			String senha = scanner.nextLine();

			Usuarios usuario = new Usuarios();
			usuario.setNome(nome);
			usuario.setEmail(email);
			usuario.setSenha(senha);

			usuariosService.salvar(usuario);

			System.out.println("Usuário cadastrado com sucesso!");

			scanner.close();
		};
	}
}