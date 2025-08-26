# 📌 Cadastro de Usuários - CRUD

## 📖 Sobre o Projeto
Este é um projeto **CRUD simples** desenvolvido com **Java 21** e **Spring Boot**, com o objetivo de praticar e demonstrar o uso das principais funcionalidades do **Spring Data JPA** para persistência de dados em um banco **H2 Database (em memória)**.  

O sistema permite **cadastrar, listar, atualizar e excluir usuários**, servindo como uma base sólida para projetos maiores que necessitam de gestão de entidades.

---

## 🛠️ Tecnologias Utilizadas
- ☕ **Java 21 (JDK 21)**
- 🌱 **Spring Boot**
- 🗄️ **Spring Data JPA**
- 🛢️ **H2 Database** (banco em memória)
- 📝 **Lombok**
- ⚙️ **Maven**

---

## 📂 Arquitetura do Projeto
O projeto segue uma **arquitetura em camadas simples**, organizada da seguinte forma:

src/main/java/com.joaodev.cadastro-usuario
┣ 📂 business → Contém as regras de negócio (ex.: UsuarioService)
┣ 📂 controller → Camada responsável pelos endpoints REST (ex.: UsuarioController)
┣ 📂 infrastructure
┃ ┗ 📂 entitys → Representa as entidades do sistema (ex.: Usuario)
┣ 📂 repository → Interfaces do Spring Data JPA para comunicação com o banco (ex.: UsuarioRepository)
┗ 📜 CadastroUsuarioApplication → Classe principal para iniciar a aplicação



Essa divisão facilita a manutenção e a compreensão do código, separando de forma clara:
- **Controller** → recebe as requisições HTTP e retorna as respostas.  
- **Service (business)** → concentra a lógica de negócio.  
- **Repository** → faz a comunicação com o banco de dados através do Spring Data JPA.  
- **Entitys** → representa os modelos/tabelas da aplicação.  



---

## ⚡ Funcionalidades
- ➕ **Cadastrar Usuário**  
- 📋 **Listar Usuários**  
- 🔄 **Atualizar Usuário**  
- ❌ **Excluir Usuário**  

---

## ✍️ Autor

👨‍💻 João Miguel



