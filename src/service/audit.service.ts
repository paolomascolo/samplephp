import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { AuditDTO } from 'src/dto/auditdto';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuditService extends AbstractService<AuditDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = "audit";
   }
}
