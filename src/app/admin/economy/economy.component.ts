import { Component, OnInit } from '@angular/core';
import { AbstractCrudComponent } from 'src/app/utils/abstractcomponent';
import { EconomyDTO } from 'src/dto/economydto';
import { EconomyService } from 'src/service/economy.service';
import { ServiziDTO } from 'src/dto/servizidto';
import { ServiziService } from 'src/service/servizi.service';
import { CompanyDTO } from 'src/dto/companydto';
import { CompanyService } from 'src/service/company.service';

@Component({
  selector: 'app-economy',
  templateUrl: './economy.component.html',
  styleUrls: ['./economy.component.css']
})
export class EconomyComponent implements OnInit {
  economy: EconomyDTO[];
  economytoinsert: EconomyDTO = new EconomyDTO();
  servizi: ServiziDTO[];
  company: CompanyDTO[];
  
  constructor(private service: EconomyService, private serviziS: ServiziService, private companyS: CompanyService) {
   }

  ngOnInit() {
    this.getAll();
    this.getServizi();
    this.getCompany();
     this.clear();
  }

  getAll(){
    this.service.getAll().subscribe(economy => this.economy = economy);
  }
   
  getServizi(){
    this.serviziS.getAll().subscribe(servizi => this.servizi = servizi);
  }

  getCompany(){
    this.companyS.getAll().subscribe(company => this.company = company);
  }

  clear(){
    this.economytoinsert = new EconomyDTO();
  }

 delete(economy: EconomyDTO){
   this.service.delete(economy.id).subscribe(() =>this.getAll());
 }

 update(economy: EconomyDTO){
  this.service.update(economy).subscribe(() =>this.getAll());
}
  insert(economy: EconomyDTO){
  this.service.insert(economy).subscribe(() =>this.getAll());
}
}
