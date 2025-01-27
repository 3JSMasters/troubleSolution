def adicionar_aluno(nome, lista_alunos):
    """Adiciona um nome à lista de alunos, caso ainda não esteja nela.
    str, list -> None"""
    
    nome_formatado = " ".join(
        palavra.capitalize() if i == 0 or len(palavra) > 3 else palavra
        for i, palavra in enumerate(nome.lower().split())
    )
    
    if nome_formatado in lista_alunos:
        print("Aluno já está na lista.")
    else:
        lista_alunos.append(nome_formatado)


def exibir_lista(lista):
    """Exibe todos os alunos cadastrados.
    list -> None"""
    print("\nAlunos cadastrados:")
    for i, aluno in enumerate(lista, 1):
        print(f"{i}. {aluno}")

def main():
    """Gerencia a interação do usuário para cadastrar alunos.
    None -> None"""
    lista_alunos = []

    while True:
        try:
            nome = input("Digite o nome do aluno: ")
            if nome.lower() == "sair":
                break
            adicionar_aluno(nome, lista_alunos)
        except Exception as e:
            print(f"Erro: {e}. Tente novamente.")
    
    exibir_lista(lista_alunos)

if __name__ == "__main__":
    main()
