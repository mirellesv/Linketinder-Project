package service

import model.Candidato
import model.Empresa

class ServicoCadastro {
    private List<Candidato> candidatos = []
    private List<Empresa> empresas = []

    void adicionarCandidato(Candidato novoCandidato){
        candidatos.add(novoCandidato)
    }

    void adicionarEmpresa(Empresa novaEmpresa){
        empresas.add(novaEmpresa)
    }

    List<Candidato> listarCandidatos(){
        println "\n--- CANDIDATOS ---"
        candidatos.eachWithIndex{ candidato, int indice ->
            println "\n Candidato ${indice}: "
            println candidato.exibeInformacoes()
        }
    }

    List<Empresa> listarEmpresas(){
        println "\n--- EMPRESAS ---"
        empresas.eachWithIndex{ Empresa empresa, int indice ->
            println "\n Empresa ${indice}"
            println empresa.exibeInformacoes()
        }
    }

    void criarCandidato(String nome, String cpf, int idade, String email, String estado, String cep, String descricao, List<String> competencias){
        def candidato = new Candidato(
                nome: nome,
                cpf: cpf,
                idade: idade,
                email: email,
                estado: estado,
                cep: cep,
                descricao: descricao,
                competencias: competencias
        )
        adicionarCandidato(candidato)
    }

    void criarEmpresa(String nome, String cnpj, String email, String pais, String estado, String cep, String descricao, List<String> competencias){
        def empresa = new Empresa(
                nome: nome,
                cnpj: cnpj,
                email: email,
                pais: pais,
                estado: estado,
                cep: cep,
                descricao: descricao,
                competencias: competencias
        )
        adicionarEmpresa(empresa)
    }
}
