package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Allievo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String cognome;
	
	private LocalDate dataDiNascita;
	
	private String luogoDiNasciata;
	
	@Column(unique=true, nullable=false)
	private int matricola;
	
	/*conviene cambiare la strategia di fetch in quanto è ragionevole pensare che si voglia accedere a tutti gli i corsi di un allievo*/
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Corso> listaCorsi;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNasciata() {
		return luogoDiNasciata;
	}

	public void setLuogoDiNasciata(String luogoDiNasciata) {
		this.luogoDiNasciata = luogoDiNasciata;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String eMail;
	
	

}
