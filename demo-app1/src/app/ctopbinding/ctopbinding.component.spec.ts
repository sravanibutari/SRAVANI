import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CtopbindingComponent } from './ctopbinding.component';

describe('CtopbindingComponent', () => {
  let component: CtopbindingComponent;
  let fixture: ComponentFixture<CtopbindingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CtopbindingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CtopbindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
