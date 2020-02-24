const express=require('express');
const morgan=require('morgan');
const mongoose=require('mongoose');
const cors=require('cors');
mongoose.connect('mongodb://localhost:27017/employeeDB',
{
    useNewUrlParser:true,
    useUnifiedTopology:true
},
    (err)=>{
    if(err){
        console.log('mongodb not connected')
    }else{
        console.log('mongodb connected')
    }
});
const employeeRoutes=require('./routes/employee');
const app=express();


app.get('',(req,res)=>{
    res.status(200).json({
        error:false,
        message:'get all employess' + id
    });
});
app.use(cors());
app.use(express.json());
app.use(morgan('dev'));
app.use('/api/v1/employee',employeeRoutes);

const PORT=process.env.PORT || 5000
app.listen(PORT,()=>{
    console.log(`server is running at PORT:${PORT}`)
});