function getInfo(){
	let request = new XMLHttpRequest();
	request.open("GET","http://localhost:9001/allRecipe");
	request.setRequestHeader("content-type", "application/JSON");
	let responseString;
	request.onload=function(){
		renderData(JSON.parse(request.response));
	}
	request.send();
}

function renderData(jsData){
	let list=document.getElementById("recipelist");
	list.innerHTML="";
	for(let recipe of jsData){
		let Listitem=document.createElement("li");
		list.innerText=recipe;
		list.appendChild(Listitem);

	}
}


function postData(form){
		let body={};
	for(let inputty of form){
		if(inputty.name){
		body[inputty.name]=inputty.value;
		}
	}
	let string1 = JSON.stringify(body);
	let request = new XMLHttpRequest();
	request.open("POST","http://localhost:9001/addRecipe");
	request.setRequestHeader("content-type", "application/JSON");
	request.onload=function(){
		getInfo();
	}
	request.send(string1); 
}