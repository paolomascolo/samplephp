import { Component, OnInit } from '@angular/core';
import { CompanyDTO } from 'src/dto/companydto';
import { CompanyService } from 'src/service/company.service';
import { ServiziService } from 'src/service/servizi.service';
import { ServiziDTO } from 'src/dto/servizidto';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {

  company: CompanyDTO[];
  companytoinsert: CompanyDTO = new CompanyDTO();
  
  constructor(private service: CompanyService) 
  {
   }

   ngOnInit() {
    this.getAll();
    this.clear();
  }
  getAll(){
    this.service.getAll().subscribe(company => this.company = company);
  }

 delete(company: CompanyDTO){
   this.service.delete(company.idc).subscribe(() => this.getAll());
 }

  update(company: CompanyDTO){
   this.service.update(company).subscribe(() =>this.getAll());
 }
 insert(company: CompanyDTO){
   this.service.insert(company).subscribe(() =>this.getAll());
 }
  clear(){
    this.companytoinsert = new CompanyDTO();
  }
}
