package ui

import model.Candidato
import model.Empresa

class Menu {
    static void exibirMenu(){
        println "\n=== LINKETINDER ==="
        println "1) Listar candidatos"
        println "2) Listar empresas"
        println "0) Sair"
        println "Escolha: "
    }

    static void listarCandidatos(List<Candidato> candidatos){
        println "\n--- CANDIDATOS ---"
        candidatos.eachWithIndex{ candidato, int indice ->
            println "\n Candidato ${indice}: "
            println candidato.exibeInformacoes()
        }
    }

    static void listarEmpresas(List<Empresa> empresas){
        println "\n--- EMPRESAS ---"
        empresas.eachWithIndex{ Empresa empresa, int indice ->
            println "\n Empresa ${indice}"
            println empresa.exibeInformacoes()
        }
    }
}
