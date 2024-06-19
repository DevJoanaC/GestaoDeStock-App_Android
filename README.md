# 📱 Aplicação de Gestão de Stock

Este repositório contém o código-fonte de uma aplicação mobile de gestão de stock desenvolvida em Kotlin. A aplicação foi criada como parte de um projeto prático para o curso de Software Developer e inclui funcionalidades básicas de login, registro e consulta de produtos.

## 📋 Objetivos do Projeto
- Elaborar um programa que cumpra os pré-requisitos especificados.
- Incluir comentários no código-fonte.
- Otimização do código.
- Garantir que o programa execute sem erros de compilação.
- Desenvolver a aplicação utilizando a linguagem Kotlin.

## 🚀 Funcionalidades

### 1. SplashScreen
A aplicação possui uma SplashScreen personalizada que é mostrada ao iniciar a aplicação.

### 2. Login
A aplicação inclui um menu de login com as seguintes credenciais:
- **Username:** admin | **Password:** password123
- **Username:** it | **Password:** pastelNata

Se o login for inválido, é mostrada uma mensagem Toast informando o utilizador.

### 3. Página Inicial
Após um login bem-sucedido, o uitlizador é redirecionado para uma página inicial com a mensagem:
- Bem-vindo/a (nome do utilizador que efetuou login)

Nesta página, há dois botões:
- **Registar Novo Produto**
- **Logout**

### 4. Registro de Novo Produto
A página de registro de novo produto permite a inserção de no mínimo três informações sobre o produto. Após preencher todos os campos, o utilizador pode:
- **Retroceder:** Voltar para a atividade anterior com os campos preenchidos.
- **Confirmar:** Confirmar a inserção do produto, redirecionando para o Menu Inicial com uma mensagem Toast de confirmação.

### 5. Logout
O botão de logout redireciona o utilizador para a página de login.

## 📁 Estrutura do Projeto
O projeto está organizado da seguinte forma:
- `SplashScreen.kt`: Código da SplashScreen personalizada.
- `LoginActivity.kt`: Código da página de login.
- `MainActivity.kt`: Código da página inicial após login.
- `NovoProdutoActivity.kt`: Código da atividade de registro de novo produto.
- `RegistarProdutoActivity.kt`: Código da atividade de confirmação de registro de produto.
- `res/`: Diretório contendo recursos da aplicação, como layouts e strings.

