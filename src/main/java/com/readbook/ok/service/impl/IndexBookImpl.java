package com.readbook.ok.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readbook.ok.dao.IndexbookMapper;
import com.readbook.ok.mapping.Indexbook;
import com.readbook.ok.service.IndexBookService;

@Service
@Transactional
public class IndexBookImpl implements IndexBookService{
	@Autowired
	private IndexbookMapper indexbookMapper;
	public void insertBook(Indexbook indexbook){
		indexbookMapper.insert(indexbook);
	}
}
