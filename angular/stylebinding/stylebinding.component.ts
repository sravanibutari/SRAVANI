import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-stylebinding',
  template: `
  <h1 style="color:red">Sravani Butari</h1>
  <h1 [style.color]="'orange'">Ben</h1>
  <h1 [style.color]="hasError ? 'red':'green'">Gwen</h1>
  <h1 [style.background]="markcolor">tenison</h1>
  <h1 [ngStyle]="special">Text</h1>
  `,
  styles: [
    `
    `
  ]
})
export class StylebindingComponent implements OnInit {
hasError=false
markcolor="yellow"
special={
  color:'red',
  fontStyle:'italic',
  fontSize:'32px'
}
  constructor() { }

  ngOnInit(): void {
  }

}
