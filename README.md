# Projeto em Java: Sistema de Gestão de Estoque com Interface Gráfica

## Colaboradores

`@pedroportales` - Pedro Portales

`@IcaroSenaDev` - Ícaro Sena

`@RenanSantos01` - Renan Cardoso

`@xeilongue` - João Victor

`@XaolinMataPorco` - Ryan

## Estrutura do Projeto
No diretório raiz do projeto, teremos os seguintes arquivos:
- `mercadinhoBomDelicia.sql`: Script SQL responsável pela criação do banco de dados e tabelas que serão utilizadas no projeto (mais pra frente iremos utilizar ele no MySQL Workbench)
- `pom.xml`: Arquivo XML responsável pela configuração do projeto, assim como a declaração de dependências do projeto.

### Código-fonte
Dentro de `src/main/java` temos 4 pacotes, sendo eles:
- `connection`: Contém a classe ConnectionFactory, responsável pela conexão da aplicação com o MySQL, utilizando o driver JDBC.
- `model.bean`: Contém duas classes sendo elas
  - `Produtos`: Onde estão localizados os métodos `get` e `set` dos atributos referentes a cada coluna da tabela `produtos`
  - `Funcionarios`: Onde estão localizados os métodos `get` e `set` dos atributos referentes a cada coluna da tabela `funcionarios`
- `model.dao`: Com as seguintes classes
  - `ProdutoDAO`: Responsável pelos métodos que utilizam conexão com o banco de dados referentes a tabela `produtos`
  - `FuncionarioDAO`: Responsável pelos métodos que utilizam conexão com o banco de dados referentes a tabela `funcionarios`

Nesses três pacotes referentes ao banco de dados, os responsáveis foram @pedroportales e @RenanSantos01 .

- `view`: Contém as classes e formulários referentes ao front-end (@IcaroSenaDev como responsável, com apoio de @pedroportales) e back-end (@xeilongue e @XaolinMataPorco como responsáveis, com apoio de @IcaroSenaDev e @pedroportales) da aplicação,.

## Instruções para execução
### Requisitos
- MySQL
- MySQL Workbench
- Apache NetBeans

### Clonando e executando
1. Clone o projeto no seu diretório de preferência
   ```
   git clone https://github.com/OsManoDaDS/projetosenai.git
   ```
2. Abra o MySQL Workbench
3. Abra a instância local do MySQL
4. Dentro da Query, cole o código disponível no arquivo `mercadinhoBomDelicia.sql`
5. Execute o código, e ele criará o banco de dados com as tabelas
6. Abra a pasta do projeto no NetBeans
7. Clique com botão direito do mouse em `Dependencies`, e depois clique em `Download Declared Dependencies`
8. Abra o pacote `connection`, e dentro da classe `ConnectionFactory` insira o usuário e senha em suas respectivas constantes.
9. Se necessário, altere a URL.
10. Abra o arquivo TelaPrincipalMDI dentro do pacote `view`, e execute com `Shift+F6`.
