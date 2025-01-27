# troubleSolution
 Rodolfo's challenge
 
```markdown
# Challenge 1 - Student Registration System

**Context:**

A school is creating a simple system to register students in a class. You need to develop a program that allows adding student names to a list and displaying the full list when requested.

**Requirements:**
1. Create a function called `adicionar_aluno` that receives a student's name and adds it to a list.
2. Create a function called `exibir_lista` that displays all registered students.
3. The program should continue prompting for new names until the user types "sair".
4. If the user tries to add a name that is already in the list, the program should display a message indicating that the name already exists.

**Example Program Flow:**
```

Input:

```text
Digite o nome do aluno: João  
Digite o nome do aluno: Maria  
Digite o nome do aluno: João  
Aluno já está na lista.  
Digite o nome do aluno: sair  
```

Output:

```text
Alunos cadastrados:  
1. João  
2. Maria
```

```markdown
# Challenge 2 - Palindrome Verifier

**Context:**

You were hired to develop a fun feature for a website. The idea is to allow users to check whether a word or phrase is a palindrome (i.e., it reads the same backward as forward, ignoring spaces and case differences).

**Requirements:**

1. Create a function called `eh_palindromo` that receives a string and returns True if it is a palindrome and False otherwise.
2. The function should ignore uppercase, lowercase, and spaces.
3. The program should prompt the user for a word or phrase, check if it is a palindrome, and display the result.
4. The program should continue until the user types "sair".

**Example Program Flow:**
```

Input:

```text
Digite uma palavra ou frase: arara  
'arara' é um palíndromo.  

Digite uma palavra ou frase: a cara rajada da jararaca  
'a cara rajada da jararaca' é um palíndromo.  

Digite uma palavra ou frase: python  
'python' não é um palíndromo.  

Digite uma palavra ou frase: sair  
```

Output:

```text
Obrigado por usar o verificador de palíndromos!
```
