def eh_palindromo(texto):
    '''Verifica se uma palavra ou frase é um palíndromo.
    str -> bool'''
    try:
        texto_tratado = [caractere.lower() for caractere in texto if caractere.isalnum()]
        return texto_tratado == texto_tratado[::-1]
    except Exception as e:
        print(f"Erro ao processar o texto: {e}")
        return False


def main():
    '''Gerencia a interação do usuário para verificar palíndromos.
    None -> None'''

    print("Bem-vindo ao verificador de palíndromos!")

    while True:
        frase = input("Digite uma palavra ou frase: ")
        if frase.lower() == "sair":
            break
        if eh_palindromo(frase):
            print(f"'{frase}' é um palíndromo.")
        else:
            print(f"'{frase}' não é um palíndromo.")

    print("Obrigado por usar o verificador de palíndromos!")

if __name__ == "__main__":
    main()