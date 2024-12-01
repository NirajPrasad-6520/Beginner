// Qs. Create a H2 heading element with text - “Hello JavaScript”.Append “from Apna College students” to this text using JS.
let h2=document.querySelector("h2");
console.dir(h2.innerText);

h2.innerText=h2.innerText +" from apna college students";

// Qs. Create 3 divs with common class name - “box”.Access them & add some unique text to each of them.
let divs=document.querySelectorAll(".box");

let idx=1;
for(div of divs){
  div.innerText=`Box ${idx}`;
  idx++;
}
// divs[0].innerText= "box1";
// divs[1].innerText= "box2";
// divs[2].innerText= "box3";

//Qs. Create a new button element. Give it a text “click me”,background color of red & text color of white.
//Insert the button as the first element inside the body tag.

let newbtn=document.createElement("button");
newbtn.innerText="Click Me";
newbtn.style.backgroundColor= "red";
newbtn.style.color="white";
document.querySelector("body").prepend(newbtn);

//Qs. Create a <p> tag in html, give it a class & some styling.Now create a new class in CSS and try to append this class to the <p> element.Solve this problem using classList.Did you notice, how you overwrite the class name when you add a new one?
let par=document.querySelector("p");