import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';

import { NgforComponent } from './ngfor/ngfor.component';
import { TwowaybindingComponent } from './twowaybinding/twowaybinding.component';
import { PropertybindingComponent } from './propertybinding/propertybinding.component';

import { CtopbindingComponent } from './ctopbinding/ctopbinding.component';
import { PipesComponent } from './pipes/pipes.component';
import { EmployeeComponent } from './employee/employee.component';
import {TitlePipe} from './title.pipe';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import {HttpClientModule} from '@angular/common/http';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,

    NgforComponent,

    TwowaybindingComponent,

    PropertybindingComponent,



    CtopbindingComponent,



    PipesComponent,



    EmployeeComponent,
    TitlePipe,
    EmployeeListComponent,
    UserComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
 
 }
