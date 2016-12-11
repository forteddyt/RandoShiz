var c = document.getElementById('myCanvas');
var ctx = c.getContext("2d");


function draw(){
	console.log('Drawing...');

	ctx.rect(20,20,150,150);
	ctx.stroke();

	document.body.style.backgroundColor = '#42f462';
}

draw();
console.log('No crash')