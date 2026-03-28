# Sistema de Aeroporto ✈️

## Visão Geral
Este projeto é um **Sistema de Gerenciamento de Aeroporto** desenvolvido em Java.  
Ele demonstra conceitos de **Programação Orientada a Objetos (POO)** como **herança, polimorfismo e encapsulamento** através das classes `Passenger`, `Aircraft` e `Flight`.

O sistema permite:
- Registrar aeronaves e voos.
- Adicionar diferentes tipos de passageiros (VIP, Criança, Idoso, Normal).
- Calcular a receita total e o peso das bagagens de um voo.
- Validar capacidade e limite de peso da aeronave.

---

## Funcionalidades
- **Hierarquia de Passageiros**:
  - `Passenger` (classe base)
  - `PassengerVip` (desconto + milhas)
  - `PassengerChild` (desconto para crianças até 12 anos)
  - `PassengerSenior` (desconto para idosos acima de 60 anos)

- **Aircraft (Aeronave)**:
  - Armazena modelo, capacidade, peso máximo e registro.
  - Valida capacidade de passageiros e peso das bagagens.

- **Flight (Voo)**:
  - Conecta passageiros e aeronave.
  - Calcula receita total e peso das bagagens.
  - Exibe informações completas do voo.

- **Main**:
  - Entrada de dados interativa pelo console.
  - Exibe informações do voo, receita e peso das bagagens.

---

## Exemplo de Saída

=== Informações do Voo === 

Flight Number: 101

Origin: São Paulo

Destination: New York

Model: Boeing 737

Capacity: 3 passengers

Maximum Weight: 5000 kg

Record: PR-ABC

Passengers on board: 3 

Receita Total: R$390.0

Peso Total das Bagagens: 45.0 kg

---

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/AirportSystem.git
   ```


- Navegue até a pasta do projeto:
```
cd AirportSystem
```
- Compile o projeto:
```
javac com/kauabiscotto/AirportSystem/*.java
```


- Execute o programa:
```
java com.kauabiscotto.AirportSystem.Main
```

---

## Tecnologias
- Java 17+
- Programação Orientada a Objetos (POO)



