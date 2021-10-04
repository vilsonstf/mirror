package com.fatesg.ads4.projetoMirror;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fatesg.ads4.projetoMirror.services.DBServices;

@SpringBootApplication
public class ProjetoMirrorApplication {
	
	@Autowired
	private DBServices dbService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoMirrorApplication.class, args);
		
	}
	
	@Bean
	public boolean instanciaBancoDados() throws ParseException {
		dbService.instanciarBaseDados();
		return true;
		}


}
