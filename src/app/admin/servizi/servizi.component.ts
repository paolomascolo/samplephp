import { Component, OnInit } from '@angular/core';
import { ServiziDTO } from 'src/dto/servizidto';
import { ServiziService } from 'src/service/servizi.service';
import { AbstractCrudComponent } from 'src/app/utils/abstractcomponent';

@Component({
  selector: 'app-servizi',
  templateUrl: './servizi.component.html',
  styleUrls: ['./servizi.component.css']
})
export class ServiziComponent extends AbstractCrudComponent<ServiziDTO> implements OnInit {

  servizi: ServiziDTO[];
  servizitoinsert: ServiziDTO = new ServiziDTO();
 
   constructor(service: ServiziService) { 
     super(service);
   }
 
   ngOnInit() {
     this.clear();
     this.getAll();
   }
 
   getAll(){
     this.service.getAll().subscribe(servizi => this.servizi = servizi);
   }
    
   clear(){
     this.servizitoinsert = new ServiziDTO();
   }

   close() {
    this.selected = null;
  }
  
  }

 