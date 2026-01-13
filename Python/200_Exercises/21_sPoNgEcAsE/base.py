a = input("Enter a phrase: ")
b = 0
for char in a:
    if(b%2==0):
        print(char.lower(), end ="")
        b = b+1
    else:
        print(char.upper(), end ="")
        b = b+1
        
        
    
    
    