var myImageimg = document.querySelector("img");

myImageimg.onclick = function () {
    let mysrc = myImageimg.getAttribute("src");
    if (mysrc === "https://cdn3.emoji.gg/emojis/yee.png") {
        myImageimg.setAttribute("src", "https://i.52112.com/icon/jpg/256/20160801/2657/139668.jpg");
    } else {
    myImageimg.setAttribute("src", "https://cdn3.emoji.gg/emojis/yee.png");
    }
};
var myButton = document.querySelector("button");
var myHeading = document.querySelector("h1");
function setUserName() {
    let myName = prompt("please enter your name");
    if (!myName || myName === null) {
        setUserName();
    } else {
    
    localStorage.setItem("name", myName);
    myHeading.innerHTML = "flos&" + myName;
    }
  }
  if (!localStorage.getItem("name")) {
    setUserName();
  } else {
    let storedName = localStorage.getItem("name");
    myHeading.innerHTML = "weeeee, " + storedName;
  }
  myButton.onclick = function (){
    setUserName();
  };
