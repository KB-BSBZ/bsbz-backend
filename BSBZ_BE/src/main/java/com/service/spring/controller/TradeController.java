package com.service.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;
import com.service.spring.service.TradeLogService;
import com.service.spring.service.impl.ProductServiceImpl;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:9999" }, allowCredentials = "true")
@RestController
public class TradeController {

	@Autowired
	private TradeLogService tradeLogService;
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@PostMapping("/trade")
	public ResponseEntity<String> trade(@RequestBody TradeLog tradeLog) {
		try {
			System.out.println("거래 컨트롤러 진입");
			User user = new User();
			user.setUserId(tradeLog.getUserId());
			Product product = new Product();
			product.setProductId(tradeLog.getProductId());
			int success = 1;
			Product product2 = productServiceImpl.showDetail(product);
			System.out.println("priduct2 가져오기 성공 ::" + product2);
			if(product2.getLeftRoyal() >= tradeLog.getTradeRoyalCnt()) {
				System.out.println("남은 로얄 수 ::" + product2.getLeftRoyal());
				System.out.println("거래 할 로얄 수 ::" + tradeLog.getTradeRoyalCnt());
				tradeLogService.trade(user, product, tradeLog.getTradeRoyalCnt());
				System.out.println(tradeLog + "거래 성공");
				
				return new ResponseEntity(success, HttpStatus.OK);
			}else {
				System.out.println("거래 실패 else");
				return ResponseEntity.badRequest().body("거래 실패 else");
			}
			

		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("거래 실패...");
			return ResponseEntity.badRequest().body("거래 실패...");
		}

	}

}