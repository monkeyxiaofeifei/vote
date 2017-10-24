package com.solr.jd.controller;

import com.solr.jd.model.ResultModel;
import com.solr.jd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;

	@RequestMapping("/list")
	public String queryProduct(String queryString, String catalog_name, String price,
			String sort, Integer page, Model model) {
		//执行查询
		ResultModel resultModel = null;
		try {
			resultModel = service.queryProduct(queryString, catalog_name, price, sort, page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//把查询结果传递到页面
		model.addAttribute("result", resultModel);
		//参数回显
		model.addAttribute("queryString", queryString);
		model.addAttribute("catalog_name", catalog_name);
		model.addAttribute("price", price);
		model.addAttribute("sort", sort);
		model.addAttribute("page", page);
		//返回jsp的名称
		///WEB-INF/jsp/ + product_list + .jsp
		return "product_list";
	}

	@RequestMapping("/query")
	public String query(){
		return "product_list";
	}
}
