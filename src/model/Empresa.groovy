package model

class Empresa extends Pessoa {
    String cnpj
    String pais

    @Override
    String exibeInformacoes() {
        return ("""
                [EMPRESA]
                CNPJ: ${cpnj}
                País: ${pais}
                """ + super.exibeInformacoes()).stripIndent().trim()
    }
}
