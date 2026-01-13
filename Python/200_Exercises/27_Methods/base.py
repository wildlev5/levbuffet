def add (x, y):
    sum = x + y
    return sum
    
def mult (x, y):
    prod = x * y
    return prod

def printList (lst):
    i = 1
    for item in lst:
        print(str(i) + ". " + item)
        i = i + 1

ans = add(5, 3)
print(ans)

christmasList = ["money", "chocolate", "mansion", "dog", "T-shirts" ]
printList(christmasList)

listOfNumbers = [67, 6, 7, 21, 41, 3, 589]

def sumlist(lstNum):
    sum = 0
    for num in lstNum:
        sum = sum + num
    return sum
print(sumlist(listOfNumbers))
    
        
        
    
    
    
    
