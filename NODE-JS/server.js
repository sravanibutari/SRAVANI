const http=require('http');
http.createServer(function(req,res){
res.setHeader('200',{'content-type':'text/html'})
res.end("<h1>Sravani Butari</h1>")
}).listen(5000);
console.log("server is running at 5000");
