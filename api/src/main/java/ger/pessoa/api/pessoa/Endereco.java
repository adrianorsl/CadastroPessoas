package ger.pessoa.api.pessoa;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	
	private String logradouro;
	private String numero;
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	private Principal principal;

	
	public Endereco(RecordEndereco dado) {
		this.logradouro = dado.logradouro();
		this.numero = dado.numero();
		this.cidade = dado.cidade();
		this.principal = dado.principal();
	}


}
