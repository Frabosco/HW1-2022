package it.uniroma3.siw.model;

import javax.persistence.*;

@Entity
public class Società {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String ragioneSociale;
	
	private String via;
	
	private int numeroCivico;
	
	@Column(nullable=false)
	private String comune;
	
	private int CAP;
	
	@Column(nullable=false)
	private String pronvincia;
	
	private String telefono;
	
	@ManyToOne
	private Allievo dipendente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getCAP() {
		return CAP;
	}

	public void setCAP(int cAP) {
		CAP = cAP;
	}

	public String getPronvincia() {
		return pronvincia;
	}

	public void setPronvincia(String pronvincia) {
		this.pronvincia = pronvincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
