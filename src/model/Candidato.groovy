package model

class Candidato extends Pessoa {
    String cpf
    int idade

    @Override
    String exibeInformacoes() {
        return ("""
                Nome: ${nome}
                CPF: ${cpf}
                Idade: ${idade}
                E-mail: ${email}
                Estado: ${estado}
                CEP: ${cep}
                Descrição: ${descricao}
                Competências: ${competencias.join(", ")}
                """.stripIndent().trim()
        )
    }
}
