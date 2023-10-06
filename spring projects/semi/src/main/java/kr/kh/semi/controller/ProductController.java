package kr.kh.semi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kh.semi.dao.ProductDAO;
import kr.kh.semi.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/show/{productId}", method = RequestMethod.GET)
	public String showProductInfo(@PathVariable("productId") String productId, Model model) {
		
		ProductDAO dto = productService.read(productId);
		model.addAttribute("productInfo", dto);
		return "product/show";
		
	}

}
