package br.com.cactusdigital.erp.register.repository;

import org.apache.ibatis.annotations.Mapper;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;

@Mapper
public interface PessoaRepository {
	
	Long save(Pessoa pessoa);
	
	PessoaDTO findPessoaById(Long codigoPessoa);
	
	//List<Pessoa> findAllPessoas();
	
	

}
