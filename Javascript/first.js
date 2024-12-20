//1.Create a const object called "product" to store  information.
     // const product ={
     // title : "ball pen",
     // rating : 4,
     // is_deal_of_the_day : true,
     // price : 270,
//}
    //  console.log(product);
     // console.log(typeof product["rating"]);

//2.Create a const object called "profile" to store information shown in the picture.
     // const profile = {
     // username : "shardhakhapra",
     // isfollow : false,
     // posts : 195,
     // followers : 569,
     // following : 4,
     // name : "Shardha khapra",
     // email : "@shadhakapra",
//};
     // console.log(typeof profile["isfollow"]);

//operators.
    // let a = 5;
    // let b= 2;

    // console.log("a =",a, "b =",b);
    // console.log("a + b =", a+b);
    // console.log("a - b =", a-b);
    // console.log("a * b =", a*b); 
    // console.log("a / b =", a/b);
    // console.log("a % b =", a % b);
    // console.log("a ** b =", a**b);

//unary operator.
    // console.log("a =",a, "b =",b);
    // a++;
    // console.log("a =",a);

    // a--;
    // console.log("a =",a);

    // console.log("a++ =", a++);
    // console.log("a =",a);

    // console.log("++a =", ++a);

    // console.log("a-- =", a--);
    // console.log("a =", a);

    // console.log("--a =", --a);

// Conditional Statements.
    //    let age =5;
    //    if(age >= 18)
    //     {
    //    console.log("you can Vote because you are 18+ age");
    //     }
    //    else
    //    console.log(" You cannot Vote because your age is 18 below");

//Odd and Even.
    //    let num = prompt("enter a  number");
    //    if(num %  2 ===  0)
    // {
    //    console.log(num,"is Even");
    // }
    //    else
    //    {
    //     console.log(num,"is Odd");
    //    }

//Ternary Operators.
    // let age=55;
    // let results=age >=18 ? "Adult" : "Not Adult";   
    // console.log(results)

//3.Get user to input a number using prompt("Enter a number.").Check if the number is a multiple of 5 or not.
    let a=prompt("Enter a number");
    if(a % 5 === 0)
    {
        console.log(a,"is multiple of 5");
    }
    else
    {
        console.log(a,"is not multiple of 5");
    }

//Qs2. Write a code which can give grades to students according to their scores:
// 80-100, A
// 70-89,  B
// 60-69,  C
// 50-59,  D
// 0-49,   F
    // grade on marksheet.
    let marks = prompt("enter the marks");
    if(marks >=80 && marks <= 100)
    {
        console.log("Grades is A");
    }
    else if(marks >=70 && marks <= 79)
    {
        
        console.log("Grades is B");
    }
    else if(marks >=60 && marks<= 69)
    {
        console.log("Grade is C");
    }
    else if(marks >=50 && marks <=59)
    {
        console.log("Grade is D");
    }
    else if(marks >=40 && marks <=49)
    {
        console.log("Grade is E");
    }

    else if(marks < 40)
    {
    console.log("Fail");
    }