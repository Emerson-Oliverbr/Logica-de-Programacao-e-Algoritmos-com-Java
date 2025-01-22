# Seção: Matrizes

##Exercícios propostos

### 1) Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
na tela somente os números negativos da matriz.

**Exemplo:**`

Entrada:
``
A entrada contém os números M e N na mesma linha, depois os dados da matriz.
Saída:
A saída contém uma mensagem e depois os números negativos da matriz, conforme exemplo.
Exemplo:
Entrada
2 3
12 -8 5
-13 10 -6
Saída
VALORES NEGATIVOS:
-8
-13
-6
### 2) Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
elementos de cada linha da matriz.
Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando a soma dos elementos de cada linha da matriz.
Exemplo:
Entrada
3
5 2 4
10 3 6
9 8 12
Saída
11
19
29

### 3) Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver empates.

Entrada:
``
A entrada contém o número N, depois os dados da matriz.

Saída:
``
A saída contém os números representando o maior elemento de cada linha da matriz.

***Exemplo:***

Entrada
``
4
10 5 12 3
4 7 0 6
3 3 8 1
15 13 4 7

Saída
``
12
7
8
15

### 4) Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.
Entrada:
``
A entrada contém o valor N, depois os dados da matriz.

Saída:
``
A saída contém a soma dos elementos da diagonal principal.

***Exemplo:***

Entrada
``
3
10 3 2
5 15 7
8 6 4
Saída
12

### 5) Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois, gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais.

Imprimir na tela a matriz gerada.

Entrada:
``
A entrada contém os valores de M e N, depois os valores da primeira matriz A, depois os valores da segunda matriz B, conforme exemplo.

Saída:
``
A saída contém os valores da matriz gerada C, conforme exemplo.

***Exemplo:***

Entrada
``
2 3
3 5 2
4 5 1
2 4 5
1 8 8
Saída
5 9 7
5 13 9

### 6) Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.

Entrada:
``
A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa decimal cada, seguido do índice de
uma linha, seguido do índice de uma coluna, conforma exemplo.

Saída:
``
A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no
enunciado, conforme exemplo.

***Exemplo:***

Entrada
``
3
7.0 -8.0 10.0
-2.0 3.0 5.0
11.0 -15.0 4.0
1
2

Saída
``
SOMA DOS POSITIVOS: 40.0
LINHA ESCOLHIDA: -2.0 3.0 5.0
COLUNA ESCOLHIDA: 10.0 5.0 4.0
DIAGONAL PRINCIPAL: 7.0 3.0 4.0

MATRIZ ALTERADA:
``
7.0 64.0 10.0
4.0 3.0 5.0
11.0 225.0 4.0

### 7) O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de
soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a
posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".
Entrada:
A entrada consiste em um inteiro M representando o número de filas, um inteiro N representado a quantidade de soldados
por fila, as M filas de soldados (cada soldado é representado por um número inteiro), e o número inteiro para o exercício
"girar fila".

Saída:
``
A saída contém a formação do pelotão após a execução do exercício "girar fila".

***Exemplo:***

Entrada
``
3 5

1034 2271 9013 9281 1138
2837 1827 1074 9271 7201
1822 1977 1821 2278 1821
2

Saída
``
1034 2271 9013 9281 1138
7201 2837 1827 1074 9271
1822 1977 1821 2278 1821
