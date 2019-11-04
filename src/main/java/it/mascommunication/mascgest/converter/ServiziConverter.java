package it.mascommunication.mascgest.converter;

import org.springframework.stereotype.Component;

import it.mascommunication.mascgest.dto.ServiziDTO;
import it.mascommunication.mascgest.model.Servizi;

@Component
public class ServiziConverter extends AbstractConverter<Servizi, ServiziDTO> {
	
	@Override
	public Servizi toEntity(ServiziDTO serviziDTO) {
		Servizi servizi = null;
		if (serviziDTO != null) {
			servizi = new Servizi();
			servizi.setId(serviziDTO.getId());
			servizi.setName(serviziDTO.getName());
			servizi.setYear(serviziDTO.getYear());
			servizi.setPrice(serviziDTO.getPrice());
			servizi.setServicetype(serviziDTO.getServicetype());
			
		}
		return servizi;
	}

	@Override
	public ServiziDTO toDTO(Servizi servizi) {
		ServiziDTO serviziDTO = null;
		if (servizi != null) {
			serviziDTO = new ServiziDTO();
			serviziDTO.setId(servizi.getId());
			serviziDTO.setName(servizi.getName());
			serviziDTO.setYear(servizi.getYear());
			serviziDTO.setPrice(servizi.getPrice());
			serviziDTO.setServicetype(servizi.getServicetype());
			
			
		}
		return serviziDTO;

	}
}