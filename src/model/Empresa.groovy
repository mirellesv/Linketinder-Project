package model

class Empresa extends Pessoa {
    String cnpj
    String pais

    @Override
    String exibeInformacoes() {
        return ("""
                [EMPRESA]
                CNPJ: ${cnpj}
                País: ${pais}
                """ + super.exibeInformacoes()).stripIndent().trim()
    }
}
