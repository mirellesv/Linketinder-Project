package model

interface IPessoa {
    String getNome()
    String getEmail()
    List<String> getCompetencias()
    String exibeInformacoes()
}