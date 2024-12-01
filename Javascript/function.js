//Arrow Function with Parameters
// const g = ( x, y, z ) => {
//     console.log( x + y + z )
// }
// g( 10, 20, 30 );

///Arrow function with default parameters:
//1=>
// const gh = ( x, y, z =30 ) => {
//     console.log( x + " " + y + " "+ z);
// }
// gh( 10, 20);

//2=>
// var show = (a, b=200) => {
//     console.log(a + " " + b);
// }
// show(100);
// var show = (a, b, c,d,e,f,...args) => {  
//     console.log(a + " "+b+" " +c+" "+d+" "+e+" "+f+" "+ args);  
// }  
// show(100,200,300,400,500,600,700,800); 

//Q.Create a function using the "function" keyword that takes a string as an argument & returns the number of vowels in the string.
function countvowels(str){
  let count=0;
  for(const char of str){
    if(char === "a"|| char === "e"|| char === "i" || char === "o" || char === "u"){
count++;
    }
  }
  //console.log(count); 
return count;
}
const countvowel=(str) =>{
    let count=0;
    for(const char of str){
      if(char === "a"|| char === "e"|| char === "i" || char === "o" || char === "u"){
  count++;
      }
    }
    //console.log(count); 
  return count;
}

//Qs. For a given array of numbers, print the square of each value using the forEach loop.
// let nums=[2,3,4,5,6];
// nums.forEach((num,idx)=>{ //forEach is use for normally count the numbers.
//     console.log(num**2,idx);
// })

//Map method.
//example-1
// let arr1=[67,52,39];
// arr1.map((val) => {   //map methods is use for count the numbers with new variables.
// console.log(val);
// });
// //example-2
// let newarr= arr1.map((val) => {
// return val*2;
// });
// console.log(newarr);

//filter method
// let arr2=[1,2,3,4,5,6,7];
// let newarr1 = arr2.filter((val) =>{  //filter method is use check every individual array and filter out base on some condition and then give filtered array.
//     return val % 2 !== 0; //if find greater than 3 then val > 3.
// });console.log(newarr1);

//reduce method
//example-sum
//  let arr=[1,2,3,4];
//  const output =arr.reduce((res,curr)=>{
//      return res + curr;
//      return res < curr ? res : curr;
//  });
//  console.log(output);//10

//example-largest
//  let arr=[1,2,3,4];
//  const output =arr.reduce((res,curr)=>{
//      return res > curr ? res : curr;
//  });
//  console.log(output);

//Qs. We are given array of marks of students. Filter our of the marks of students that scored 90+.
// let marks=[55,80,90,99,95,93,83,40,30];
// const results =marks.filter((res) =>{
//     return res >= 90;
//      });
//      console.log(results);

//Qs. Take a number n as input from user. Create an array of numbers from 1 to n.
  //* Use the reduce method to calculate sum of all numbers in the array.
  //* Use the reduce method to calculate product of all numbers in the array.

//   let n = prompt("enter a number");
//   let arr=[];
//   for(let i = 1; i <= n; i++){
//     arr[i - 1] = i;
//   }
//   console.log("array =",arr);

// let sum=arr.reduce((res,curr)=>{
//     return res + curr;
// })
// console.log("sum = ",sum);

// let fac=arr.reduce((res,curr)=>{
//     return res * curr;
// })
// console.log("factorial= ",fac);

