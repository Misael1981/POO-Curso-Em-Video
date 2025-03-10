# O que é Visibilidade em um Objeto?

## Modificadores de Acesso

<div style="background-color: white; color: black; font-size: 20px; font-weight: bold;">
<hr>
Indicam o nível de acesso aos componentes internos de uma classe.
<hr>
</div>

Os modificadores de acesso são palavras-chave que controlam a visibilidade e o acesso de classes, interfaces, atributos e métodos. Eles são essenciais para proteger seus dados, organizar seu código e definir como as diferentes partes do seu programa interagem.

## Tipos de Modificadores de Acesso

Java possui quatro modificadores de acesso:

### 1. `public`

- **Acesso**: Sem restrições. Membros `public` são acessíveis de qualquer lugar do seu programa, dentro ou fora da classe, em outros pacotes e até mesmo em outros projetos.
- **Quando usar**: Use `public` para membros que precisam ser acessados por outras classes e partes do seu código, como métodos que definem a interface da sua classe ou atributos que precisam ser acessados externamente.

### 2. `protected`

- **Acesso**: Limitado. Membros `protected` são acessíveis dentro da mesma classe, em classes filhas (subclasses), mesmo que estejam em pacotes diferentes, e dentro do mesmo pacote.
- **Quando usar**: Use `protected` para membros que precisam ser acessados por classes filhas ou por outras classes dentro do mesmo pacote, mas não por classes externas.

### 3. `default` (sem modificador)

- **Acesso**: Restrito ao pacote. Membros sem modificador de acesso (o chamado "acesso padrão" ou "package-private") são acessíveis apenas dentro do mesmo pacote (mesmo diretório).
- **Quando usar**: Use o acesso padrão para membros que só precisam ser acessados por outras classes dentro do mesmo pacote, como classes auxiliares ou classes que implementam funcionalidades internas do seu sistema.

### 4. `private`

- **Acesso**: Oculto. Membros `private` só podem ser acessados dentro da própria classe em que foram declarados. Nem mesmo classes filhas ou outras classes no mesmo pacote podem acessá-los.
- **Quando usar**: Use `private` para atributos que representam dados internos da sua classe e que não devem ser acessados ou modificados diretamente por outras classes. Isso garante o encapsulamento e a proteção dos seus dados.

## Modificadores de Acesso para Classes

Ao declarar uma classe, você pode usar os modificadores `public` ou `default`:

- `public`: A classe é acessível de qualquer lugar.
- `default`: A classe só é acessível dentro do mesmo pacote.

## Modificadores de Acesso para Interfaces

Interfaces só podem ser `public`.

## Modificadores de Acesso para Atributos e Métodos

Você pode usar qualquer um dos quatro modificadores de acesso para atributos e métodos, com as regras que vimos acima.

### Exemplo

```
package meusistema;

public class Cliente { // Classe public

    public String nome; // Atributo public
    protected String endereco; // Atributo protected
    String cpf; // Atributo com acesso default
    private String senha; // Atributo private

    public void comprar() { // Método public
        // ...
    }

    protected void calcularDesconto() { // Método protected
        // ...
    }

    void gerarRelatorio() { // Método com acesso default
        // ...
    }

    private void validarSenha() { // Método private
        // ...
    }
}
```

### Dicas

- Use o modificador de acesso mais restritivo possível que atenda às suas necessidades. Isso ajuda a proteger seus dados e a manter seu código mais organizado e fácil de entender.
- Pense cuidadosamente sobre quais membros da sua classe precisam ser acessados por outras classes e quais devem ser mantidos internos.
- Consulte a documentação oficial do Java para obter informações mais detalhadas sobre os modificadores de acesso.

- ### [Vídeo da AULA 03 - O que é Visibilidade em um Objeto?](https://www.youtube.com/watch?v=jFI-qqitzwk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=6)

### [Voltar ao README Principal](../../README.md)
