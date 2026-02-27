package model

abstract class Pessoa implements IPessoa {
    String nome
    String email
    String estado
    String cep
    String descricao
    List<String> competencias = []

    @Override
    String exibeInformacoes() {
        return """
               Nome: ${nome},
               E-mail: ${email},
               Estado: ${estado},
               CEP: ${cep},
               Descrição: ${descricao},
               Competências: ${comptencias.join(", ")}
               """.stripIndent().trim()
    }
}
