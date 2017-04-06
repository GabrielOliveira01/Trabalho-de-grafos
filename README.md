# Trabalho de grafos #

### Algoritmo de Dijkstra ###

O algoritmo de Dijkstra, criado por Edsger Wybe Dijkstra, tem como finalidade estabelecer caminhos mais curtos de acordo com o estudo de rota realizado entre os vértices de um grafo de distância podendo ser orientados ou não. (Taha 2008) 
Esse método efetua uma análise de percursos, somente com arcos de comprimento positivo, calculando e comparando a distância do nó de origem para todas as possibilidades disponíveis até obter um resultado. (Arenales et al 2007)  
As arestas podem conter um elemento conhecido como peso que impactam nesse estudo, de forma que cada caminho terá valores distintos atribuídos e estes serão incluídos no cálculo modificando resultados. (Sedgewick 2002)  
Há uma determinação nesse algoritmo que permite somente valores positivos em arestas já que negativos não apresentam exatidão. (Sedgewick 2002)  
De acordo com Arenales et al (2007) o tempo de execução do algoritmo com m arestas e com n vértices pode ser apresentado por O([m+n]log n.   
Os resultados encontrados representam uma sequência de esquinas adjacentes a serem percorridas. Obtemos pelo método proposto, qual é a melhor distância a ser percorrida.
