import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { IPost } from './posts.model';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PostsService {
  private _url="http://jsonplaceholder.typicode.com/posts"
  constructor(private http:HttpClient) { }
  getPosts():Observable<IPost[]>{
  return this.http.get<IPost[]>(this._url)
  } 
}
