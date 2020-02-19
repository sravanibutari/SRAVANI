 export class Employee
{
    constructor(
    public firstName:String,
    public lastName:String,
    public salary:Number,
    public gender:String,
    public email:String
    ){

    }
getFullName()
{
    console.log(this.firstName+""+this.lastName)
    
}
}
let emp=new Employee("Sravani","Butari",40000,"female","abc@gmail.com");
emp.getFullName();