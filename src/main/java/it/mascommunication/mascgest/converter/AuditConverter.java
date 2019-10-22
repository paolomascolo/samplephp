package it.mascommunication.mascgest.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.mascommunication.mascgest.dto.AuditDTO;
import it.mascommunication.mascgest.model.Audit;

@Component
public class AuditConverter extends AbstractConverter<Audit, AuditDTO> {

	@Autowired
	private UserConverter converter;

	@Override
	public Audit toEntity(AuditDTO auditDTO) {
		Audit audit = null;
		if(auditDTO != null) {
			audit = new Audit();
			audit.setId(auditDTO.getId());
			if(auditDTO.getUserDTO()!= null) {
				audit.setUser((converter.toEntity(auditDTO.getUserDTO())));
			}
			audit.setStatus(auditDTO.getStatus());
		}
		return audit;
	}

	@Override
	public AuditDTO toDTO(Audit audit) {
		AuditDTO auditDTO = null;
		if (audit != null) {
			auditDTO = new AuditDTO();
			auditDTO.setId(audit.getId());
			if (audit.getUser() != null) {
				auditDTO.setUserDTO((converter.toDTO(audit.getUser())));
			}
			auditDTO.setStatus(audit.getStatus());
		}
		return auditDTO;
	}
}
