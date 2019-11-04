import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { HttpClient } from '@angular/common/http';
import { EconomyDTO } from 'src/dto/economydto';

@Injectable({
  providedIn: 'root'
})
export class EconomyService extends AbstractService<EconomyDTO> {

  constructor(http: HttpClient) { 
    super(http);
    this.type = "economy";
  }
}
