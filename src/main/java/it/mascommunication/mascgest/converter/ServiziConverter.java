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
			servizi = new Servizi(serviziDTO.getId(), serviziDTO.getName(), serviziDTO.getYear(), serviziDTO.getPrice(),
					serviziDTO.getServicetype());
		}
		return servizi;
	}

	@Override
	public ServiziDTO toDTO(Servizi servizi) {
		ServiziDTO serviziDTO = null;
		if(servizi != null) {
		serviziDTO =new ServiziDTO(servizi.getId(),servizi.getName(),servizi.getYear(),servizi.getPrice(),servizi.getServicetype());
	}
	return serviziDTO;
}

}