function call()
{
var vs=document.getElementById("para").value;
if(vs==""){
document.getElementById("message").style.color="yellow";
document.getElementById("message").innerHTML="plz fill it";
}
else{
document.getElementById("message").style.color="#00FF00";
document.getElementById("message").innerHTML="valid";}
}


function call2()
{
var a=document.getElementById("para3").value;
var b=(/^[a-zA-Z]{2,20}$/);

if(b.test(a))
{
document.getElementById("message3").style.color="#00FF00";
document.getElementById("message3").innerHTML="valid";
}
else{
document.getElementById("message3").style.color="red";
document.getElementById("message3").innerHTML="invalid";}
}
function sub(){
if(document.myForm.firstname.value == "")
{
alert("Please provide your name!");
document.myForm.firstname.focus();
return false;
}
if(document.myForm.lastname.value == "")
{
alert("Please provide your last name!");
document.myForm.lastname.focus();
return false;
}
if(document.myForm.phonenumber.value == "")
{
alert("Please provide your phone number!");
document.myForm.phonenumber.focus();
return false;
}
if(document.myForm.email.value == "")
{
alert("Please provide your email!");
document.myForm.email.focus();
return false;
}
if(document.myForm.password.value == "")
{
alert("Please set password!");
document.myForm.password.focus();
return false;
}

alert("form submitted");

return (true);

}



function number(){
	var vs=document.getElementById("para2").value;
	var ch=(/^\d{3}-\d{3}-\d{4}$/);
	if(vs==""){
	document.getElementById("message2").style.color="yellow";
document.getElementById("message2").innerHTML="plz fill it";
}else{
	if(ch.test(vs)){
	    document.getElementById("message2").style.color="#00FF00";
		document.getElementById("message2").innerHTML="valid";
	}
	else{
	    document.getElementById("message2").style.color="red";
		document.getElementById("message2").innerHTML="invalid";
	}}
}