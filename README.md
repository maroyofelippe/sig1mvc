# Fatec ZL - Centro Paula Souza
## Disciplina - Programação Web III
Grupo
* Marco Antonio Royo Felippe


## DPAC - DISTÚRBIO DO PROCESSAMENTO AUDITIVO CENTRAL:
### Auditech – Treinamento para DPAC

### Narrativa da solução
> Dada a problemática do DPAC, a proposta de solução será apresentada em uma plataforma onde o profissional de fonoaudiologia ao utilizá-la poderá fazer o cadastramento, prescrição de tratamento e acompanhamento individualizado de seus pacientes durante o tratamento e estatisticamente após o tratamento.
O Fonoaudiólogo deverá se cadastrar no sistema, para que possa sua clínica virtual. Logo após deverá fazer o cadastro do paciente que deverá ser simples e objetivo, e este deverá ser acompanhado pelo profissional fonoaudiólogo.
O paciente terá acesso a versão mobile da solução e após finalizado o cadastro do paciente, este receberá acesso ao aplicativo para dispositivos móveis (APP) para iniciar o tratamento.
Para a execução dos treinos, o paciente deverá usar um fone de ouvido do tipo concha e é de extrema importância que seja observado o posicionamento de direita/esquerda conforme indicação do fone. Vale ressaltar que o uso incorreto ou ainda de um fone não especificado, pode causar desvios nos resultados esperados do tratamento.
O formato do APP será em formato de jogo, com as diversas fases do tratamento. Para que o paciente possa avançar de uma fase do tratamento para outra, será analisado o percentual de acertos durante as fases de tratamento que terá um peso de 30% somados ao desafio da fase que terá um peso de 70%. É sugerido que o paciente atinja 80% ou mais na média entre os treinamentos e desafio final. Este desafio deverá estar em concordância com os treinos já realizados.
Para execução do desafio, o paciente deverá ter realizado os treinos na mesma quantidade de vezes, indicada pelo profissional, por dia, com no mínimo de dias consecutivos também indicado pelo profissional. Após a execução dos treinos, os desafios ficarão disponíveis para ser executado em até três tentativas. Sabendo-se que todos os valores poderão ser ajustados dentro dos já pré-estabelecidos na plataforma.
É fundamental que o primeiro treino com o aplicativo, para cada fase, seja executado no consultório junto com o Fonoaudiólogo e um responsável, para evitar dúvidas na execução dos treinos.
A previsão de cada fase do tratamento será de aproximadamente sete dias e o tratamento prevê uma sequência de aproximadamente dez semanas para finalizar, podendo ser estendido conforme a necessidade de cada paciente.
Ao término das semanas de treinamento e com todos os desafios finalizados, o paciente ficará em uma condição de repouso pré-avaliação, ou seja, ele perderá o acesso ao APP até que refaça o teste de avaliação do DPAC em laboratório especializado. Este exame não está previsto nesta solução.
Após um período de 45 dias de "repouso" a plataforma deverá alertar o paciente e o profissional do fim de tempo de repouso e indicar a execução de um teste de avaliação em laboratório especializado. Com o exame de avaliação realizado, o paciente passará a ter acesso novamente ao APP caso precise refazer alguma das fases de treinamento, conforme orientação do Fonoaudiólogo.
Em caso de alta, o paciente deixa de ter acesso a plataforma e aos treinamentos, ficando assim seu APP bloqueado para uso.




## Processo de Desenvolvimento de Software - PDS
> O PDS segue uma abordagem interativa incremental adaptada do Scrum. Cada interação tem uma definição de pronto estabelecida com objetivo de controlar a qualidade.


## Estudo de Caso – Sistema Integrado de Gestão


## Sprint Backlog
> Cada requisito tem um identificador único de maneira que seja possível rastrear a necessidade do cliente com a implementação do software.

### Requisitos Funcionais
| Identificador | Descrição | Prioridade |
| ------------ | ------------------------------------------------------------------------ | ------|
|REQ001|Os usuários cadastrados no sistema deverão ser de um dos tipos abaixo: 01) gestorPlataforma – pertence ao desenvolvedor, “nasce” com o sistema. 02) profissional – É o Fonoaudiólogo responsável pelos tratamentos. 03) staffClinica – É funcionário do Fonoaudiólogo. 04) paciente – É o cliente do Fonoaudiólogo. 05) pais – É o responsável pelo paciente.|Alta|
|REQ003| O gestorPlataforma deverá cadastrar todos os exercícios das fases de tratamento e seus respectivos padrões de resposta para comparação com os resultados dos pacientes.| Alta |
| REQ004 | 
| REQ005 | O profissional deverá atualizar seu cadastro e criar sua clínica virtual além de cadastrar os usuários staffClinica. | |
| REQ006 | O staffClinica deverá realizar o cadastro dos pais e pacientes. | |
| REQ007 | O profissional fará a parametrização do tratamento para cada paciente dentro das opções pré-definidas na plataforma. | |
| REQ008 | O profissional poderá acompanhar os tratamentos de forma individualizada e obter dados analíticos além de estatísticas bem como visualizar os dados de forma globalizada. | |
| REQ009 | A cada término de fase do tratamento o profissional deverá avaliar os resultados para habilitar ou não uma nova fase do tratamento para o paciente. Caso o paciente não consiga atingir um resultado satisfatório, deverá refazer a fase do tratamento, conforme orientação do profissional.O profissional deverá ser cadastrado pelo gestorPlataforma.| |
| REQ010 | O paciente executará o treinamento da fase habilitada e parametrizada pelo profissional de forma ininterrupta e o sistema deverá fazer os registros de todos os acessos e resultados das fases do tratamento. | |
| REQ011 | Os pais poderão acessar os resultados do tratamento, a cada término de fase do treinamento, de seu respectivo filho. O acesso será pela versão mobile, porém com controle de acesso pessoal. | |
| REQ012 | Durante o período de uma fase de treinamento o paciente deverá executar a quantidade de vezes ao dia com o intervalo em horas definidos pelo profissional | |
| REQ013 | Decorridos os dias de treinamento previstos pelo profissional o paciente estará habilitado a executar um treino desafio em até três tentativas. Independentemente de ter sucesso nos treinos. | |
| REQ014 | Após a execução de cada tentativa do treino desafio o paciente deverá alcançar média de acertos igual ou superior as definidas pelo profissional. | |
| REQ015 | A composição da média final deverá seguir o seguinte modelo: ((Σ% 𝑎𝑐𝑒𝑟𝑡𝑜𝑠 𝑝𝑜𝑟 𝑑𝑖𝑎 / Σ𝑛º 𝑑𝑖𝑎𝑠) ×𝑝𝑒𝑠𝑜 𝑡𝑟𝑒𝑖𝑛𝑜)+((% 𝑎𝑐𝑒𝑟𝑡𝑜𝑠 𝑑𝑒𝑠𝑎𝑓𝑖𝑜) ×𝑝𝑒𝑠𝑜 𝑑𝑒𝑠𝑎𝑓𝑖𝑜). Caso não execute algum treinamento será somado zero pontos para efeito da composição da média. | |
| REQ016 | Após a execução das fases previstas para o treinamento o APP móvel (versão paciente) deverá ficar bloqueado, para que o paciente possa “descansar” dos treinos por período de 45 dias. Após este descanso o sistema deverá enviar um alerta para paciente e para o profissional para a execução da avaliação em cabine. | |
| REQ017 | Todos os resultados parciais e totais deverão ficar armazenados para estatísticas globais do tratamento, divididos por clínica virtual. | | 
| REQ018 | O profissional poderá ter apenas uma clínica virtual vinculada a seu usuário e terá acesso apenas aos dados dos tratamentos relacionados a esta clínica virtual. Os dados da clínica virtual bem como dos pacientes desta clínica, não poderão ser apagados pelo profissional e deverão ser protegidos nos termos da LGPD (Lei 13.709 - Lei Geral de Proteção aos Dados). | |
| REQ019 | O paciente poderá ter os seguintes status: tratamento, repouso, alta, desistente.
E somente poderá ter um dos status por vez. | |
| REQ020 | Durante a execução das fases de treinamento, o paciente deverá seguir as orientações do APP apresentadas na tela e por áudio (O exercício já possui a descrição no áudio) e selecionará na tela do dispositivo mobile as respostas de forma sequencial. | |
| REQ021 | As respostas do paciente deverão ser gravadas e armazenadas para comparação com os “padrões” cadastrados para gerar as estatísticas. Após a execução de cada treino, será apresentado ao paciente apenas o percentual de acertos e não o todo para evitar vícios de execução nas respostas. | |
| REQ022 | O gestorPlataforma terá acesso apenas aos dados estatísticos dos tratamentos para gestão da plataforma e futuras melhorias, não podendo acessar informações relativas aos tratamentos dos pacientes. | |
| REQ023 | O modelo de cobrança da plataforma estará baseado em um percentual referente a Clínica Virtual, outro percentual referente a quantidades de tratamentos ativos, pacientes em tratamento e ainda quantidade de treinos realizados no período de faturamento. Considera-se pacientes ativos todos aqueles que estão cadastrados no sistema e que esteja em tratamento ou repouso. | |

### Requisitos não Funcionais
| Identificador | Descrição | Prioridade |
| ------------ | ------------------------------------------------------------------------ | ------|
| RNF001 | O paciente deverá ter um dispositivo móvel (celular ou tablet) para execução do tratamento. | |
| RNF002 | O paciente deverá ter um fone de ouvido do tipo concha para realizar o tratamento de forma eficiente. | |
| RNF003 | O Banco de Dados a ser usado nesta solução será o Microsoft SQL Server. | |
| RNF004 | A solução deverá ficar hospedada em servidor na nuvem. | |
| RNF005 | A versão mobile para o paciente será em formato de jogo. | |



## Definição de pronto


## Casos de teste

