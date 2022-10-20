# List RMI

## Alunos
- Anthony Bernardo Kamers (19204700)

Implementando uma lista compartilhada por RMI em Java

Rodar o arquivo `bash server.sh`.

Após compilar todos os arquivos com `javac *.java`, deve rodar tanto
Client, quanto Server com os seguintes comandos:

```bash
java -Djava.security.policy=server.policy Server
java -Djava.security.policy=server.policy Client
```

Para trocar o tipo da lista, é necessário alterar:
* Server: a instanciação de ListRMI na linha 12
* Client: cast para interface ListInterface nas linhas 9 e 15
  * O valor enviado para a lista, na linha 24 e o tipo pego pelo
Scanner na linha 42

OBS: Foi tentado fazer uma classe genérica para absorver tais fatos,
mas não foi possível devido a algumas restrições de cast de Java.