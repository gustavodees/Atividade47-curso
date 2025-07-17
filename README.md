# Sistema Simples de Aluguel de Quartos em Java

Este projeto consiste em um programa Java simples que simula um sistema de aluguel de quartos. O usuário pode especificar quantos quartos deseja alugar, fornecer o nome e o email do locatário para cada quarto e o número do quarto desejado. Ao final, o programa exibe a lista dos quartos ocupados com as informações dos respectivos locatários.

**Autor:** gustavodees

## Arquivos Incluídos

* `model/Quarto.java`: Define a classe `Quarto`, que representa um quarto com atributos para nome e email do locatário.
* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, registrar os aluguéis e exibir os quartos ocupados.

## Como Usar

1.  **Salve os arquivos:** Certifique-se de salvar o código nos locais corretos:
    * Crie uma pasta chamada `model` e salve dentro dela o arquivo `Quarto.java`.
    * Crie uma pasta chamada `principal` e salve dentro dela o arquivo `Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java model/Quarto.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite quantos quartos deseja alugar. Insira o número desejado (entre 1 e 10) e pressione Enter.
    * Para cada quarto que você deseja alugar, o programa pedirá as seguintes informações:
        * **Quarto `i`:** (onde `i` é o número do aluguel atual)
            * **Nome:** Digite o nome do locatário e pressione Enter.
            * **Email:** Digite o email do locatário e pressione Enter.
            * **Quarto:** Digite o número do quarto desejado (de 1 a 10) e pressione Enter.

5.  **Resultado:** Após inserir as informações de todos os quartos a serem alugados, o programa exibirá a mensagem "Quartos ocupados:" seguida de uma lista dos números dos quartos que foram alugados, juntamente com o nome e o email do locatário correspondente.

## Explicação do Código

### `model/Quarto.java`

Este arquivo define a classe `Quarto`, que representa um quarto em um sistema de aluguel.

* **Atributos:**
    * `nome` (private String): O nome do locatário do quarto.
    * `email` (private String): O email do locatário do quarto.
* **Construtores:**
    * `Quarto()`: Construtor padrão que inicializa o nome e o email com strings vazias.
    * `Quarto(String nome, String email)`: Construtor que permite inicializar o nome e o email do locatário ao criar um objeto da classe `Quarto`.
* **Getters e Setters:** Métodos públicos para acessar e modificar os atributos da classe.
    * `getNome()`, `setNome()`
    * `getEmail()`, `setEmail()`
* **Método `toString()`:**
    * `@Override public String toString()`: Sobrescreve o método `toString` para retornar uma representação em string do objeto `Quarto`, formatando a saída com o nome e o email do locatário.

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Declara um array de objetos da classe `Quarto` chamado `quarto` com capacidade para 10 quartos (índices de 0 a 9, mas o programa usa de 1 a 10).
    3.  Solicita ao usuário que digite a quantidade de quartos que deseja alugar e armazena esse valor na variável inteira `n`.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada quarto a ser alugado):
        * Em cada iteração, informa o número do quarto que está sendo alugado.
        * Solicita e lê o nome do locatário utilizando `input.nextLine()` para consumir a quebra de linha pendente do `nextInt()` anterior e, em seguida, lê o nome novamente.
        * Solicita e lê o email do locatário.
        * Solicita e lê o número do quarto desejado.
        * Cria um novo objeto da classe `Quarto` com o nome e o email fornecidos e o armazena no array `quarto` na posição correspondente ao número do quarto digitado. **Observação:** O código utiliza os números dos quartos de 1 a 10 como índices do array, o que significa que o índice 0 do array não será utilizado.
    5.  Imprime a mensagem "Quartos ocupados:".
    6.  Utiliza um loop `for` para percorrer as posições de índice 1 a 10 do array `quarto`:
        * Verifica se a posição atual do array não é nula (o que indica que o quarto foi alugado).
        * Se o quarto estiver ocupado, imprime o número do quarto (o índice `i`) e as informações do locatário chamando o método `toString()` do objeto `Quarto` armazenado nessa posição.
    7.  O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
