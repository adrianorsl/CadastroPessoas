package ger.pessoa.api.pessoa;

import java.util.List;

public record DadosCadastroPessoa(String nome, String dataNascimento, List<RecordEndereco> endereco) {


}
 