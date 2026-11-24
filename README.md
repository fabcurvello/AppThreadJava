# App Thread (Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo que executa uma tarefa demorada em **segundo plano** sem travar a tela, atualizando o progresso na interface.

## Contexto acadêmico

Exercício aplicado em sala de aula, usado como prática guiada com os alunos.

## Versão em Kotlin

Esta mesma aplicação também foi desenvolvida em **Kotlin**: [AppThreadKotlin](https://github.com/fabcurvello/AppThreadKotlin). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- Botão **Iniciar** dispara uma tarefa longa simulada em uma `Thread` separada.
- O progresso (0% a 100%) é enviado para a tela principal com um `Handler` ligado ao `Looper` principal.
- Ao final, a tela mostra "Status: Finalizado".

## Conceitos trabalhados em aula

- **Threads** e processamento em segundo plano
- Por que não bloquear a *UI thread*
- Atualização da interface com `Handler` e `Looper.getMainLooper()`
- `Thread.sleep` para simular tarefas demoradas

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 28` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppThreadJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 28 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppServicesJava](https://github.com/fabcurvello/AppServicesJava)
- [AppServicesKotlin](https://github.com/fabcurvello/AppServicesKotlin)
- [AppRemoteProcedureCallsBinderJava](https://github.com/fabcurvello/AppRemoteProcedureCallsBinderJava)
- [AppRemoteProcedureCallsBinderKotlin](https://github.com/fabcurvello/AppRemoteProcedureCallsBinderKotlin)
- [AppThreadKotlin](https://github.com/fabcurvello/AppThreadKotlin)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
