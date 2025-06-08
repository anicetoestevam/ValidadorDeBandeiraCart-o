# Validador de Bandeira de Cartão de Crédito

Este projeto é uma aplicação Java simples que identifica a bandeira de um cartão de crédito (Visa, MasterCard, Amex, etc.) a partir do número informado e pode ser utilizada via terminal.

## ✨ Funcionalidades

- **Identificação automática da bandeira** (Visa, MasterCard, Amex, etc.)
- **Linguagem utilizada Java**
- **Compatível com cartões de teste gerados pelo [4Devs](https://www.4devs.com.br/gerador_de_numero_cartao_credito)**

## 🛠️ Como Usar

### 1. Gere um número de cartão de crédito para teste

Acesse o site [4Devs - Gerador de Cartão de Crédito](https://www.4devs.com.br/gerador_de_numero_cartao_credito)  
Escolha a bandeira desejada e gere um número válido.

### 2. Compile o projeto

Na pasta código, você terá acesso aos dois arquivos `ValidadorBandeiraCartao.java` e `Main.java`.


### 3. Execute o programa no Online GDB

https://www.onlinegdb.com/


### 4. Digite o número do cartão

Cole o número gerado pelo site 4Devs quando solicitado.

O programa irá identificar a bandeira do cartão e exibir no terminal.

## 🗂️ Estrutura dos Arquivos

- `Main.java`: Responsável pela interface via terminal.
- `ValidadorBandeiraCartao.java`: Contém o método estático para identificar a bandeira do cartão.

