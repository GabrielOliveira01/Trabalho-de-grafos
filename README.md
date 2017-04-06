## Estudo de grafos com algoritmo Djistrack aplicados no problema do cotidiano ##

### Grafo ###

É um diagrama de conjuntos de dados composto por vértices e arestas, que estabelecem tipos de conexões.

### Grafo no trânsito ###

Grafos são usados como ferramentas de estudo e estratégia frequentemente no trânsito em diversas situações, onde as arestas são ruas, avenidas, etradas ou rodovias e os vértices representam as curvas, esquinas ou cruzamentos. Seu objetivo é proporcionar um bom desempenho do tráfego, com a menor taxa de congestionamentos e acidentes de trânsito.

### Situação problema ###

Devido à nova gestão da cidade de Barueri é estabelecido um evento nomeado como prefeito no seu bairro para que a população se aproxime dos seus líderes, na divulgação de planejamento, propostas e sugestões de moradores. Esse evento ocorrerá na Avenida Capitão Francisco César localizada no bairro Engenho Novo, cidade Barueri-SP, que será interditada do número 693 ao 856 para acomodar a população e políticos. Uma aluna ao sair da escola EMEF Armando Cavaza, localizada na rua São Paulo nº 706, com seu veículo em direção a sua casa situada na rua Otávio Calegari nº140, se depara com essa situação, com isso deverá ser traçada uma rota alternativa para que esta chegue em seu destino.

### Ação ###

Agentes de transito devem reestabelecer outras rotas para circulação. 

Para o desenvolvimento dessa atividade o estudo de grafos e o algoritmo de Djistrack, foi fundamental, pois estes em conjunto realizam diversas análises e proporcionam a melhor alternativa para a aluna chegar em sua casa.

Retirado do google Maps, abaixo é exibido o mapa original, da região em que ocorrerá o evento.

![picture alt](https://github.com/GabrielOliveira01/Trabalho-de-grafos/blob/master/1.png)

O grafo e o algoritmo de Djistrack irão auxiliar nessa situação que pode ocorrer no cotidiano das pessoas, através da viabilização de alternativas entre as ligações das ruas, de acordo com as leis de transito, cálculo com os parâmetros de velocidade (peso) estabelecidos e comparação com desses resultantes.

Não contar com uma alternativa favorecida pelo uso desses recursos tem como consequência o prejuízo para cidade em sérios problemas no trânsito, desordem e poluição.

O mapa abaixo apresenta o esboço do trecho original que se modificará, com suas devidas sinalizações indicando por onde trafegar. A região marcada de laranja é a Avenida Capitão Francisco César cercado de outras ruas com a indicação de suas vias.

![picture alt](https://github.com/GabrielOliveira01/Trabalho-de-grafos/blob/master/2.png)

No esboço e mapa a seguir cor azul claro indica o percurso que deve ser decorrido por aqueles que sigam para regiões não interditadas sentido ao bairro Parque Santana pertencente da cidade de Santana de Parnaíba. Já a cor azul escuro se refere ao caminho para seguir rumo ao bairro Cruz Preta. O sinalizado em vermelho é o trecho interditado, o desvio só ocorrerá nesse intervalo, o restante da Avenida Capitão Francisco César deve ser percorrida normalmente como destacado em laranja no esboço. 

![picture alt](https://github.com/GabrielOliveira01/Trabalho-de-grafos/blob/master/Esboco.png)
![picture alt](https://github.com/GabrielOliveira01/Trabalho-de-grafos/blob/master/4.png)

Para resolução do problema foi aplicado o estudo de grafos gerando um esquema mais detalhado com indicações matemáticas de vértices (esquinas), arestas (ruas), peso (velocidade), assim como o ponto de partida e destino, obtém também o auxilio do algoritmo de Djistrack onde ambos conjuntamente recalcularão um novo caminho para atingir o objetivo da estudante.

![picture alt](https://github.com/GabrielOliveira01/Trabalho-de-grafos/blob/master/5.png)
