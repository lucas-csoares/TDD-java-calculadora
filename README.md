# TDD-java-calculadora
Desenvolva uma calculadora usando a metodologia TDD

## Instruções
1. Para começar, você precisará de uma IDE que suporte Java,
   como o IntelliJ IDEA, VSCODE ou o Eclipse, e a biblioteca de
   testes JUnit.
2. Crie um novo projeto Java.
3. Adicione a biblioteca JUnit ao projeto.
4. Crie uma classe de teste chamada CalculadoraTest.
5. Antes de criar a classe Calculadora, escreva um teste para o
   método soma que ainda não existe:

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
    }
}
```

6. Observe que a classe Calculadora e o método soma ainda
   não existem. Isso é normal em TDD: você começa com os
   testes.
7. Execute o teste. Ele deve falhar porque a classe e o método
   ainda não existem.
8. Agora, crie a classe Calculadora com o método soma para
   fazer o teste passar:

```
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }
}
```
9. Execute o teste novamente. Desta vez, ele deve passar.
10. Continue este processo para outros métodos como
    subtracao, multiplicacao, divisao. Primeiro, escreva o teste,
    veja-o falhar, depois implemente o código e veja o teste
    passar