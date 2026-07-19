n1 = str(input('Digite uma palavra ou texto: '))
print(n1)
print(type(n1))

n2 = int(input('Digite um número inteiro: '))
print(n2)
print(type(n2))

n3 = float(input('Digite um número real: '))
print(n3)
print(type(n3))

n4 = bool(input('Digite um valor: '))
print(n4)
print(type(n4))

n5 = int(input('Digite um algo: '))
print(f"{n5} É númerico?", n5.isnumeric())
print(f"{n5} É alfabético?", n5.isalpha())
print(f"{n5} É númerico e alfabético?", n5.isalnum())
print(f"{n5} É somente maiúsculo?", n5.isupper())
print(f"{n5} É somente minúsculo?", n5.islower())
print(f"{n5} Pode ser impresso?", n5.isprintable())
print(f"{n5} É um espaço?", n5.isspace())