import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
#joke = requests.get("https://v2.jokeapi.dev/joke/Any?type=single").json()
a = int(input("How many jokes would you like? "))
for a in range(0,a):
    print(joke["setup"])
    print(joke["delivery"])
    print("")
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

# Jokes with 2 parts have a set up and 
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

