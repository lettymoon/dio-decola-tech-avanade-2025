# Desafio de projeto: Criando um APP Full Stack de Agendamento de Barbearia com Java e Angular

| Clientes Cadastrados Frontend | Agendamento de Clientes Frontend | Diagrama Backend |
| :-: | :-: | :-: |
| ![image](https://github.com/user-attachments/assets/9de11d04-8fc2-4ae1-a0f6-b3e0a8b22757) | ![image](https://github.com/user-attachments/assets/aefc6ec1-30de-4790-8a16-1550849cc35d) | ![image](https://github.com/user-attachments/assets/6aca59ca-efd9-470a-864e-17dc80539280) |

> Resultado final do projeto prático da sub-trilha "Construindo Aplicações Angular"

## Observações importantes

### Frontend

- O Instrutor utiliza Docker para o frontend, entretanto, eu não o fiz.

### Backend

- O projeto utiliza o padrão de arquivos `.yaml` ao inves de `application.properties`
  - Portanto, é preciso configurar um `profile` com a variável de ambiente `SPRING_PROFILES_ACTIVE` com valor `dev` para execução local.

## Como executar

Tenha `Docker` e `NodeJs` instalado em sua máquina.

Entre na pasta do Backend com o comando `cd backend`, execute o comando

```bash
docker-compose up -d --build
```

Após a execução do backend, volte a pasta raiz e entre no frontend com o comando `cd frontend`, aqui, você deve executar 2 comandos

O de baixar as dependências com `npm install` e o de executar o front com `npm start`. 

## Licença

Este projeto está sob licença. Consulte [LICENSE](../LICENSE) para obter mais informações.