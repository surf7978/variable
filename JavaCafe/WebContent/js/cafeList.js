$(function() {

	//showContents(); //스크립트가 html 헤드에 선언되있으니까 바디에 출력되게 하려면 여기 안에 넣어야 출력가능

	$.ajax({
		url: '../GetProdList',
		dataType: 'json',
		success: showContents,
		error: showErrors
	});
})

function showErrors(result) {
	console.log(result);
}


function showContents(result) {
	let data = result;
	console.log(data);

	for (val of data) {
		//console.log(val.item_no, val.item, val.price);

		//let db_value = 'datavalue'; //이걸 db에있는 데이터로 가져올 예정(오류 제거용 임시변수)

		let elem_1, elem_2, elem_3;

		//첫번째 자식 요소
		elem_1 = $('<a />').attr('href', 'item.jsp?itemNo='+val.item_no);
		let e1_img = $('<img />').attr('src', "../images/"+val.image).attr('alt', val.alt);
		e1_img.addClass("card-img-top");
		$(elem_1).append($(e1_img));

		//두번째 자식 요소
		elem_2 = $('<div />').addClass("card-body");
		let e2_h4 = $('<h4 />').addClass("card-title");
		e2_h4.append($('<a />').attr('href', 'item.jsp?itemNo='+val.item_no).html(val.item));
		let krw_price = new Intl.NumberFormat('ko-KR', {style : 'currency', currency: 'KRW'}).format(val.price);
		let e2_h5 = $('<h5 />').html(krw_price);
		let e2_p = $('<p />').addClass("card-text").html(val.content);
		elem_2.append(e2_h4, e2_h5, e2_p);

		//세번째 자식 요소
		elem_3 = $('<div />').addClass("card-footer");
		let star = '';
		for(let i=0; i<val.like_it; i++){
			star += '&#9733';
		}
		for(let j=0; j<5-val.like_it; j++){
			star += '&#9734';
		}
		let e3_small = $('<small />').addClass("text-muted").html(star);
		elem_3.append(e3_small);

		let div_1, div_2;
		div_1 = $('<div />').addClass("col-lg-4 col-md-6 mb-4");
		div_2 = $('<div />').addClass("card h-100");

		div_1.append(div_2);
		div_2.append(elem_1, elem_2, elem_3);

		$('.col-lg-9 .row').append(div_1);
	}
}