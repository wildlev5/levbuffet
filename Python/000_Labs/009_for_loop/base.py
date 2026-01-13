i = int(input("Please enter line length: "))
a = input("Do you want a horizontal or vertical line?: ")
z = i
for i in range(0, z):
    if a=="vertical" or a=="Vericle":
        print("*")
    elif a=="horizontal" or a=="Horizontal":
        print("*", end = "")
    