package data

import model.Candidato
import model.Empresa

class SeedData {
    static List<Candidato> seedCandidatos(){
        return [
                new Candidato(
                        nome: "Ana Souza",
                        email: "ana@gmail.com",
                        cpf: "123.456-789-00",
                        idade: 22,
                        estado: "MG",
                        cep: "38900-000",
                        descricao: "Estudante, curte back-end e APIs",
                        competencias: ["Java", "Spring Framework", "SQL"]
                ),
                new Candidato(
                        nome: "Bruno Lima",
                        email: "bruno@outlook.com",
                        cpf: "987-654-321-00",
                        idade: 28,
                        estado: "SP",
                        cep: "01000-000",
                        descricao: "Full-stack, gosta de produtos e testes",
                        competencias: ["Node.js", "React", "Git"]
                ),
                new Candidato(
                        nome: "Carla Mendes",
                        email: "carla@gmail.com",
                        cpf: "111.222.333-44",
                        idade: 25,
                        estado: "RJ",
                        cep: "20000-000",
                        descricao: "Dados, ETL e visualização",
                        competencias: ["Python", "SQL", "Docker"]
                ),
                new Candidato(
                        nome: "Diego Alves",
                        email: "diego@outlook.com",
                        cpf: "555-666-777-00",
                        idade: 30,
                        estado: "PR",
                        cep: "20000-000",
                        descricao: "Front-end UX e perfomance",
                        competencias: ["Angular", "Git", "Docker"]
                ),
                new Candidato(
                        nome: "Ester Rocha",
                        email: "ester@gmail.com",
                        idade: 24,
                        estado: "BA",
                        cep: "40000-000",
                        descricao: "IA aplicada, curte visão computacional",
                        competencias: ["Python", "Git"]
                )
        ]
    }

    static List<Empresa> seedEmpresas(){
        return [
                new Empresa(
                        nome: "Soft Alimentos",
                        email: "rh@softalimentos.com",
                        cnpj: "12.345.678/0001-90",
                        pais: "Brasil",
                        estado: "MG",
                        cep: "38900-11",
                        descricao: "Indústria alimentícia em expansão",
                        competencias: ["Java", "SQL", "Power BI"]
                ),
                new Empresa(
                        nome: "Império Agro",
                        email: "talentos@imperioagro.com",
                        cpj: "98.765.432/0001-10",
                        pais: "Brasil",
                        estado: "SP",
                        cep: "01111-222",
                        dsecricao: "Soluções tecnológicas agrícolas",
                        competencias: ["React", "Node.js", "Docker"]
                ),
                new Empresa(
                        nome: "TechMinas",
                        email: "jobs@techminas.com",
                        cnpj: "11.111.111/0001-11",
                        pais: "Brasil",
                        estado: "MG",
                        cep: "38900-000",
                        descricao: "Soluções de software para indústria",
                        competencias: ["Git", "Java", "SQL"]
                ),
                new Empresa(
                        nome: "DataWave",
                        email: "vagas@datawave.ai",
                        cnpj: "22.222.222/0001-22",
                        pais: "Brasil",
                        estado: "RJ",
                        cep: "21000-000",
                        descricao: "Consultoria em dados e IA",
                        competencias: ["Python", "Power BI", "SQL"]
                ),
                new Empresa(
                        nome: "WebSpark",
                        email: "people@webspark.dev",
                        cnpj: "33.333.333/0001-33",
                        pais: "Brasil",
                        estado: "PR",
                        cep: "81000-000",
                        descricao: "Produtos web e mobile",
                        comptencias: ["Angular", "React", "Git"]
                )
        ]
    }

    static List<String> obtemCompetenciasPredefinidas(){
        return [
                "Python", "Java", "JavaScript", "Node.js",
                "SQL", "Power BI", "React","Docker", "Git"
        ]
    }
}
