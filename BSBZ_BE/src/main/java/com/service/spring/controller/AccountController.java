package com.service.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.spring.domain.BBAccount;
import com.service.spring.domain.Product;
import com.service.spring.domain.User;
import com.service.spring.service.BBAccountService;
import com.service.spring.service.ProductService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:9999" }, allowCredentials = "true")
@RequestMapping("/account")
@RestController
public class AccountController {

	@Autowired
	private BBAccountService bbAccountService;

	// 모든 매핑 하는 부분 파라미터 중괄호로 감싼거 고쳐야함
	@PutMapping("/deposit/{amt}")
	public ResponseEntity<String> deposit(@RequestBody User user, int amt) {

		try {
			System.out.println("출금 컨트롤러 진입 성공");

			// 파라미터 잘 받았는지 확인
			System.out.println("amt :: " + amt);

			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			bbAccountService.deposit(user, amt);
			System.out.println("정렬 로직 진입 후");

			// 리엑트로 응답하기
			System.out.println("입금 성공");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("입금 실패 오류...");
			return ResponseEntity.badRequest().body("입금 실패...");
		}

	}

	@PutMapping("/withdraw/{amt}")
	public ResponseEntity<String> withdraw(@RequestBody User user, int amt) {

		try {
			System.out.println("출금 컨트롤러 진입 성공");

			// 파라미터 잘 받았는지 확인
			System.out.println("amt :: " + amt);

			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			bbAccountService.withdraw(user, amt);
			System.out.println("정렬 로직 진입 후");

			// 리엑트로 응답하기
			System.out.println("출금 성공");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("출금 실패 오류...");
			return ResponseEntity.badRequest().body("출금 실패...");
		}

	}

}
