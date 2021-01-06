/**
 * showPage2.js
 */

function showPage() {
	let doc = xhtp.responseXML;
	let data = doc.getElementsByTagName('record');
	console.log(data);
	let tableTag = document.createElement('table');
	tableTag.setAttribute('border', '1');
	tableTag.setAttribute('id', 'tbl'); //insert용 id값

	// title tr
	// data tr => [배열]
	let headerTr = titleRow(data);
	let dataTrs = contentRow(data);
	tableTag.appendChild(headerTr);
	for (let i = 0; i < dataTrs.length; i++) {
		tableTag.appendChild(addBtn(dataTrs[i], delFunc));
	}
	document.getElementById('show').appendChild(tableTag);
}

function FastdelFunc(){ //입력하자마자 지우는용
	
}

function delFunc(){
	console.log(this);//this 펑션을 불러오는 주체
	this.parentNode.parentNode.remove();
	let id = this.parentNode.parentNode.childNodes[0].childNodes[0].nodeValue;
	console.log(id);
	let req = new XMLHttpRequest();
	req.open('get', '../DeleteEmpServlet?empId='+id);
	req.send();
	req.onload = function(){
		console.log(req.responseText);
	}
}

function addBtn(tr, callBackFunc){
	// 추가 버튼 코드 + 이벤트 등록
	let butn = document.createElement('button');
	butn.onclick = callBackFunc;
	butn.innerHTML = '삭제';
	let tdTag = document.createElement('td');
	butn.setAttribute('style', 'padding:10px; text-align: center;');
	tdTag.appendChild(butn);
	tr.appendChild(tdTag);
	
	return tr;
}

function titleRow(result) {
	console.log(result[0].childNodes[0].nodeName);
	let trTag = document.createElement('tr');
	for (let i = 0; i < result[0].childNodes.length; i++) {
		let thTag = document.createElement('th');
		thTag.setAttribute('style', 'padding:10px; color:white; background-color: grey; text-align: center;');
		let textNode = document.createTextNode(result[0].childNodes[i].nodeName.toUpperCase());
		thTag.appendChild(textNode);
		trTag.appendChild(thTag);
	}
	return trTag;
}

function contentRow(result) {
	let trTags = [];
	for (let i = 0; i < result.length; i++) {
		let trTag = document.createElement('tr');
		trTag.onmouseover = function() {
			trTag.style.backgroundColor = 'yellow';
		};
		trTag.onmouseout = function() {
			trTag.style.backgroundColor = 'white';
		};
		for (let j = 0; j < result[i].childNodes.length; j++) {
			let tdTag = document.createElement('td');
			tdTag.setAttribute('style', 'padding:10px; text-align: center;');
			let textNode = document.createTextNode(result[i].childNodes[j].childNodes[0].nodeValue);
			tdTag.appendChild(textNode);
			trTag.appendChild(tdTag);
		}
		trTags.push(trTag);
	}
	return trTags;
}


