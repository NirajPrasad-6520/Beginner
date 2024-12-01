# Displaying a strings
print("Hello World!")
"""
# Displaying multiple values
name="abc"
age=21
print("Name:",name,"Age:",age)

# Printing variables and literals
x=5
y=65
print("X:",x,"y:",y,"sum:",x+y)

# if-else statement
x=10
y=5
if(x>y):
    print("X is greater than y")
else:
    print("Y is greater than x")

# For loop
fruits = ["apple", "banana", "cherry"]
for x in fruits:
    print(x, end=" ")
    
# Print a newline to separate the outputs
print()

# While loop
i = 1
while i < 5:
    print(i, end=" ")
    i += 1

print()

A,b=2,3
txt="@"
print(2*txt*3)#text multiple

A,B="2",3
txt="@"
print((A+txt)*B)#strings multiply with numbers

A,B=2,3
C=4
print(A+B*C)#bodmas

A,B=10,5.0
C=A*B
print(C)#interger * float

A,B=1,2
C=A/B
print(C)

A,B=1.5,3
C=A//B
print(C,A/B)#Floor "//"means equal to or closest value give

A,B=12,5
C=A//B
print(C)#2.4 is answer but output give closest number 2

A,B=-12,5
C=A//B
print(C)#-3 is less than -2.4

A,B=12,-5
C=A//B
print(C)#-3 is less than -2.4

A,B=-5,2
C=A%B
print(C)

A,B=5,2
C=A%B
print(C)

A,B=5,-2
C=A%B
print(C)#denominator is -ve then output given -ve values

# input in python
name=input("name:")
age=int(input("age:"))
price=float(input("price:"))
print("My name is",name,"and my age is",age,"and price of wireless mouse is",price)

# if-else condition statement 
light=input("Light:")
if(light== "Red"):
    print("stop")
elif(light == "Yellow"):
    print("look")
elif(light == "Green" and "green"):
    print("Go")
else:
    print("Light is Broken")        


# Marksheets Grade program
marks = int(input("Mark:"))
if(marks >= 90):
    print("A")
elif(marks >= 80 and marks < 90):
    print("B")
elif(marks >70 and marks < 80):
    print("C")
elif(marks >= 60 and marks < 70):
    print("D")
elif(marks >= 50 and marks < 60):
    print("E")
else:
    print("Fail")

# A=5 & G=M
# A=2 & G=F
A=int(input("A:"))
G=input("M/F:")
if((A == 1 or A == 2) and G == "M"):
    print("fee is 100")
elif((A == 3 or A == 4) or G == "F"):
    print("fee is 200")
elif(A == 5 and G == "M"):
    print("fee is 300")
else:
    print("no fee")

# Single line if/Ternary operator
food=input("food:")
eat ="yes" if food == "cake" else "no"
print(eat)

# single line statement and single line print 
food=input("food:")
print("sweet") if food == "cake" or food == "jalebi" else print("No sweet")

# clever if / ternary operator
# syntax--<var>=(false_val,true_val)[<condition>]
age=int(input("age:"))
vote=("yes","no") [age < 18]

# type casting
a,b=1,"2"
c=int(b)
print(a+c)

# write a program to input 2 numbers & print their sum
a=int(input("Enter first no.:"))
b=int(input("Enter second no.:"))
print("sum:",a+b)

# wap to input side of a square & print its area.
side=float(input("side of square:"))
print("area:",side * side) 

# wap to input 2floating point numbers & print their average.
a=float(input("Enter first no.:"))
b=float(input("Enter second no.:"))
print("Average:",(a+b)/2)

# WAP to input 2 int numbers, a and b.
# Print True if a is greater than or equal to b. If not print False.
a=int(input("Enter 1st no.:"))
b=int(input("Enter 2nd no.:"))
c=input("string:")
if(a>=b):
    print("True")
else:
    print("False")
    print(len(c))

# Python program to demonstrate the application of iskeyword()  
# importing keyword library which has lists  
import keyword  
    
# displaying the complete list using "kwlist()."  
print("The set of keywords in this version is: ")  
print( keyword.kwlist )  

# Quiz Questions
def run_quiz():
    # Quiz Questions
    questions = [
        {
            "question": "What is the capital of France?",
            "options": ["A) Berlin", "B) Madrid", "C) Paris", "D) Rome"],
            "answer": "C"
        },
        {
            "question": "Which planet is known as the Red Planet?",
            "options": ["A) Earth", "B) Mars", "C) Jupiter", "D) Saturn"],
            "answer": "B"
        },
        {
            "question": "Who wrote 'To Kill a Mockingbird'?",
            "options": ["A) Harper Lee", "B) J.K. Rowling", "C) Mark Twain", "D) Charles Dickens"],
            "answer": "A"
        },
        {
            "question": "What is the largest mammal in the world?",
            "options": ["A) Elephant", "B) Blue Whale", "C) Great White Shark", "D) Giraffe"],
            "answer": "B"
        },
        {
            "question": "Which element has the chemical symbol 'O'?",
            "options": ["A) Gold", "B) Oxygen", "C) Osmium", "D) Zinc"],
            "answer": "B"
        }
    ]

    # Function to check the answer
    def check_answer(question, answer):
        return question["answer"] == answer

    score = 0

    for i, question in enumerate(questions):
        print(f"Question {i + 1}: {question['question']}")
        for option in question["options"]:
            print(option)
        
        user_answer = input("Your answer (A/B/C/D): ").strip().upper()

        if check_answer(question, user_answer):
            print("Correct!\n")
            score += 1
        else:
            print(f"Wrong! The correct answer is {question['answer']}\n")

    print(f"Your final score is: {score} out of {len(questions)}")

# Run the quiz
run_quiz()
"""
a=0b10001
c=~a