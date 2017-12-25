package com.readbook.ok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.readbook.ok.mapping.Indexbook;
import com.readbook.ok.service.IndexBookService;

@Controller
@RequestMapping("/readinfo")
public class ReadIndexController {
	@Autowired
	private IndexBookService indexBookService;
	 
    /**
     * insert data  
     * @param 
     * @return 
     */
    @RequestMapping(value ={"/okok", "/okok/"}, method = RequestMethod.GET)
    @ResponseBody
    public  void insertReadInfoOk() {
    	String[] link = { "80", "80","80","80","80","80"};
    	long rds =System.currentTimeMillis();
    	
    	Indexbook indexBook = new Indexbook();
    				  
    	indexBook.setUrlinput(link[0]);
    	indexBook.setInputtime(link[1]);
    	indexBook.setTpinput(link[2]);
    	indexBook.setIpinput(link[3]);
    	indexBook.setGetinput(link[4]);
    	indexBook.setPost(link[5]);
    					 
    	indexBookService.insertBook(indexBook);
    				      	
    	long rde = System.currentTimeMillis();
    	long intime = rds - rde;
    	System.out.println(intime);    	
    }
}
