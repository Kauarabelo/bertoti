## **Aula 14/02**

# 📚 Resumo do Livro "Software Engineering at Google" (O'Reilly) 

## 🕰️ **Principais Ideias**

### 1. **Engenharia de Software ≠ Programação**
   - **Programar** é como fazer um bolo: você segue uma receita (código) para resolver um problema específico.  
   - **Engenharia de Software** é como administrar uma padaria inteira: precisa durar anos, sem pegar fogo, e se adaptar a novos sabores (atualizações).  
   - **Exemplo da Google:** Eles lidam com sistemas usados por **bilhões de pessoas**, então precisam de regras duras (revisão de código, testes automáticos) para evitar desastres.

### 2. **Código que Envelhece Bem**  
   - Imagine seu código como uma **planta**: precisa de água (manutenção), poda (refatoração) e luz solar (documentação) para não morrer.  
   - **Práticas da Google:**  
     - ✅ **Documentação clara** (ninguém quer adivinhar como seu código funciona).  
     - ✅ **Testes automáticos** (pra não ter surpresas quando mexer em algo).  
     - ✅ **Padronização** (todo mundo escreve código do mesmo jeito, evita confusão).

---

## ⚖️ **3 Tradeoffs Clássicos (e Como a Google Lida)**

### 1. **🚀 Lançar Rápido vs. 🐛 Ter Menos Bugs**
   - **Problema:** Quer soltar uma feature nova amanhã? Testar tudo direito pode levar uma semana.  
   - **Solução Google:** Testes automáticos que rodam em **minutos** (não dias). Assim, dá pra ser rápido **e** seguro.

### 2. 💻 **Código Centralizado (Monorepo) vs. Bagunça**
   - **Problema:** Todo mundo trabalha no mesmo lugar (repositório único). Vantagem: colaboração fácil. Desvantagem: se alguém errar, quebra tudo.  
   - **Solução Google:** Ferramentas que organizam o caos, tipo um **"Google Docs" para código** (ex: sistema de build `Bazel`).

### 3. 🆕 **Tecnologia Nova vs. Sistema Antigo**
   - **Problema:** Querem trocar o banco de dados por um mais moderno, mas o antigo ainda é usado por 100 times.  
   - **Solução Google:** Mudança **aos poucos** (ex: migração do Python 2 para 3), como reformar uma casa sem derrubar as paredes.

## **Aula 21/02 e 24/02** 

- Link para repositorio do **CÓDIGO** e da **UML**
