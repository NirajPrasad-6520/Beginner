'''
#while loop

# Q.Print numbers from 1 to 100.
i=1
while(i<=100):
    print(i)
    i+=1

# Q.Print numbers from 100 to 1.
i=100
while(i>=1):
    print(i)
    i-=1

# Q.Print the multiplication table of a number n.
n = int(input("Enter a number: "))
i = 1
while i <= 10:
    print(n,"*",i,"=",n*i)
    i += 1

# Q.Print the elements of the following list using a loop:
#         [1, 4, 9, 16, 25, 36, 49, 64, 81,100]
n=[1, 4, 9, 16, 25, 36, 49, 64, 81,100]
i=0
while i<len(n):
    print(n[i])
    i+=1

# Q.Search for a number x in this tuple using loop:
#        (1, 4, 9, 16, 25, 36, 49, 64, 81,100)
n=(1, 4, 9, 16, 25, 36, 49, 64, 81,100,36)
x=int(input("enter a numbers:"))
i=0
while i< len(n):
    if(n[i] == x):
        print("found at idx",i)
        break
    i+=1
else:
    print("not in the list")

# for loop
cities =["Mumbai","Delhi","Lucknow","Gorakhpur","Jharkhand"]
name= "Niraj Prasad"
for val in cities:
    print(val)   
for vals in name:
    print(vals)   

# Q.Print the elements of the following list using a loop:
#        [1, 4, 9, 16, 25, 36, 49, 64, 81,100]
n=[1, 4, 9, 16, 25, 36, 49, 64, 81,100]
for el in n:
    print(el)
    
# Q.Search for a number x in this tuple using loop:
#    [1, 4, 9, 16, 25, 36, 49, 64, 81,100]
n=(1, 4, 9, 16, 25, 36, 49, 64, 81,100)
x=int(input("enter a numbers: "))
i=0
for el in n:
    if(el==x):
        print("number found at idx",i)
        break
    i += 1
else:
    print("not in the list")

# Range:Range functions returns a sequence of numbers, starting from 0 by default, and
# increments by 1 (by default), and stops before a specified number.
# Syntax:range(start?,stop,step?).

for el in range(10):#start,step are optional
    print(el)

for el in range(1,10,2):
    print(el)

# Print even and odd in range function
# EVEN
for el in range(2,101,2):
    print(el)
# ODD
for el in range(1,100,2):
    print(el)
    
# using for & range( )
# Q.Print numbers from 1 to 100.
for i in range(1,101,1):
    print(i)
# Print numbers from 100 to 1.
for i in range(100,0,-1):
    print(i)
# Print the multiplication table of a number n.

n=int(input("Enter any number: "))
for i in range(1,11):
    print(n,"*",i,"=",n*i)

# Pass statement
# pass is a null statement that does nothing. It is used as a placeholder for future code.

for i in range(5):
    pass

# Q.WAP to find the sum of first n natural numbers. (using while)
# using while loop

n=int(input("Enter a number: "))
sum=0
i=1
while i <= n:
    sum += i
    i +=1
print("Total sum =",sum)

#using for loop
# for i in range(1,n+1):
#     sum += i
# print("Total sum=",sum)

# Q.WAP to find the factorial of first n natural numbers. (using for)

n=int(input("Enter a number: "))
fact=1
for i in range(1,n+1):
    fact *= i
print("Factorial =",fact)
'''