package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	private String nome;
	
	private String cognome;
	
	private LocalDate dataDiNascita;
	
	private String luogoDiNasciata;
	
	@Column(unique=true, nullable=false)
	private int partitaIva;
	
	@OneToMany(mappedBy="docente")
	private List<Corso> listaCorsa;

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

	public int getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(int partitaIva) {
		this.partitaIva = partitaIva;
	}
	
	
}
