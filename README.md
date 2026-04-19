# Employee (Console + Maven)

Aplicação **Java (console)** para praticar **herança e polimorfismo** com o domínio de funcionários.

O programa lê dados de *N* funcionários pelo terminal. Para cada funcionário, você informa se ele é **terceirizado** (`OutsourcedEmployee`) ou **normal** (`Employee`). No final, o sistema imprime a lista de **pagamentos** calculados.

## O que existe no projeto (código atual)

- `entities/Employee`
  - Campos: `name`, `hours`, `valuePerHour`
  - Método `payment(hours, valuePerHour)` calcula `hours * valuePerHour`
  - `toString()` imprime: `Nome - $<pagamento>`

- `entities/OutsourcedEmployee extends Employee`
  - Campo: `additionalCharge`
  - Sobrescreve `payment(...)` somando **110%** do `additionalCharge` ao pagamento base

- `org.example.Main`
  - Lê a quantidade de funcionários
  - Para cada funcionário, lê os dados via `Scanner`
  - Imprime `PAYMENTS:` e depois imprime cada objeto (usando `toString()`)

## Requisitos

- **Java/JDK**: o `pom.xml` está configurado com `maven.compiler.source/target = 25` (Java 25)
- **Maven**

## Como executar

### 1) Compilar

```bash
mvn clean compile
```

### 2) Rodar

O projeto não está configurado no `pom.xml` para gerar um `.jar` executável, então a forma mais simples é executar a classe `Main` pela sua IDE (IntelliJ/Eclipse).

> Se você quiser rodar pelo terminal via Maven, dá para adicionar o `exec-maven-plugin` no `pom.xml` e então usar:
>
> ```bash
> mvn exec:java
> ```

## Exemplo de uso (entrada/saída)

Exemplo de interação no console (aproximado):

```text
Enter the number of employees: 2
Employee #1 data:
Outsourced? (y/n): n
Name: Alex
Hours: 40
Value per hour: 20
Employee #2 data:
Outsourced? (y/n): y
Name: Bob
Hours: 40
Value per hour: 20
Addicional charge: 200
PAYMENTS:
Alex - $800.00
Bob - $1020.00
```

## Estrutura de pastas

```
.
├── pom.xml
└── src
    └── main
        └── java
            ├── entities
            │   ├── Employee.java
            │   └── OutsourcedEmployee.java
            └── org
                └── example
                    └── Main.java
```

## Autor

- GitHub: https://github.com/PaivaOfc
