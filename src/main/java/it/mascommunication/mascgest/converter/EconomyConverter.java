package it.mascommunication.mascgest.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.mascommunication.mascgest.dto.EconomyDTO;
import it.mascommunication.mascgest.model.Economy;

@Component
public class EconomyConverter extends AbstractConverter<Economy,EconomyDTO> {
	@Autowired
	private ServiziConverter converter;
	@Autowired
	private CompanyConverter comp;
	
	@Override
	public Economy toEntity(EconomyDTO economyDTO) {
		Economy economy = null;
		if(economyDTO != null) {
			economy = new Economy();
			economy.setId(economyDTO.getId());

			economy.setPrice(economyDTO.getPrice());
			economy.setIva(economyDTO.getIva());
			economy.setAccount(economyDTO.getAccount());
			economy.setTotal(economyDTO.getTotal());
			economy.setNotIva(economyDTO.getNotIva());
			if(economyDTO.getServizi()!= null) {
				economy.setServizi(converter.toEntity(economyDTO.getServizi()));
			}
			if(economyDTO.getIdc()!= null) {
				economy.setIdc((comp.toEntity(economyDTO.getIdc())));
			}
			
		}
		return economy;
	}

	@Override
	public EconomyDTO toDTO(Economy economy) {
		// TODO Auto-generated method stub
		EconomyDTO economyDTO = null;
		if(economy != null) {
			economyDTO = new EconomyDTO();
			economyDTO.setId(economy.getId());
			economyDTO.setPrice(economy.getPrice());
			economyDTO.setIva(economy.getIva());
			economyDTO.setAccount(economy.getAccount());
			economyDTO.setTotal(economy.getTotal());
			economyDTO.setNotIva(economy.getNotIva());
			if(economy.getServizi()!= null) {
				economyDTO.setServizi((converter.toDTO(economy.getServizi())));
			}
			if(economy.getIdc()!= null) {
				economyDTO.setIdc((comp.toDTO(economy.getIdc())));
			}
			
		}
		
		return economyDTO;
	}
}
