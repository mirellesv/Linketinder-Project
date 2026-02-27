# Linketinder — ZG-Hero Project

## Sobre o Projeto

O **Linketinder** é um sistema inspirado no LinkedIn e no Tinder, desenvolvido como MVP (Minimum Viable Product) com o objetivo de simular um sistema simples de contratação baseado em **competências (skills)**.

A proposta é conectar **empresas recrutadoras** e **candidatos**, utilizando como critério principal suas competências técnicas.

##  Objetivo

Implementar o back-end de um sistema simples que:

- Armazena candidatos e empresas
- Permite visualizar seus dados
- Organiza competências em formato de lista
- Aplica conceitos de POO

## Estrutura do Projeto

### app
Contém a classe principal (main).

## data
Contém os dados pré-cadastrados.

### model
Contém as entidades (Pessoa, Candidato, Empresa).

### ui
Contém o menu e entrada de dados.

## Modelos Implementados

### 👤 Candidato
- Nome
- E-mail
- CPF
- Idade
- Estado
- CEP
- Descrição pessoal
- Lista de competências

### 🏢 Empresa
- Nome
- E-mail corporativo
- CNPJ
- País
- Estado
- CEP
- Descrição da empresa
- Lista de competências desejadas

---

## ✅ Requisitos Obrigatórios Atendidos

- ✔️ Lista com no mínimo 5 candidatos pré-cadastrados
- ✔️ Lista com no mínimo 5 empresas pré-cadastradas
- ✔️ Competências armazenadas em lista
- ✔️ Menu interativo no terminal
- ✔️ Listagem completa de candidatos e empresas

---

## ⭐ Funcionalidades Opcionais Implementadas

- ✔️ Cadastro de novos candidatos via terminal
- ✔️ Cadastro de novas empresas via terminal

## ▶️ Como Executar

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/mirellesv/Linketinder-Project.git
```

### 2️⃣ Acesse o diretório
```bash
cd Linketinder-Project
```

### 3️⃣ Compile o projeto
```bash
javac Main.java
```

### 4️⃣ Execute
```bash
java Main
```