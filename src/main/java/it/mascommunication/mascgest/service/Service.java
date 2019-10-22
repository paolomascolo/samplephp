package it.mascommunication.mascgest.service;

public interface Service<DTO> {
	
	public Iterable<DTO> getAll();
	
	public DTO read(long id);
	
	public DTO insert (DTO dto);
	
	public DTO update (DTO dto);
	
	public void delete (long id);

}
