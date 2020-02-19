import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
names=["a","b","c","d"]
employees=[];
constructor() { 
  this.employees=[
    {"empId":"1","empName":"p","age":21},
    {"empId":"2","empName":"q","age":22},
    {"empId":"3","empName":"r","age":23},
    {"empId":"4","empName":"s","age":24}
  ]
}
onButtonClicked(){
  this.employees=[
    {"empId":"1","empName":"p","age":21},
    {"empId":"2","empName":"q","age":22},
    {"empId":"3","empName":"r","age":23},
    {"empId":"4","empName":"s","age":24},
    {"empId":"5","empName":"t","age":25}
  ]
}
trackByEmpId(employee,Index)
{
  return employee.empId;
}
  ngOnInit(): void {
  }

}
