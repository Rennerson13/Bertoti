# Atividade 01

Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming.



We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


O que é engenharia de software?

 Engenharia de software é o campo que envolve o planejamento, desenvolvimento e manutenção de softwares de forma eficiente e confiável. Os principais desafios incluem gerenciar a escala, o tempo e os trade-offs.

- Escala: Refere-se à capacidade do software de crescer em termos de usuários e funcionalidades. Um software escalável pode suportar mais usuários e mais dados sem perder desempenho. Por exemplo, um site de compras online deve ser capaz de lidar com milhões de usuários e produtos.

- Tempo: Inclui o tempo necessário para desenvolver o software, o tempo de resposta que ele oferece aos usuários e o tempo gasto em manutenção após o lançamento. Planejar bem o tempo de desenvolvimento e manter o software atualizado são essenciais para o sucesso do projeto.

- Trade-offs: São escolhas difíceis que os engenheiros precisam fazer. Por exemplo, melhorar o desempenho do software pode aumentar os custos, ou adicionar muitas funcionalidades pode torná-lo mais complicado de usar e manter. Encontrar o equilíbrio certo é crucial.




# Atividade 02

1 Python:
- Vantagens: A sintaxe clara do Python torna a linguagem menos difícil de aprender, acelerando o desenvolvimento e aumentando a produtividade. O código Python geralmente requer menos linhas para realizar a mesma tarefa que outras linguagens, economizando tempo e esforço. Possui uma extensa biblioteca padrão com módulos para tarefas comuns. É uma linguagem interpretada, o que significa que o código é executado linha por linha. Isso pode torná-la mais lenta que linguagens compiladas em tarefas intensivas em processamento.

- Desvantagens: A tipagem dinâmica do Python oferece flexibilidade, mas também pode levar a erros de execução que só são detectados no momento da execução do programa.
Embora existam soluções como o PyInstaller para tornar o código Python executável em diferentes sistemas operacionais, a portabilidade ainda não é tão fácil quanto em linguagens compiladas como Java (JVM).

2 Java:
- Vantagens: É uma linguagem robusta e segura. O rigoroso processo de compilação e a coleta de lixo automática ajudam a prevenir erros de execução e vazamentos de memória. Portabilidade é uma vantagem,o código Java compilado em bytecode pode ser executado em qualquer plataforma com uma JVM. Isso torna o Java ideal para desenvolvimento de software multiplataforma, possui um vasto ecossistema de bibliotecas, frameworks e ferramentas de terceiros. Isso facilita o encontro de soluções prontas para problemas comuns.

- Desvantagens: Embora tenha melhorado ao longo do tempo, o Java pode ser mais lento que linguagens compiladas diretamente para código de máquina, como C++. Isso pode ser uma desvantagem para tarefas intensivas em processamento. O código Java pode ser mais verboso do que algumas linguagens de script, o que significa que pode exigir mais linhas de código para realizar a mesma tarefa.  A programação orientada a objetos e a sintaxe formal do Java podem ser um pouco mais desafiadoras de aprender para iniciantes. o Java depende da JVM.-  

3 Pipeline:
- Vantagens: Pipelines automatizam tarefas repetitivas, liberando o tempo dos desenvolvedores e analistas para atividades mais estratégicas. Isso melhora a eficiência e a produtividade. Pipelines garantem a execução consistente de tarefas na mesma ordem e com os mesmos parâmetros. Isso reduz erros humanos e melhora a qualidade do output final, facilitam a replicação de resultados, tornando o processo de desenvolvimento e análise mais transparente e auditável. Se ocorrer um problema, é mais fácil identificar a etapa específica onde ele surgiu.

- Desvantagens: Configurar e manter pipelines pode exigir tempo e conhecimento técnico, especialmente para pipelines complexos. É preciso garantir que cada etapa funcione corretamente e esteja integrada com as demais. possui uma certa fragilidade, se uma etapa do pipeline falhar, toda a cadeia de execução pode ser interrompida. É necessário implementar mecanismos de monitoramento e failover para mitigar esse risco. Dependendo da complexidade do pipeline e das ferramentas utilizadas, pode haver custos elevados associados à infraestrutura e ao licenciamento de software.
  

# Atividade 03

https://docs.google.com/presentation/d/1Lmad2CS1pM1UycQpYn6FiDm2NsEO6CVSchym65tuk4U/edit#slide=id.g1f2b4e971a0_0_139

Slides da atividade 

Análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29


- Arquitetura de Camadas
 
Requisitos Não Funcionais:
Manutenibilidade: Alta, devido à separação clara das responsabilidades.
Escalabilidade: Moderada, pode ser escalada duplicando camadas.
Segurança: Boa, com controle de acesso em cada camada.

Pontos Positivos:
Fácil de entender e desenvolver.
Manutenção simplificada.
Boa separação de responsabilidades.

Pontos Negativos:
Pode levar a dependências entre camadas.
Performance pode ser impactada devido a chamadas entre camadas.


- Arquitetura Pipeline

Requisitos Não Funcionais:
Performance: Alta, devido ao processamento paralelo.
Escalabilidade: Boa, pode adicionar mais etapas ao pipeline.
Manutenibilidade: Moderada, depende da complexidade das etapas.

Pontos Positivos:
Alta eficiência no processamento de dados.
Fácil de adicionar novas etapas de processamento.

Pontos Negativos:
Debugging pode ser complicado.
Alterações em uma etapa podem impactar outras.


- Arquitetura Microkernel

Requisitos Não Funcionais:
Segurança: Alta, devido à separação dos serviços principais e adicionais.
Flexibilidade: Alta, fácil de adicionar ou remover serviços.
Resiliência: Alta, falhas em serviços não afetam o núcleo.

Pontos Positivos:
Alta modularidade e segurança.
Resiliência a falhas de componentes individuais.

Pontos Negativos:
Performance pode ser menor devido à comunicação entre componentes.
Pode ser mais complexo de implementar.


- Arquitetura Baseada em Serviços

Requisitos Não Funcionais:
Reutilização: Alta, serviços podem ser reutilizados em diferentes aplicações.
Escalabilidade: Boa, serviços podem ser escalados individualmente.
Interoperabilidade: Alta, serviços podem se comunicar via padrões abertos.

Pontos Positivos:
Boa reutilização de componentes.
Facilita a integração com sistemas externos.

Pontos Negativos:
Gestão de serviços pode ser complexa.
Latência na comunicação entre serviços pode ser um problema.


- Arquitetura de Microsserviços

Requisitos Não Funcionais:
Escalabilidade: Excelente, microsserviços podem ser escalados independentemente.
Resiliência: Alta, falhas em um microsserviço não afetam os outros.
Deploy e Manutenção: Independente, facilitando atualizações.

Pontos Positivos:
Alta escalabilidade e resiliência.
Facilita o desenvolvimento e implantação contínuos.

Pontos Negativos:
Pode ser complexa de gerenciar devido ao grande número de serviços.
Requer um bom sistema de monitoramento e coordenação.




# Atividade 04

- Arquitetura MVC (Model-View-Controller): baixo Custo:Desenvolvimento mais rápido e eficiente,
divide o trabalho em partes menores, facilitando a criação e manutenção reduzindo custos com mão de obra.



# Atividade 05

- Parte da arquitetura.
  
  ![image](https://github.com/Rennerson13/bertoti/assets/143669686/7a478fd3-d1d9-4d91-961b-6c0c41626820)





