package model

class Empresa extends Pessoa {
    String cnpj
    String pais

    @Override
    String exibeInformacoes() {
        return ("""
                Nome: ${nome}
                CNPJ: ${cnpj}
                E-mail: ${email}
                País: ${pais}
                Estado: ${estado}
                CEP: ${cep}
                Descrição: ${descricao}
                Competências: ${competencias.join(", ")}
                """.stripIndent().trim()
                )
    }
}
