package kr.kh.semi.service;

import kr.kh.semi.dao.ProductDAO;

public interface ProductService {

	ProductDAO read(String productId);

}
