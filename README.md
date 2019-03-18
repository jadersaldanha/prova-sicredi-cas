# Prova de automação para Sicredi CAS.

Olá!

Bem-vindo(a) ao projeto de automação escrito na linguagem Java para a prova Sicredi.



# Arquitetura do projeto
- Sicredi.com.br
- /src/main/java
- appObjects
- tasks
- testCases
- regressionTestSuite
- verificationPoints
- /src/main/resources
- datapools
- support
- config.properties
- Reports
- screenshots

- Onde:
appObjects representa o pacote com as classes que identificam elementos da interface web do portal. tasks: tarefas que atuam nos elementos da interface identificados. testCases pacote que define as classes principais dos casos de teste automatizados de UI. RegressiontestSuite conjunto que chama as classes de caso de teste que desejar. verificaitonPoints onde estão as classes para validação de dados e/ou elementos de interface, etc. Na pasta datapools estão os arquivos necessários para a utilização da massa de dados para testes automatizados, é possível adicionar quantas linhas e dados quanto forem necessário. Para isso, basta escrever os dados de usuário em cada linha utilizando o separador ";". Support estão as classes de suporte para o projeto, considerando o relatório de evidências, datapool, geração de datas (alguns códigos foram retirados de livros e material livre da internet). config.propeties armazena dados de ambiente, seja de homologação ou produção, respostas de api e o que for necessário não ficar evidente em hard code. 

# EXECUÇÃO
Por linha de comando:

- Clonar o repositório: git clone https://github.com/jadersaldanha/prova-sicredi-cas;
- Na pasta do projeto: java -jar TestSuite.jar.

Por UI:

- Fazer o download do projeto e descompactar onde desejares;
- Na pasta do projeto clicar duas vezes no arquivo "TestSuite.jar";
- Aguarde a execução dos testes;
- Verifique a execução dos testes nos reports do projeto clonado.

https://www.java.com/pt_BR/download/
