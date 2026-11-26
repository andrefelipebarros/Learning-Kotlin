# Learning-Kotlin

Este repositório é o meu caderno de estudos em Kotlin.

## Por que criei este repositório

Eu quero aprender Kotlin praticando, e não só lendo ou assistindo aulas. Por isso criei este espaço para escrever pequenos arquivos, um por conceito, e rodar cada um para ver o que acontece na prática.

A ideia é simples:

- **Arquivos pequenos e focados.** Cada arquivo trata de um único assunto, para eu conseguir entender e revisar rápido depois.
- **Prática constante.** Errar, corrigir e tentar de novo faz parte do processo, então tudo o que eu escrever fica registrado aqui.
- **Registro da minha evolução.** O histórico de commits mostra por onde eu passei e o quanto avancei.
- **Material de consulta.** Quando eu esquecer como algo funciona, posso voltar a um arquivo meu, com exemplos que eu mesmo escrevi.

## Estado atual

Estou no começo. Por enquanto existe apenas o primeiro programa:

| Arquivo | Assunto |
| --- | --- |
| `00_HelloWorld.kt` | Meu primeiro programa em Kotlin |

Novos arquivos serão adicionados conforme eu for estudando cada tema.

## Como rodar um arquivo

Com o compilador do Kotlin instalado:

```bash
kotlinc 00_HelloWorld.kt -include-runtime -d hello.jar
java -jar hello.jar
```

Ou, no IntelliJ IDEA, basta abrir o arquivo e clicar no ícone de executar ao lado da função `main`.

## Objetivo

Ganhar fluência em Kotlin, passando pelos fundamentos da linguagem até conceitos mais avançados, sempre com código que eu escrevi e testei.
