//code1:-
let course=["HTML","Java","CSS","JavaScript","Python","SQl","DSA"];
for(let i=0;i < course.length; i++)
   {
console.log(course[i-1]);
}

//code2:-
//Creating and Initializing an array with values
let courses1 = new Array("HTML", "CSS", "Javascript", "React");
console.log(courses1);

//code3:-
//Initializing Array while declaring
let arr = new Array(3);
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
console.log(arr);

//code4:-
//Creating an Array and Initializing with Values
let courses2 = ["HTML", "CSS", "JavaScript", "React"];

//code5:-
//Accessing Last Array Elements
let lastItem = courses[courses.length - 4];

console.log("First Item: ", lastItem);

let courses = ["HTML", "CSS", "JavaScript", "React"];
console.log(courses);

courses[1]="bootstrap";
console.log(courses);

//code6:-
//Creating an Array and Initializing with Values
let courses = ["HTML", "CSS", "Javascript", "React", "Node.js"];
console.log("Original Array: " + courses);

//code7:-
//Removes and returns the last element
let lastElement = courses.pop();
console.log("After Removed the last elements: " + courses);

//code8:-
//Removes and returns the first element
let firstElement = courses.shift();
console.log("After Removed the First elements: " + courses);

//code9:-
//Removes 2 elements starting from index 1
courses.splice(1,2,"dbms","python","java");
console.log("After Removed 2 elements starting from index 1: " + courses);
courses.splice(2,0,"dbms","python","java");
console.log("After Removed 2 elements starting from index 1: " + courses);

//code10:-
//Creating an Array and Initializing with Values
let courses = ["HTML", "CSS", "Javascript", "React", "Node.js"];

//code11:-
//Increase the array length to 7
courses.length = 7;

console.log("Array After Increase the Length: ", courses);

//code12:-
//Decrease the array length to 2
courses.length = 2;
console.log("Array After Decrease the Length: ", courses)

//Q1.For a given array with marks of students -> [85, 97, 44, 37, 76, 60]
//Find the average marks of the entire class
let mark=[85,97,44,37,76,60,88,44,88,44,66,85];
let sum=0;
for(let val of mark){
    sum +=val;
    console.log("length of marks",mark.length)
}
let avg = sum / mark.length;
console.log(`Sum of mark is ${sum} and the average of the mark is ${avg}`);

//Qs. For a given array with prices of 5 items -> [250, 645, 300, 900, 50]
//All items have an offer of 10% OFF on them. Change the array to store final price after
///applying offer.

let items =[250,645,300,900,50];
let i=0;
for(let val of items){
   console.log(`value at index ${i} = ${val}`);
    let offer = val /10;
    items[i] -=offer;
    console.log(`value after apply offer =${items[i]}`);
    i++;
}

// Qs. Create an array to store companies -> “Bloomberg”,“Microsoft”,“Uber”,“Google”,“IBM”,“Netflix”
// a. Remove the first company from the array
let companies=["Bloomberg","Microsoft","Uber","Google","IBM","Netflix"];
console.log(companies);

let val =companies.shift();//remove first element.
console.log(companies);

// b. Remove Uber & Add Ola in its place
companies.splice(1,1,"OLA");
console.log(companies);

// c. Add Amazon at the end
companies.push("Amazon");
console.log(companies);

var array = ["Mountains","Sea","Island","Forest","Cave"];
array.slice(2);
console.log(array);
