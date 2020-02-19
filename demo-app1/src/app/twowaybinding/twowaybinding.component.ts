import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twowaybinding',
  template: `
  
  <input type="text" #myInput />
  <button (click)="onButtonClick(myInput.value)">Button</button>

<p>Two Way Binding
  <h1>{{name}}</h1>
  <input type="text" [(ngModel)]="name" />
  
  `,
  styles: [``]
})
export class TwowaybindingComponent implements OnInit {
name="sravani"
  onButtonClick(value){
  console.log(value);
}
  constructor() { }

  ngOnInit(): void {
  }

}
