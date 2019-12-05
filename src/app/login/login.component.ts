import { Component, OnInit } from '@angular/core';
import { LoginDTO } from 'src/dto/logindto';
import { UserDTO } from 'src/dto/userdto';
import { NgForm } from '@angular/forms';
import { UserService } from 'src/service/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginDTO: LoginDTO;
  user: UserDTO ;
  userinsert2: UserDTO;

  constructor(private service: UserService, private router: Router) { }

  ngOnInit() {
  }
  
  insert(f: NgForm): void {
    this.user.usertype=1;
    this.loginDTO = new LoginDTO(f.value.username, f.value.password);
    this.user.username= f.value.username;
    this.user.password=f.value.password;
    if(this.user.password == f.value.password2){
    this.service.insert(this.user).subscribe();
    this.loginDTO = new LoginDTO(this.user.username, this.user.password);
    this.service.login(this.loginDTO).subscribe((user)=> {localStorage.setItem('currentUser',JSON.stringify(user))
    this.router.navigate(['/useraflog']);})
    console.log(this.userinsert2)
    }}

  login(f: NgForm): void {
    this.loginDTO = new LoginDTO(f.value.username, f.value.password);

    this.service.login(this.loginDTO).subscribe((user) => {

      if (user != null) {
        localStorage.setItem('currentUser', JSON.stringify(user));

        switch (user.usertype.toString()) {
          case 'ADMIN': {
            this.router.navigate(['/admin-dashboard']);
            break;
          }
          case 'USER': {
            this.router.navigate(['/user-dashboard']);
            break;
          }
          default:
            this.router.navigate(['/login']);
        }
      }
    });
  }
}

