import requests
a = input("Which pokeman would you like to learn about? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + a).json()
print(pokemon["name"])
print(pokemon["weight"])
print(pokemon["height"])