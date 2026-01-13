import random
thislist = [3, 6, 7, 8, 3, 2, 0, 9, 10, 5]
x = int(input("How many random numbers would you like? "))
print("Your numbers are: ", end = "")
for x in range(0,x):
    print((thislist[random.randrange(10)]), end =", ")
    
   