"""
# indexing
a="welcome to Python"
ch=a[13]
print(ch)

# slicing
a="welcome to Python"
print(a[1:6])
print(a[1:])
print(a[:6])

# negative index
print(a[-6:-1])
print(a[-6:])
print(a[:-1])

print(a.endswith("on"))#if end word are match then give true 
print(a.capitalize())#1st char capital
print(a.replace("o","a"))#replace old to new 
print(a.find("o"))#find first words and sentence
print(a.count("o"))#count how many time words are available in sentence. 

# Q.WAP to input user’s first name & print its length.
a=input("First name:")
print(a,len(a))
# Q.WAP to find the occurrence of ‘$’ in a String.
print(a.find("$"))

# Q.WAP to check if a number entered by the user is odd or even.
a=int(input("Enter a numbers:"))
if(a % 2 == 0):
    print(a,"is even")
else:
    print(a,"is odd")

# Q.WAP to find the greatest of 3 numbers entered by the user.
a=int(input("Enter 1st number:"))
b=int(input("Enter 2nd number:"))
c=int(input("Enter 3rd number:"))
if(a >= b and a >= c):
    print("a is greater")
elif(b >= c):
    print("b is greater")
else:
    print("c is greater")    

# Q.WAP to check if a number is a multiple of 7 or not.
a=int(input("Enter a numbers:"))
if(a % 7 == 0):
     print(a,"is multiple of 7")
else:
     print(a,"is not multiple of 7")
"""