import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-propertybinding',
  templateUrl: './propertybinding.component.html',
  styleUrls: ['./propertybinding.component.css']
})
export class PropertybindingComponent implements OnInit {

  constructor() { }

  @Input()
public parentData;


  ngOnInit(): void {
  }

}
