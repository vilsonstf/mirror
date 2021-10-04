package com.fatesg.ads4.projetoMirror.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatesg.ads4.projetoMirror.domain.Cidade;
import com.fatesg.ads4.projetoMirror.domain.Estado;
import com.fatesg.ads4.projetoMirror.repositories.CidadeRepository;
import com.fatesg.ads4.projetoMirror.repositories.EstadoRepository;

@Service
public class DBServices {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public void instanciarBaseDados() {

		Estado estado1 = new Estado(null, "AC", "Acre");
		Estado estado2 = new Estado(null, "AL", "Alagoas");
		Estado estado3 = new Estado(null, "AP", "Amapá");
		Estado estado4 = new Estado(null, "AM", "Amazonas");
		Estado estado5 = new Estado(null, "BA", "Bahia");
		Estado estado6 = new Estado(null, "CE", "Ceará");
		Estado estado7 = new Estado(null, "DF", "Distrito Federal");
		Estado estado8 = new Estado(null, "ES", "Espírito Santo");
		Estado estado9 = new Estado(null, "GO", "Goiás");
		Estado estado10 = new Estado(null, "MA", "Maranhão");
		Estado estado11 = new Estado(null, "MT", "Mato Grosso");
		Estado estado12 = new Estado(null, "MS", "Mato Grosso do Sul");
		Estado estado13 = new Estado(null, "MG", "Minas Gerais");
		Estado estado14 = new Estado(null, "PA", "Pará");
		Estado estado15 = new Estado(null, "PB", "Paraíba");
		Estado estado16 = new Estado(null, "PR", "Paraná");
		Estado estado17 = new Estado(null, "PE", "Pernambuco");
		Estado estado18 = new Estado(null, "PI", "Piauí");
		Estado estado19 = new Estado(null, "RJ", "Rio de Janeiro");
		Estado estado20 = new Estado(null, "RN", "Rio Grande do Norte");
		Estado estado21 = new Estado(null, "RS", "Rio Grande do Sul");
		Estado estado22 = new Estado(null, "RO", "Rondônia");
		Estado estado23 = new Estado(null, "RR", "Roraima");
		Estado estado24 = new Estado(null, "SC", "Santa Catarina");
		Estado estado25 = new Estado(null, "SP", "São Paulo");
		Estado estado26 = new Estado(null, "SE", "Sergipe");
		Estado estado27 = new Estado(null, "TO", "Tocantins");

		Cidade cidade1 = new Cidade(null, "Rio Branco", estado1);
		Cidade cidade2 = new Cidade(null, "Acrêlandia", estado1);
		Cidade cidade3 = new Cidade(null, "Maceio", estado2);
		Cidade cidade4 = new Cidade(null, "Campo Alegre", estado2);
		Cidade cidade5 = new Cidade(null, "Macapá", estado3);
		Cidade cidade6 = new Cidade(null, "Aroeira", estado3);
		Cidade cidade7 = new Cidade(null, "Manaus", estado4);
		Cidade cidade8 = new Cidade(null, "Manauara", estado4);
		Cidade cidade9 = new Cidade(null, "Salvador", estado5);
		Cidade cidade10 = new Cidade(null, "Ilhéus", estado5);
		Cidade cidade11 = new Cidade(null, "Fortaleza", estado6);
		Cidade cidade12 = new Cidade(null, "Sobral", estado6);
		Cidade cidade13 = new Cidade(null, "Brasilia", estado7);
		Cidade cidade14 = new Cidade(null, "Asa Sul", estado7);
		Cidade cidade15 = new Cidade(null, "Vitória", estado8);
		Cidade cidade16 = new Cidade(null, "Colatina", estado8);
		Cidade cidade17 = new Cidade(null, "Goiânia", estado9);
		Cidade cidade18 = new Cidade(null, "Caldas Novas", estado9);
		Cidade cidade19 = new Cidade(null, "São Luis", estado10);
		Cidade cidade20 = new Cidade(null, "Tum Tum", estado10);
		Cidade cidade21 = new Cidade(null, "Cuiabá", estado11);
		Cidade cidade22 = new Cidade(null, "Sinop", estado11);
		Cidade cidade23 = new Cidade(null, "Campo Grande", estado12);
		Cidade cidade24 = new Cidade(null, "Corumbá", estado12);
		Cidade cidade25 = new Cidade(null, "Belo Horizonte", estado13);
		Cidade cidade26 = new Cidade(null, "Uberlandia", estado13);
		Cidade cidade27 = new Cidade(null, "Belém", estado14);
		Cidade cidade28 = new Cidade(null, "Rondon", estado14);
		Cidade cidade29 = new Cidade(null, "João Pessoa", estado15);
		Cidade cidade30 = new Cidade(null, "Patos", estado15);
		Cidade cidade31 = new Cidade(null, "Curitiba", estado16);
		Cidade cidade32 = new Cidade(null, "Londrina", estado16);
		Cidade cidade33 = new Cidade(null, "Recife", estado17);
		Cidade cidade34 = new Cidade(null, "Caruaru", estado17);
		Cidade cidade35 = new Cidade(null, "Terezina", estado18);
		Cidade cidade36 = new Cidade(null, "Floriano", estado18);
		Cidade cidade37 = new Cidade(null, "Rio de Janeiro", estado19);
		Cidade cidade38 = new Cidade(null, "Méier", estado19);
		Cidade cidade39 = new Cidade(null, "Natal", estado20);
		Cidade cidade40 = new Cidade(null, "Mossoró", estado20);
		Cidade cidade41 = new Cidade(null, "Porto Alegre", estado21);
		Cidade cidade42 = new Cidade(null, "Gramados", estado21);
		Cidade cidade43 = new Cidade(null, "Porto Velho", estado22);
		Cidade cidade44 = new Cidade(null, "Ariquemes", estado22);
		Cidade cidade45 = new Cidade(null, "Boa Vista", estado23);
		Cidade cidade46 = new Cidade(null, "Bonfim", estado23);
		Cidade cidade47 = new Cidade(null, "Florianopolis", estado24);
		Cidade cidade48 = new Cidade(null, "Balneario Camburiu", estado24);
		Cidade cidade49 = new Cidade(null, "São Paulo", estado25);
		Cidade cidade50 = new Cidade(null, "Ribeirão Preto", estado25);
		Cidade cidade51 = new Cidade(null, "Aracaju", estado26);
		Cidade cidade52 = new Cidade(null, "Praiana", estado26);
		Cidade cidade53 = new Cidade(null, "Palmas", estado27);
		Cidade cidade54 = new Cidade(null, "Taguatinga", estado27);

		estado1.getCidades().addAll(Arrays.asList(cidade1, cidade2));
		estado2.getCidades().addAll(Arrays.asList(cidade3, cidade4));
		estado3.getCidades().addAll(Arrays.asList(cidade5, cidade6));
		estado4.getCidades().addAll(Arrays.asList(cidade7, cidade8));
		estado5.getCidades().addAll(Arrays.asList(cidade9, cidade10));
		estado6.getCidades().addAll(Arrays.asList(cidade11, cidade12));
		estado7.getCidades().addAll(Arrays.asList(cidade13, cidade14));
		estado8.getCidades().addAll(Arrays.asList(cidade15, cidade16));
		estado9.getCidades().addAll(Arrays.asList(cidade17, cidade18));
		estado10.getCidades().addAll(Arrays.asList(cidade19, cidade20));
		estado11.getCidades().addAll(Arrays.asList(cidade21, cidade22));
		estado12.getCidades().addAll(Arrays.asList(cidade23, cidade24));
		estado13.getCidades().addAll(Arrays.asList(cidade25, cidade26));
		estado14.getCidades().addAll(Arrays.asList(cidade27, cidade28));
		estado15.getCidades().addAll(Arrays.asList(cidade29, cidade30));
		estado16.getCidades().addAll(Arrays.asList(cidade31, cidade32));
		estado17.getCidades().addAll(Arrays.asList(cidade33, cidade34));
		estado18.getCidades().addAll(Arrays.asList(cidade35, cidade36));
		estado19.getCidades().addAll(Arrays.asList(cidade37, cidade38));
		estado20.getCidades().addAll(Arrays.asList(cidade39, cidade40));
		estado21.getCidades().addAll(Arrays.asList(cidade41, cidade42));
		estado22.getCidades().addAll(Arrays.asList(cidade43, cidade44));
		estado23.getCidades().addAll(Arrays.asList(cidade45, cidade46));
		estado24.getCidades().addAll(Arrays.asList(cidade47, cidade48));
		estado25.getCidades().addAll(Arrays.asList(cidade49, cidade50));
		estado26.getCidades().addAll(Arrays.asList(cidade51, cidade52));
		estado27.getCidades().addAll(Arrays.asList(cidade53, cidade54));

		estadoRepository.saveAll(Arrays.asList(estado1, estado2, estado3, estado4, estado5, estado6, estado7, estado8,
				estado9, estado10, estado11, estado12, estado13, estado14, estado15, estado16, estado17, estado18,
				estado19, estado20, estado21, estado22, estado23, estado24, estado25, estado26, estado27));

		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3, cidade4, cidade5, cidade6, cidade7, cidade8,
				cidade9, cidade10, cidade11, cidade12, cidade13, cidade14, cidade15, cidade16, cidade17, cidade18,
				cidade19, cidade20, cidade21, cidade22, cidade23, cidade24, cidade25, cidade26, cidade27, cidade28,
				cidade29, cidade30, cidade31, cidade32, cidade33, cidade34, cidade35, cidade36, cidade37, cidade38,
				cidade39, cidade40, cidade41, cidade42, cidade43, cidade44, cidade45, cidade46, cidade47, cidade48,
				cidade49, cidade50, cidade51, cidade52, cidade53, cidade54));

	}

}
