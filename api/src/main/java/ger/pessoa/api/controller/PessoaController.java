package ger.pessoa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ger.pessoa.api.pessoa.DadosCadastroPessoa;
import ger.pessoa.api.pessoa.Pessoa;
import ger.pessoa.api.pessoa.PessoaRepository;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPessoa dado) {
		repository.save(new Pessoa(dado));
	}
}
  