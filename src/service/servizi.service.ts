import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { ServiziDTO } from 'src/dto/servizidto';
import { HttpClient } from '@angular/common/http';
 
@Injectable({
  providedIn: 'root'
})
export class ServiziService extends AbstractService<ServiziDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'servizi';
   }
}
