package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();

		// converte a lista para SellerDTO(result.stream()), que converterá para uma
		// nova coleção(para
		// cada x da lista original, cria um novo objeto passando o x como argumento),
		// depois converte novamente para lista
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
