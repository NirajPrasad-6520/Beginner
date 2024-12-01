'''
def calc_sum(a,b):
    sum=a+b
    print("The sum of" ,a, "and" ,b, "is:",sum)
    return sum

calc_sum(5,10)
calc_sum(2,10)
calc_sum(15,5)

# Q.WAF to print the length of a list. ( list is the parameter)
cities =["Delhi","Mumbai","Banglore","Lucknow","Punjab","Gorakhpur","Jharkhand"]
heroes=["IronMan","ShaktiMan","SuperMan","Thor","SpiderMan"]
def print_len(list):
    print(len(list))

print_len(cities)
print_len(heroes)

# Q.WAF to convert USD to INR.
usd_val=int(input("Enter USD :"))
def converter(usd_val):
    inr_val=usd_val * 83.74
    print("$",usd_val,"USD =","₹",inr_val,"INR")

converter(usd_val)

#Recursion function  
def fact(num):  
    if num == 1:
          return 1  
    else:  
           return (num * fact(num-1))  
#Body of the program  
num = int(input("Enter a number: "))  
result = fact(num)  
print("The factorial of the given number", num, "is", result)  
'''
# Q.Write a recursive function to calculate the sum of first n natural numbers.
def calc_sum(n):
     if(n==0):
          return 0
     return calc_sum(n-1)+n
n=int(input("Enter a number :"))
sum = calc_sum(n)
print("The sum of number",n,"is",sum)

# Q.Write a recursive function to print all elements in a list.
# Hint : use list & index as parameters.
def print_list(list,idx=0):
     if(idx == len(list)):
          return
     print(list[idx])
     print_list(list,idx+1)

fruits=["Mango","Litchi","Banana","Apple"]
print_list(fruits)