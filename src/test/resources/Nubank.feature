
Feature: Nubank
 
  Scenario: abertura de conta PF
  
   Given que esteja no site "https://www.4devs.com.br/gerador_de_pessoas"
   And pegue os dados de uma pessoa 
   When que esteja no site "https://nubank.com.br/"
   And estiver no site 
   And preencha o campo CPF
   Then realizo o cadastro  
   And valido que as informacoes foram enviadas
  