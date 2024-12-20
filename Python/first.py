# Displaying a strings
print("Hello World!")
print()

# Displaying multiple values
print("Displaying multiple values")
name = "abc"
age = 21
print("Name:", name, "Age:", age)
print()

# Printing variables and literals
print("Printing variables and literals")
x = 5
y = 65
print("X:", x, "y:", y, "sum:", x+y)
print()


# if-else statement
print("if-else statement")
x1 = 10
y1 = 5
if(x1 > y1):
    print("X is greater than y")
else:
    print("Y is greater than x")
print()

# For loop
print("For loop")
fruits = ["apple", "banana", "cherry"]
for x2 in fruits:
    print(x2, end = " ")
    
# Print a newline to separate the outputs
print()
print()

# While loop
print("While loop")
i = 1
while i < 5:
    print(i, end = " ")
    i += 1
print()
print()

print("#text multiple")
A, b = 2, 3
txt = "@"
print(2 * txt * 3 )#text multiple
print()

print("strings multiply with numbers")
Aa, Bb = "2", 3
txt1 = "@"
print((Aa + txt1 ) * Bb)#strings multiply with numbers
print()

print("bodmas")
A1, B1 = 2, 3
C = 4
print(A1 + B1 * C)#bodmas
print()

print("interger * float")
A2, B2 = 10, 5.0
C1 = A2 * B2
print(C1)#interger * float
print()

print("Divide :")
A3, B3 = 1, 2
C2 = A3 / B3
print(C2)
print()

print("Floor")
A4, B4 = 1.5, 3
C3 = A4 // B4
print(C3, A4 / B4)#Floor "//"means equal to or closest value give

A5, B5 = 12, 5
C4 = A5 // B5
print(C4)#2.4 is answer but output give closest number 2

A6, B6 = -12, 5
C5 = A6 // B6
print(C5)#-3 is less than -2.4

A7, B7 = 12,-5
C6 = A7 // B7
print(C6)#-3 is less than -2.4
print()

print("Modulus Operation")
A8, B8 = -5, 2
C7 = A8 % B8
print(C7)

A9, B9 = 5, 2
C8 = A9 % B9
print(C8)

A10, B10 = 5, -2
C9 = A10 % B10
print(C9)#denominator is -ve then output given -ve values
print()

# input in python
print("input in python")
name = input("name:")
age = int(input("age:"))
price = float(input("price:"))
print("My name is",name,"and my age is",age,"and price of wireless mouse is",price)
print()

# if-else condition statement
print("if-else condition statement - Traffic Signal :")
light = input("Light:").strip()  # Remove extra spaces from input
if light.lower() == "red":       # Case-insensitive check for "Red"
    print("stop")
elif light.lower() == "yellow":  # Case-insensitive check for "Yellow"
    print("look")
elif light.lower() == "green":   # Case-insensitive check for "Green"
    print("Go")
else:
    print("Light is Broken")
print()

# Marksheets Grade program
print("Marksheets Grade program")
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
print()

# A11 = 5 & G = M
# A11 = 2 & G = F
A11 = int(input("A:"))
G = input("M / F:")
if((A11 == 1 or A11 == 2) and G == "M"):
    print("fee is 100")
elif((A11 == 3 or A11 == 4) or G == "F"):
    print("fee is 200")
elif(A11 == 5 and G == "M"):
    print("fee is 300")
else:
    print("no fee")
print()

# Single line if/Ternary operator
print("Single line if/Ternary operator : ")
food = input("food:")
eat = "yes" if food == "cake" else "no"
print(eat)
print()

# single line statement and single line print
print("single line statement and single line print : ")
food = input("food:")
print("sweet") if food == "cake" or food == "jalebi" else print("No sweet")
print()

# clever if / ternary operator
# syntax--<var>=(false_val,true_val)[<condition>]
print("Voting Age")
age = int(input("age:"))
vote = ("yes", "no")[age < 18]
print(vote)
print()

# type casting
print("Type Casting")
a, b = 1, "2"
c10 = int(b)
print(a + c10)
print()

# write a program to input 2 numbers & print their sum
print("input 2 numbers & print their sum : ")
a1 = int(input("Enter first no.:"))
b1 = int(input("Enter second no.:"))
print("sum:", a1 + b1)
print()

# wap to input side of a square & print its area.
print("input side of a square & print its area : ")
side = float(input("side of square:"))
print("area:", side * side)
print()

# wap to input 2floating point numbers & print their average.
print("2floating point numbers & print their average : ")
a2 = float(input("Enter first no.:"))
b2 = float(input("Enter second no.:"))
print("Average:",(a2 + b2) / 2)
print()

# WAP to input 2 int numbers, a and b.
# Print True if a is greater than or equal to b. If not print False.
print("greater than or equal :")
a3 = int(input("Enter 1st no.:"))
b3 = int(input("Enter 2nd no.:"))
c11 = input("string:")
if a3 >= b3:
    print("True")
else:
    print("False")
    print(len(c11))

print()

# Python program to demonstrate the application of iskeyword()
# importing keyword library which has lists
import keyword
    
# displaying the complete list using "kwlist()."
print("The set of keywords in this version is: ")
print( keyword.kwlist )
print()

# Quiz Questions
print("Quiz Questions :")
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

a4 = 0b10001
c15 = ~a4