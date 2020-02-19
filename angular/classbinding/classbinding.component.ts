import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  template: `
  <h1 class="text-special">Welcome Guest</h1>
  <h1 [class]="classSuccess">Mark</h1>
  <h1[class.text-SUCCESS]="hasError">This is some heading</h1>
  <h1 [ngClass]="message">Sravani</h1>
  `,
  styles: [
    `
    .text-success {
      color:green;
    }
    .text-danger{
      color:red;
    }
    .text-umderline{
      text-decoration:underline;
    }
    .text-special{
      font-style:Italic;
    }
    `
  ]
})
export class ClassbindingComponent implements OnInit {
classSuccess="text-success"
hasLine=true
hasError=true

message={
  'text-success':this.hasError,
  'text-danger':this.hasError,
  'text-underline':this.hasError
}
  constructor() { }

  ngOnInit(): void {
  }

}
