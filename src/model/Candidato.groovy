package model

class Candidato extends Pessoa {
    String cpf
    int idade

    @Override
    String exibeInformacoes() {
        return ("""
                [CANDIDATO]
                CPF: ${cpf},
                Idade: ${idade}
                """ + super.exibeInformacoes().stripIndent().trim()
        )
    }
}
