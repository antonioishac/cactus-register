package br.com.cactusdigital.erp.register.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * @author aishac
 * 
 * Classe Java que representa a tabela TB_PESSOA na sua integridade.
 *
 */
@Alias("Pessoa")
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = -5080237644025875734L;
	
	private Long codigo;
	private String nome;
	private String tipoPessoa;
	private String email;
	private String site;
	private String cliente;
	private String fornecedor;
	private String colaborador;
	private String transportadora;
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the tipoPessoa
	 */
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	/**
	 * @param tipoPessoa the tipoPessoa to set
	 */
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}
	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the fornecedor
	 */
	public String getFornecedor() {
		return fornecedor;
	}
	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	/**
	 * @return the colaborador
	 */
	public String getColaborador() {
		return colaborador;
	}
	/**
	 * @param colaborador the colaborador to set
	 */
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	/**
	 * @return the transportadora
	 */
	public String getTransportadora() {
		return transportadora;
	}
	/**
	 * @param transportadora the transportadora to set
	 */
	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", email=" + email
				+ ", site=" + site + ", cliente=" + cliente + ", fornecedor=" + fornecedor + ", colaborador="
				+ colaborador + ", transportadora=" + transportadora + "]";
	}	
}
