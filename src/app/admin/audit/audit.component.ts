import { Component, OnInit } from '@angular/core';
import { AuditDTO } from 'src/dto/auditdto';
import { AuditService } from 'src/service/audit.service';
import { AbstractCrudComponent } from 'src/app/utils/abstractcomponent';

@Component({
  selector: 'app-audit',
  templateUrl: './audit.component.html',
  styleUrls: ['./audit.component.css']
})
export class AuditComponent extends AbstractCrudComponent<AuditDTO> implements OnInit {

  audit: AuditDTO[];
  audittoinsert: AuditDTO = new AuditDTO();
  constructor(service: AuditService) { 
    super(service);
  }
  ngOnInit() {
    this.getAll();
    this.clear();
  }
  getAll(){
    this.service.getAll().subscribe(audit => this.audit = audit);
  }

  clear(){
    this.audittoinsert = new AuditDTO();
  }
}
