'''
list=[3,5,2,1]

print("Append:")
list.append(4)#adding the new number at the end.
print(list)

print("Sort:Ascending")#by default
list.sort()
print(list)

print("Descending:")
list.sort(reverse=True)
print(list)

print("Ascending:")
list.sort(reverse=False)
print(list)

print("reverse:")
list.reverse()
print(list)

print("Insert:")
list.insert(2,55)#insert the new number on given index.
print(list)
list.insert(5,55)#insert the new number on given index.
print(list)

print("Remove:")
list.remove(55)#remove the number.
print(list)

print("pop:")
list.pop(4)#remove the index value.
print(list)
print(type(list))

#Tuple
tup=(2,1,6,3,2,2)
print(type(tup))
print(tup.index(6))#here 6 is element and output given index numbers.
print(tup.count(2))

# Q.WAP to ask the user to enter names of their 3 favorite movies & store them in a list.
movie=[]
mov=input("1st favorite movies:")
movie.append(mov)
mov=input("2nd favorite movies:")
movie.append(mov)
mov=input("3rd favorite movies:")
movie.append(mov)

print(movie)

# Q.WAP to count the number of students with the “A” grade in the following tuple.
#              [”C”,“D”,“A”,“A”,“B”,“B”,“A”]
grade=("C","D","A","A","B","B","A")
print(grade.count("A"))
print(type(grade))

# Q.Store the above values in a list & sort them from “A” to “D”.
grade=["C","D","A","A","B","B","A"]
grade.sort()
print(grade)
print(type(grade))
'''

#Dictionary 
info={
    "name":"ABC",
    "subjects":["Pyhton","Java","MySql","HTML","CSS"],
    "topics":("dict","set"),
    "age":25,
    "is_adult":True
}
# print(info)
# print(info["name"])
# print(info["topics"])
# print(info["is_adult"])
# print(info["subjects"])
# info["name"]="Niraj"
# info["surname"]="Prasad"
# print(info)
# print(info.keys())#show all keys
# print(list(info.keys()))#all keys represent in list 
# print(info.values())#show all keys values 
print(info.items())#returns all (Keys:value)pairs as tuple()
print(list(info.items()))#all keys:values represent in list 