import { Component, OnInit } from '@angular/core';

import { PostsService } from '../posts.service';
import {IPost} from '../posts.model';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
public posts:IPost[]=[];
  constructor(private postsservice:PostsService) { }

  ngOnInit(): void {
    this.postsservice.getPosts().subscribe(
      data=>this.posts=data
        );
  }

}
