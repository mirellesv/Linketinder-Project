package service

import spock.lang.Specification

class ServicoCadastroSpec extends Specification {

    def "deve adicionar candidato na lista ao cadastrar"() {
        given:
        def servico = new ServicoCadastro()

        when:
        servico.criarCandidato(
                "Lucas",
                "12345678900",
                20,
                "lucas@gmail.com",
                "MG",
                "38900-000",
                "Desenvolvedor",
                ["Java", "Groovy"]
        )

        then:
        servico.listarCandidatos().last().nome == "Lucas"
        servico.listarCandidatos().last().cpf == "12345678900"
    }

    def "deve adicionar empresa na lista ao cadastrar"() {
        given:
        def servico = new ServicoCadastro()

        when:
        servico.criarEmpresa(
                "Soft Alimentos",
                "12.345.678/0001-90",
                "rh@softalimentos.com",
                "Brasil",
                "MG",
                "38900-11",
                "Indústria alimentícia em expansão",
                ["Java", "SQL", "Power BI"]
        )

        then:
        servico.listarEmpresas().last().nome == "Soft Alimentos"
        servico.listarEmpresas().last().cnpj == "12.345.678/0001-90"
    }
}