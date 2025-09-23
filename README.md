# 📌 Cadastro de Usuários - CRUD 🚀  

![Java](https://img.shields.io/badge/Java%2021-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)  
![H2 Database](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge&logo=databricks&logoColor=white)  
![Status](https://img.shields.io/badge/CRUD-Completo-success?style=for-the-badge&logo=checkmarx&logoColor=white)  

<p align="center">
  <img src="https://images.openai.com/thumbnails/url/QRQLynicu1mUUVJSUGylr5-al1xUWVCSmqJbkpRnoJdeXJJYkpmsl5yfq5-Zm5ieWmxfaAuUsXL0S7F0Tw4xSyo39U4qN6soNK0wdwnxyowqyA6rcsxONtYtDo8PrigPSPV2qTQy9fYpdkuJ9DIpcs1JdzY0S41XKwYAzSEpHw" width="400px" alt="Backend development"/>
</p>  

---

## 📖 Sobre o Projeto  
Este é um **CRUD simples** desenvolvido com **Java 21** e **Spring Boot**, com o objetivo de praticar e demonstrar o uso do **Spring Data JPA** para persistência de dados em um **H2 Database (em memória)**.  

O sistema permite:  
➕ **Cadastrar** usuários  
📋 **Listar** usuários  
🔄 **Atualizar** usuários  
❌ **Excluir** usuários  

Servindo como uma **base sólida** para projetos maiores que necessitam de **gestão de entidades**.  

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

src/main/java/com.joaodev.cadastro-usuario
┣ 📂 business → Regras de negócio (ex.: UsuarioService)  

┣ 📂 controller → Endpoints REST (ex.: UsuarioController)  

┣ 📂 infrastructure  

┃ ┗ 📂 entitys → Entidades do sistema (ex.: Usuario)  

┣ 📂 repository → Interfaces Spring Data JPA (ex.: UsuarioRepository)  

┗ 📜 CadastroUsuarioApplication → Classe principal para rodar a aplicação  




🔹 **Controller** → recebe as requisições HTTP e retorna respostas.  
🔹 **Service (business)** → concentra a lógica de negócio.  
🔹 **Repository** → comunicação com o banco de dados via Spring Data JPA.  
🔹 **Entitys** → modelos/tabelas da aplicação.  

---




---

## 🚀 Como Executar  
<p align="center">
  <img src="https://camo.githubusercontent.com/32938c5cfc76ec1c984b9a5d968aa4c815470f2b86c080699351d67434963ed0/68747470733a2f2f6d656469612e67697068792e636f6d2f6d656469612f5a56696b377042747539644e532f67697068792e676966" width="300px" alt="CRUD gif"/>
</p>


1. Clone o repositório:  
   ```bash
   git clone https://github.com/seu-usuario/cadastro-usuario-crud.git
Acesse a pasta do projeto e rode a aplicação com Spring Boot:


mvn spring-boot:run
Acesse o sistema no navegador:


http://localhost:8080/usuarios
Banco de dados H2 Console:



http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

User: sa (usuário que vem por padrão no H2, mas que pode ser alterado para um de sua escolha)

Password: (em branco)

✍️ Autor
👨‍💻 João Miguel


