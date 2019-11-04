import { ServiziDTO } from './servizidto';
import { CompanyDTO } from './companydto';

export class EconomyDTO {

    id: number;

    price: number;
    
	iva: number;
	
	account: number;
	
	total: number;
	
	notIva: number;
	
	servizi: ServiziDTO;

	idc: CompanyDTO;
}