i = input("Please enter a year: ")
if int(i)%100 == 0 and int(i)%400 != 0:
    print("The year " + i + " is not a leap year.")
elif int(i)%4==0:
    print("The year " + i + " is a leap year!")
else:
    print("The year" + i + "is not a leap year.")