//for of loop
//print 1 to 5
// for(let i=1;i<=5;i++){
//     console.log("welcome to JavaScript")
// }
// console.log("loop has ended")

//calculate the sum of 1 to 5.
// let sum=0;
//let n=100;//if we print n number then use it
// for(let i=1;i<=8;i++)//for--->i<=n______or________when print only number then i<=5. 
// {
    // sum=sum+i;
    // console.log("sum =",sum,"   ","i =",i);//if we give "," btw them then the output give highlight the numbers and if we give "+" then it will give normal output numbers. 
// }
//for-of-loop
// let strg  = "NirajPrasad";
// let size = 0;
// for(let i of strg)
//     {
//     console.log("i = ", i," ","Size =",size);
//     size++;
// }
// console.log("String size =", size);

//Pratice print all number between 0 to 100.
// for(let num=0; num<=100; num++)
//     {
//         console.log(num);
//     }

//Print all even and Odd number between 0 to 100.
// for(let num=0; num<=10; num++)
//     if(num%2==0) 
//         //if(num%2 !==0)
//         {
//             console.log("even =",num);
//         }
//         //Odd
//         for(let num1=0; num1<=9; num1++)
//         if(num1%2 !==0){
//             console.log("Odd =",num1)
//         }

//Q1.Create a game where you start with any random game number. Ask the user to keep
// guessing the game number until the user enters correct value
// let gamenum=25;
// let Usernum= prompt("Guess the game number");
// while(Usernum != gamenum)
//     {
//         Usernum = prompt("You  entered wrong number.Guess again:");
//     }
//     console.log("Congratulations,you entered the right number");

//Template Literals 

let obj={
    items: "pen",
    price:10,
};
let output=`The cost of ${obj.items} is ${obj.price} rupees`;//here price convert into string.
console.log(output);
console.log("the cost of",obj.items,"is",obj.price,"rupees");// here price is highlighted because price is number.

//escape characters, tab(space), \n(nextline),length.
let str="     Niraj\tPrasad     ";
console.log("str =" ,str , "\n" ,str.length);
console.log(str.toUpperCase());
console.log(str.toLowerCase());
console.log(str.trim());//remove whitespace for starting and ending.

//str.slice method
let nam="NirajPrasad";
console.log(nam.slice(1,5)); 

//concat method
let a = "Nirajajajaj prasad\t";
let b = "Prasad";
console.log(a.concat(b));
console.log(a.length);

// str.replace method
console.log(a.replace("N","s"));
console.log(a.replace("aj","ya"));
console.log(a.replaceAll("a","s"));
console.log(a.charAt(6));

//Q.Prompt the user to enter their full name. Generate a username for them based on the input.
// Start username with @, followed by their full name and ending with the fullname length.
// eg: user name =“Nirajprasad”, username should be “@nirajprasad13”
let fullname= prompt("enter your fullname without space");
console.log("@"+fullname+ fullname.length);