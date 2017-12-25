package com.readbook.ok.dao;

import com.readbook.ok.mapping.Indexbook;

public interface IndexbookMapper {
	
    int deleteByPrimaryKey(Integer bookId);
    int insert(Indexbook record);
    int insertSelective(Indexbook record);
    Indexbook selectByPrimaryKey(Integer bookId);
    int updateByPrimaryKeySelective(Indexbook record);
    int updateByPrimaryKey(Indexbook record);
    
}
