package br.com.cactusdigital.erp.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cactusdigital.erp.register.domain.Pessoa;
import br.com.cactusdigital.erp.register.repository.PessoaRepository;
import br.com.cactusdigital.erp.register.service.dto.PessoaDTO;
import br.com.cactusdigital.erp.register.service.mapper.PessoaMapper;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaMapper pessoaMapper;
	
	public PessoaDTO save(PessoaDTO pessoaDTO) {
		
		Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);
		Long pessoaSalva = pessoaRepository.save(pessoa);
		PessoaDTO insert = pessoaRepository.findPessoaById(pessoa.getCodigo());
		return insert;
	}

}
