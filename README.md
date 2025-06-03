
# Desafio: Testes Unitários





<h2>Requisitos que satisfazem o desafio proposto:</h2>

<p>
Escreva uma classe chamada Calculadora que contenha os seguintes métodos:

private int adicionar(int a, int b)

private int subtrair(int a, int b)

private int multiplicar(int a, int b)

private int dividir(int a, int b)

Após isso, escreva os testes unitários para cada um dos métodos.
Preste atenção especial aos testes do método dividir!
 </p>

 <h2>Implementação com Melhoria :</h2>
<p>
O projeto foi implementado com o padrão Strategy, separando cada operação matemática em classes específicas (adição, subtração, multiplicação e divisão). Foi criado um Registry manual para mapear os símbolos das operações e retornar a lógica correspondente. 

Também foram adicionadas exceções personalizadas para tratar erros como divisão por zero, operandos nulos e operação inválida. Para facilitar testes e garantir precisão, foi criado um serviço utilitário para comparar e normalizar valores BigDecimal. 

A aplicação está organizada em camadas (DTO, services, exceptions e config), com testes automatizados usando JUnit 5. Mesmo sendo uma aplicação standalone, ela já está pronta para virar uma API REST futuramente.
</p>

<h2>Competências avaliadas:</h2>

<p>
  - Aplicação do padrão Strategy para operações matemáticas.<br>
  - Implementação de DTO para transporte de dados (OperationRequest).<br>
  - Separação de responsabilidades em camadas (model, service, config, exception, dto).<br>
  - Registro dinâmico de estratégias por meio de um Registry manual (sem Spring).<br>
  - Criação de exceções customizadas para tratar erros específicos de negócio.<br>
  - Escrita de testes unitários com JUnit 5 para todos os cenários.<br>
  - Manipulação e comparação precisa de números decimais com BigDecimal.<br>
  - Estrutura preparada para futura transformação em API REST.<br>
</p>


  </p>

  <h2>Cenários de testes:</h2>
<p>

- OperationRegistry.getOperation("+") com 2.5 e 3.1 deve retornar 5.6.  
Objetivo: Verificar se a operação de adição está retornando corretamente o resultado com precisão decimal.

- OperationRegistry.getOperation("-") com 10 e 3 deve retornar 7.  
Objetivo: Validar a operação de subtração com números inteiros.

- OperationRegistry.getOperation("*") com 1.5 e 2 deve retornar 3.0.  
Objetivo: Assegurar o correto funcionamento da multiplicação com decimais.

- OperationRegistry.getOperation("/") com 1 e 3 deve retornar 0.3333333333.  
Objetivo: Confirmar o cálculo preciso da divisão entre números decimais.

- OperationRegistry.getOperation("/") com divisor 0 deve lançar DivisionByZeroException.  
Objetivo: Garantir que a divisão por zero seja tratada com uma exceção personalizada.

- OperationRegistry.getOperation("+") com operando nulo deve lançar NullOperandException.  
Objetivo: Verificar o tratamento de entrada nula durante a operação de adição.

- OperationRegistry.getOperation("%") deve lançar InvalidOperationException.  
Objetivo: Garantir que símbolos inválidos de operação sejam rejeitados com exceção adequada.

- OperationRegistry.getOperation("/") com 1 e 6 deve retornar 0.1666666667.  
Objetivo: Validar a precisão de casas decimais em divisões não exatas.

- OperationRegistry.getOperation("*") com 123.456 e 0 deve retornar 0.  
Objetivo: Assegurar que a multiplicação por zero funcione corretamente.

- OperationRegistry.getOperation("*") com -2 e 3 deve retornar -6.  
Objetivo: Verificar o correto comportamento de sinais em multiplicações negativas.

- OperationRegistry.getOperation("-") com 0 e 0 deve retornar 0.  
Objetivo: Confirmar que operações envolvendo zero sejam tratadas corretamente.

</p>


<h2>Melhorias Futuras:</h2>
<p>
A aplicação poderá evoluir com os seguintes aprimoramentos:

- Transformar o sistema em uma API pública acessível por qualquer aplicação ou frontend.
- Criar uma interface gráfica (web ou mobile) intuitiva, semelhante às calculadoras reais.
- Substituir os campos fixos "a" e "b" por uma lista de números (BigDecimal ou double) e operadores, permitindo cálculos complexos e encadeados, como: 1 + (15 * (8 * 5)) - 10.
- Implementar suporte a operações mais avançadas, como potenciação, raiz quadrada, porcentagem, logaritmo, seno, cosseno, etc.
- Adicionar internacionalização (i18n), permitindo uso em diferentes idiomas e formatos regionais.
- Implementar logs de uso e histórico de operações para auditoria e aprendizado do usuário.
- Automatizar ainda mais os testes, incluindo cenários com múltiplas entradas e combinações.
- Controlar o acesso por usuário (autenticação e autorização, se necessário).
- Definir limites de requisições para evitar uso abusivo (rate limiting).
- Fazer o deploy em nuvem para uso público, com monitoramento e escalabilidade.
</p>



 </p>
 <h2>Ferramentas utilizadas: </h2>
  <p>

<p>🚀 1 - Java 17</p>

<p>🚀 13 - IntelliJ</p>

<p>🚀 14 - VS Code</p>

<p>🚀 17 - JUnit 5</p>

<p>🚀 19 - Git/GitHub</p>

<p>🚀 20 - Commits com Assinaturas</p>

  <p ></p>

<h3>Maior Desafio Superado: </h3>

<p>Utilizar a metodologia TDD e aplicar os padrões de projeto apropriados.</p>


 <h3>Algum dos requisitos que não foi desenvolvido? Se sim, explique o motivo. </h3>
 <p>Todos os requisitos foram atendidos.</p>


 

<h3>Autora:</h3>

<p>Ana Santana</P>

<h3>Email: </h>
<p>anapedra.mil@gmail.com</P>


<h3>WhatsApp: </h3>
<p>5531997502148</P>


<h3>Lnkedin:</h3>
<p>https://www.linkedin.com/in/anasantana/</P>






