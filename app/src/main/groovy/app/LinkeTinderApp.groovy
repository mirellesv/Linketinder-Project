package app

import data.SeedData
import model.Candidato
import model.Empresa
import service.ServicoCadastro
import ui.Menu

class LinkeTinderApp {
    static void main(String[] args) {
        def servicoCadastro = new ServicoCadastro()

        def scanner = new Scanner(System.in)

        while(true){
            Menu.exibirMenu()
            String opcao = scanner.nextLine().trim()

            switch(opcao){
                case "1":
                    try {
                        println "==== CADASTRO DE CANDIDATO ===="
                        print "Nome: "
                        String nome = scanner.nextLine()
                        print "CPF: "
                        String cpf = scanner.nextLine()
                        print "Idade: "
                        int idade = Integer.parseInt(scanner.nextLine())
                        print "E-mail: "
                        String email = scanner.nextLine()
                        print "Estado: "
                        String estado = scanner.nextLine()
                        print "CEP: "
                        String cep = scanner.nextLine()
                        print "Descrição: "
                        String descricao = scanner.nextLine()
                        print "Competências (separadas por vírgula): "
                        List<String> competencias = scanner.nextLine().split(",").collect { it.trim() }

                        servicoCadastro.criarCandidato(nome, cpf, idade, email, estado, cep, descricao, competencias)
                        println "\nCandidato cadastrado com sucesso!"
                    }catch(Exception e){
                        println "Erro ao cadastrar candidato: ${e.message}"
                        e.printStackTrace()
                    }
                    break
                case "2":
                    println "==== CADASTRO DE EMPRESA ===="
                    print "Nome: "
                    String nome = scanner.nextLine()
                    print "CNPJ: "
                    String cnpj = scanner.nextLine()
                    print "E-mail: "
                    String email = scanner.nextLine()
                    print "País: "
                    String pais = scanner.nextLine()
                    print "Estado: "
                    String estado = scanner.nextLine()
                    print "CEP: "
                    String cep = scanner.nextLine()
                    print "Descrição: "
                    String descricao = scanner.nextLine()
                    print "Competências (separadas por vírgula): "
                    List<String> competencias = scanner.nextLine().split(",").collect(it -> it.trim())

                    servicoCadastro.criarEmpresa(nome, cnpj, email, pais, estado, cep, descricao, competencias)
                    println "\n Empresa cadastrada com sucesso!"
                    break
                case "3":
                    servicoCadastro.listarCandidatos()
                    break
                case "4":
                    servicoCadastro.listarEmpresas()
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
