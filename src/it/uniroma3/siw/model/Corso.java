package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Corso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	private Docente docente;
	
	/*conviene cambiare la strategia di fetch in quanto è ragionevole pensare che si voglia accedere a tutti gli allievi di un corso*/
	
	@ManyToMany(mappedBy="listaCorsi", fetch = FetchType.EAGER)
	private List<Allievo> listaAllievi;
	

}
