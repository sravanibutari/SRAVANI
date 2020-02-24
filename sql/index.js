const express=required('express');
const mysql=required('mysql')
const con=mysql.createConnection({
    'host':'localhost',
    'username':'root',
    'password':'welcome'
})
con.connect(function(err){
    if(err) {
        console.log(err.message)
    }else{
        console.log('successfully connected with sql')
    }
    
})
const app=express();
app.get('/',(req,res)=>{
    res.send("app is running")
})
const post=3000;
app.listen(port,(req,res)=>{
    console.log('servlet running on port:{$port}')
})