var express = require('express');
var app = express()

app.get('/',function(req,res) {
	res.send('Server has been set up');
})

app.post('/',function(req,res) {
	res.send('post request encountered');
})

app.put('/user',function(req,res) {
	res.send('put request encountered');
})

app.get('/user',function(req,res) {
	res.send('delete request encountered');
})

app.listen(3000,function(){
	console.log('Listening to port 3000');
})
