package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Tiffin;
import com.example.model.TiffinAddresses;
import com.example.model.TiffinType;
import com.example.repository.LunchBoxRepository;
import com.example.repository.TiffinAddressesRepository;
import com.example.repository.TiffinTypeRepository;

@Service
public class TiffinServices {

	@Autowired
	LunchBoxRepository lunchBoxRepository;

	@Autowired
	TiffinAddressesRepository tiffinAddressesRepository;

	@Autowired
	TiffinTypeRepository tiffinTypeRepository;

	public Tiffin getTiffinDetails(int id) {
		return lunchBoxRepository.getOne(id);
	}

	public List<String> getTiffinAddresses() {
		List<TiffinAddresses> addList = tiffinAddressesRepository.findAll();
		List<String> list = new ArrayList<String>();
		addList.forEach((e) -> {
			list.add(e.getAddress());
		});
		return list;
	}

	public List<String> getTiffinTypes() {
		List<TiffinType> addList = tiffinTypeRepository.findAll();
		List<String> list = new ArrayList<String>();
		addList.forEach((e) -> {
			list.add(e.getType());
		});
		return list;
	}

	public Tiffin save(Tiffin tiffin) {
		return lunchBoxRepository.save(tiffin);
	}
}
