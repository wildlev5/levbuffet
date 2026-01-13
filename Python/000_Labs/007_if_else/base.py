x = int(input("Please enter a number: "))
y = input("Please enter an operation: ")
z = int(input("Please enter another number: "))
a = str(x) + y + str(z)
if y=="-":
    b = x-z
elif y=="+":
    b = x+z
elif y=="/":
    b = x/z
elif y=="*":
    b = x*z
elif y=="%":
    b = x%z
else:
    print("You did not enter an operation")
print(a +"=" + str(b) )

