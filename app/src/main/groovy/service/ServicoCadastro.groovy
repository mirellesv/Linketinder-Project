package service

import model.Candidato
import model.Empresa

class ServicoCadastro {
    private List<Candidato> candidatos = []
    private List<Empresa> empresas = []

    void adicionarCandidato(Candidato novoCandidato){
        candidatos.add(novoCandidato)
    }

    List<Candidato> listarCandidatos(){
        return candidatos
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
}
