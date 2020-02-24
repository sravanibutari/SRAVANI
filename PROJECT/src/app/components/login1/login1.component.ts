import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,FormBuilder,Validators} from '@angular/forms'
@Component({
  selector: 'app-login1',
  templateUrl: './login1.component.html',
  styleUrls: ['./login1.component.css']
})
export class Login1Component implements OnInit {
   
  //userForm=new FormGroup({
    //name:new FormControl(),
  //email:new FormControl(),
  //address:new FormGroup({
   // house:new FormControl(),
    //city:new FormControl(),
    //country:new FormControl()
  //})
//})
localData(){
  this.userForm.patchValue({
    name:'sravani',
    email:'abc@gmail.com'
   
    //address:{
//house:'h1',
//city:'c1',
//country:'India'
  //  }
  })
}
  constructor(private fb:FormBuilder) { }
userForm=this.fb.group({
  name:[null,[Validators.required,Validators.minLength(3),Validators.maxLength(10)]],
email:[null,Validators.required]
//address:this.fb.group({
//house:['h1'],
//city:['c2'],
//country:['avv']
//})
})
  ngOnInit(): void {
  }

  onSubmit(data){
    console.log(data)
  }
}
