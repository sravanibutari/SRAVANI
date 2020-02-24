import {NgModule} from '@angular/core';
import {RouterModule,Routes} from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { HomeComponent } from './components/home/home.component';
import { CartComponent } from './components/cart/cart.component';
import { ProductsComponent } from './components/products/products.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { Login1Component } from './components/login1/login1.component';


const routes:Routes=[
    {path:'login',component:LoginComponent},
    {path:'register',component:RegisterComponent},
    {path:'home',component:HomeComponent},
    {path:'cart',component:CartComponent},
    {path:'products/:id',component:ProductsComponent},
    {path:'**',component:PageNotFoundComponent},
    {path:'login1',component:Login1Component}
]
@NgModule({
imports:[RouterModule.forRoot(routes)],
exports:[RouterModule]
})
export class AppRoutingModule{

}