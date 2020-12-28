# language: pt
Funcionalidade: Diga Olá

  Cenário: Dizer "Olá Fulano!"
    Dado que eu tenho uma app que recebe "Paulo"
    Quando eu pedir que ela diga olá
    Então ela deveria responder "Olá Paulo!"
