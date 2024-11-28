var http =require('http');
http.createServer(function(request,response){
    response.writeHead(200,{'Content-Type':'text/plain'});
    response.end('halo\n');
}).listen(8000);
console.log('127.0.0.1:8000');