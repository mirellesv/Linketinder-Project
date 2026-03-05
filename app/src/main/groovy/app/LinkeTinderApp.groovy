package app

import data.SeedData
import model.Candidato
import model.Empresa
import ui.Menu

class LinkeTinderApp {
    static void main(String[] args) {
        List<Candidato> candidatos = SeedData.seedCandidatos();
        List<Empresa> empresas = SeedData.seedEmpresas();

        def scanner = new Scanner(System.in)

        while(true){
            Menu.exibirMenu()
            String opcao = scanner.nextLine().trim()

            switch(opcao){
                case "1":
                    Menu.listarCandidatos(candidatos)
                    break
                case "2":
                    Menu.listarEmpresas(empresas)
                    break
                case "0":
                    println "Saindo..."
                    return
                default:
                    println "Opção inválida!"
            }
        }
    }
}
