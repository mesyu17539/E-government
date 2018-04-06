var app=app || {};

app={init : x=>{
		var head = document.createElement('head');
		var body = document.createElement('body');
		document.documentElement.appendChild(head);
		document.documentElement.appendChild(body);
		$('<div id="wrapper"></div>').appendTo('body');
		$('<div id="container" class="container"></div>').appendTo('#wrapper');
		if(x.result=="true"){
			alert('보기:/exist');
			$('#container').load(x.context+'/exist');
		} else {
			$('#container').load(x.context+'/not-exist');
		}
	},
};