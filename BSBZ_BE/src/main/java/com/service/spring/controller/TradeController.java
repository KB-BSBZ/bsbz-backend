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

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:9999" }, allowCredentials = "true")
@RestController
public class TradeController {

	@Autowired
	private TradeLogService tradeLogService;

	@PostMapping("/trade")
	public ResponseEntity<String> trade(@RequestBody TradeLog tradeLog) {
		try {
			User user = new User(tradeLog.getUserId());
			Product product = new Product(tradeLog.getProductId());
			tradeLogService.trade(user, product, tradeLog.getTradeRoyalCnt());
			System.out.println(tradeLog + "거래 성공");
			
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("거래 실패...");
			return ResponseEntity.badRequest().body("거래 실패");
		}

	}

}