import { Component, OnInit, Output ,EventEmitter} from '@angular/core';


@Component({
  selector: 'app-ctopbinding',
  templateUrl: './ctopbinding.component.html',
  styles: [``]
})
export class CtopbindingComponent implements OnInit {

  constructor() { }
@Output()
public childEvent=new EventEmitter()
onButtonClicked(){
  this.childEvent.emit("data from child");
}
  ngOnInit(): void {
  }

}
