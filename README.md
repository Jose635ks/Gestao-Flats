# 🏢 Flats — Sistema de Gestão de Apartamentos

Sistema de gestão de apartamentos desenvolvido em Java, que lê dados a partir de um ficheiro de texto e identifica o flat de tipo 3 mais barato nos andares inferiores ou iguais ao 5.º.

---

## 📋 Descrição

O programa lê um ficheiro (`Flats.txt`) com registos de apartamentos, apresenta a lista completa de flats com o tipo, andar e valor de aluguer, e identifica automaticamente o **flat de tipo 3 mais barato** localizado no **andar 5 ou inferior**.

---

## ⚙️ Funcionalidades

- 📂 **Leitura de dados** a partir do ficheiro `Flats.txt`
- 🏠 **Listagem** de todos os flats com tipo, andar e valor de aluguer
- 🔍 **Identificação automática** do flat tipo 3 mais barato no andar ≤ 5
- 📊 **Apresentação do resultado** com os dados do flat encontrado
- ⚠️ **Mensagem informativa** caso não exista flat tipo 3 no andar ≤ 5

---

## 🗂️ Estrutura do Projeto

```
src/
├── Main.java          # Ponto de entrada da aplicação
├── Flats.java         # Classe modelo do flat (tipo, andar, aluguer)
└── GestaoFlats.java   # Lógica de leitura do ficheiro e identificação do flat mais barato
```

---

## 📄 Formato do Ficheiro de Entrada

O ficheiro `Flats.txt` deve ter uma linha por registo, com os campos separados por espaço:

```
TipoFlat  Andar  Aluger
```

**Exemplo:**
```
3 4 1500.00
1 8 2200.00
3 5 1200.00
2 2 1800.00
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Passos

1. Clona o repositório:
   ```bash
   git clone https://github.com/teu-utilizador/flats-gestao-java.git
   ```

2. Certifica-te que o ficheiro `Flats.txt` está na raiz do projeto.

3. Compila e executa:
   ```bash
   javac src/*.java -d out/
   java -cp out/ Main
   ```

---

## 🖥️ Exemplo de Output

```
 Tipo de Flat: 3 Andar: 4 Aluger: $1,500.00
 Tipo de Flat: 1 Andar: 8 Aluger: $2,200.00
 Tipo de Flat: 3 Andar: 5 Aluger: $1,200.00
====Resultado===
Flat do tipo 3 mais barato no andar <=5:
 Tipo de Flat: 3 Andar: 5 Aluger: $1,200.00
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem de programação
- **FileReader / BufferedReader** — Leitura de ficheiros de texto
- **StringTokenizer** — Parsing de linhas do ficheiro
- **NumberFormat (Locale.US)** — Formatação de valores monetários em USD

---

## 👨‍💻 Autor

Trabalho Prático — Desenvolvido no âmbito da unidade curricular de programação.
