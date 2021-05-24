import { Component, OnInit } from '@angular/core';

import { User }  from '../models/user.model';
import { UserService } from '../services/user.service';

import { Subscription } from 'rxjs'; // ERROR import 

import {Router} from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  
  public users = [];
  groupSubscription: Subscription;
  public mobile = false;

  constructor(private router: Router, private formBuilder: FormBuilder, private userService: UserService) { }


  ngOnInit(): void {
    this.userService.getAllUsers()
    .subscribe(
        data => this.users = data
    );
    if (window.screen.width <= 390) { // 768px portrait
      this.mobile = true;
    }
    console.log("test")
  }
}
