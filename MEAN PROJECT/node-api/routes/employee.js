const express=require('express');
const router=express.Router();
const Employee=require('../models/employee')

router.get("/",async(req,res)=>{
const employees=await Employee.find();
try{
    res.status(200).json({
        error:false,
        data:employees
    })
}catch(err){
res.status(400).json({
    error:true,
    message:err.message
})
}
})
router.get("/:id",async(req,res)=>{
    const employee = await Employee.findById(req.params.id)

    if(!employee){
      res.status(404).json({
          error: true,
          message : "employee id does not exist"
      })
    }
  })



router.post('/',async(req,res)=>{
    let emp=req.body;
    console.log(emp);
    let doc=await Employee.create(emp)
    try {
        res.status(201).json({
            error:false,
            data:doc
        })
        }catch(err){
res.status(400).json({
    error:false,
    message:err.message
})
    }
});
    /*res.status(200).json({
        error:false,
        message:'create new employees'
  
});*/
router.put('/',async(req,res)=>{
    const Employee=await Employee.findByIdAndUpdate(req.params.id,req.body,{
        new:true,
        runValidators:true
    })
if(!employee){
    res.status(404).json({
        error:true,
        message:"employee data does not exist"
    })
}
try{
    res.status(200).json({
        error:false,
        data:employee
    });
}catch(err){
    res.status(400).json({
        error:true,
        message:err.message

})
}
})
router.delete('/',async(req,res)=>{
    const Employee=await Employee.findByIdAndDelete(req.params.id,req.body,{
        new:true,
        runValidators:true
    })
if(!employee){
    res.status(404).json({
        error:true,
        message:"employee data does not exist"
    })
}
try{
    res.status(200).json({
        error:false,
  message:"employee deleted successfully"
    });
}catch(err){
    res.status(400).json({
        error:true,
        message:err.message

})
}
})
    module.exports=router;
