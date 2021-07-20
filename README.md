# StockTakeOver TTI - Sistema de gerenciamento de inventário de Hardware (API - Backend)    

## Sobre o sistema 📋
 
A ideia do projeto é criar um sistema completo para controle de inventário de hardware de clientes. A inspiração para construção do sistema veio da experiência na atuação como suporte técnico, visto que atualmente na empresa utiliza-se uma planilha do excel para realizar este controle.

O objetivo é fornecer este sistema para a empresa, o que proporcionará maior organização para a equipe de gestão de ativos, trazendo mais comodidade e praticidade ao trabalho de todos. Este repositório contém a API do sistema e, futuramente, será criado o Frontend do sistema para implantação na empresa. O Frontend será desenvolvido utilizando-se o Angular e em breve sua construção estará disponível em um repositório no Github. 

## Funcionamento da API ⚙️

- Modelo de negócio: 

A API construida permite a criação de dois tipos de entidades, a Client e a Hardware conforme imagem abaixo:

![image](https://user-images.githubusercontent.com/32941370/126188474-3628b241-68b3-47aa-9ef5-8b1da692bbda.png)

Conforme apresentado na imagem, a API permite a criação de Clientes e Hardwares no modelo um para muitos, ou seja, um Cliente pode ter nenhum ou vários Hardwares associados a ele, e um Hardware para existir precisa estar associado a um cliente. 

Quando um cliente é excluído, todos os Hardwares associados a ele são excluídos juntos. 

- Banco de Dados

No banco de dados, são criadas apenas duas tabelas, uma para Clientes e outra para Hardwares. A relação é estabelecida a partir da tabela Hardware que possui um campo do tipo integer client_id, utilizado para representar qual é o cliente dono daquele equiapamento. 

- Perfis de desenvolvimento

A API possui no caminho \src\main\resources 3 arquivos do tipo .properties que são responsáveis por definir perfis de desenvolvimento. O arquivo application-dev.properties define as configurações do banco local H2 que é utilizado no perfil de desenvolvimento. Para o perfil de produção, o arquivo application-prod.properties define as configurações do banco de dados PostgreSQL que será utilizado a partir da implantação do sistema completo. 

## Demais informações sobre o projeto 🛠️ 

Para utilizar a API, você deverá baixar esse repositório para sua máquina local. Você precisa ter configurado o Java JDK 11 e o Maven em sua estação. Vale ressaltar também que o projeto utiliza diversas ferramentas e frameworks, como por exemplo o Spring Web, Mapstruct, Lombok, JPA, etc. Portanto, é necessário estar atento caso ocorra um problema de dependencia que tenha que ser resolvido nas configurações de sua estação.

Além disso, você utilizará o Postman para realizar as requisições Http e verificar o funcionamento prático da aplicação. Os testes com o Postman poderão ser realizados pela API que está publicada no Heroku pelos endereços:
- https://stocktti.herokuapp.com/api/v1/client
- https://stocktti.herokuapp.com/api/v1/hardware

Em caso de dúvidas, contactar o responsável por este projeto. 
