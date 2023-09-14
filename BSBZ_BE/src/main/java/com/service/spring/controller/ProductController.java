package com.service.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.spring.domain.Product;
import com.service.spring.service.ProductService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:9999" }, allowCredentials = "true")
@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/allproducts")
	public ResponseEntity<String> showAllProducts(@RequestParam("orderType") String orderType) {

		try {
			System.out.println("모든 상품 정렬 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("orderType (마감(남은 로얄 수), 조회수, ''(빈공간 최신순 정렬 / 디폴트 정렬)) :: " + orderType);
			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			List<Product> productList = productService.showAllProducts(orderType);
			System.out.println("정렬 로직 진입 후");
			System.out.println("productList :: " + productList);

			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정렬, 조회 실패 오류...");
			return ResponseEntity.badRequest().body("정렬 조회 실패...");
		}
	}

	@GetMapping("/arts")
	public ResponseEntity<String> showAllArts(@RequestParam("orderType") String orderType) {

		try {
			System.out.println("미술품 정렬 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("orderType (마감순(남은 로얄 수), 조회순, 최신순 , ''(빈공간 최신순 정렬 / 디폴트 정렬)) :: " + orderType);
			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			List<Product> productList = productService.showAllArts(orderType);
			System.out.println("정렬 로직 진입 후");
			System.out.println("productList :: " + productList);

			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정렬, 조회 실패 오류...");
			return ResponseEntity.badRequest().body("정렬 조회 실패...");
		}
	}

	@GetMapping("/luxuries")
	public ResponseEntity<String> showAllLuxuries(@RequestParam("orderType") String orderType) {

		try {
			System.out.println("럭셔리 정렬 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("orderType (마감순(남은 로얄 수), 조회순, 최신순 , ''(빈공간 최신순 정렬 / 디폴트 정렬)) :: " + orderType);
			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			List<Product> productList = productService.showAllLuxuries(orderType);
			System.out.println("정렬 로직 진입 후");
			System.out.println("productList :: " + productList);

			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정렬, 조회 실패 오류...");
			return ResponseEntity.badRequest().body("정렬 조회 실패...");
		}
	}

	@GetMapping("/realestate")
	public ResponseEntity<String> showAllRealEstate(@RequestParam("orderType") String orderType) {

		try {
			System.out.println("부동산 정렬 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("orderType (마감순(남은 로얄 수), 조회순, 최신순 , ''(빈공간 최신순 정렬 / 디폴트 정렬)) :: " + orderType);
			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			List<Product> productList = productService.showAllRealEstate(orderType);
			System.out.println("정렬 로직 진입 후");
			System.out.println("productList :: " + productList);

			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정렬, 조회 실패 오류...");
			return ResponseEntity.badRequest().body("정렬 조회 실패...");
		}
	}

	@GetMapping("/musiccopyright")
	public ResponseEntity<String> showAllMusicCopyright(@RequestParam("orderType") String orderType) {

		try {
			System.out.println("음악 정렬 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("orderType (마감순(남은 로얄 수), 조회순, 최신순 , ''(빈공간 최신순 정렬 / 디폴트 정렬)) :: " + orderType);
			// 로직 진입 전
			System.out.println("정렬 로직 진입 전");
			List<Product> productList = productService.showAllMusicCopyright(orderType);
			System.out.println("정렬 로직 진입 후");
			System.out.println("productList :: " + productList);

			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정렬, 조회 실패 오류...");
			return ResponseEntity.badRequest().body("정렬 조회 실패...");
		}
	}

	@GetMapping("/detail")
	public ResponseEntity<String> showDetail(@RequestParam("productId") int productId) {

		try {
			System.out.println("상품 상세정보 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("productId :: " + productId);

			// 리엑트에서는 productId int 값 하나만 넘겨줘서 객체 생성 후 상세정보 로직에 접근해야함
			Product product = new Product();
			product.setProductId(productId);
			System.out.println("객체 생성 후 파라미터 주입 완료 id = " + product.getProductId());

			// 로직 진입 전
			System.out.println("상세정보 로직 진입 전");
			Product selectedProduct = productService.showDetail(product);
			System.out.println("상세정보 로직 진입 후");
			System.out.println("selectedProduct :: " + selectedProduct);

			// 리엑트로 응답하기
			return new ResponseEntity(selectedProduct, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("상세정보 조회 실패 오류...");
			return ResponseEntity.badRequest().body("상세정보 조회 실패...");
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateProductInfo(@RequestBody Product product) {

		try {
			
			productService.updateProductInfo(product);

			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("정보 수정 실패 오류...");
			return ResponseEntity.badRequest().body("정보 수정 실패...");
		}
	}	
	@GetMapping("/search")
	public ResponseEntity<String> searchProduct(@RequestParam("word") String word, @RequestParam("orderType") String orderType) {

		try {
			System.out.println("상품 상세정보 컨트롤러 진입 성공");
			// 파라미터 잘 받았는지 확인
			System.out.println("word :: " + word);
			System.out.println("orderType :: " + orderType);

			// 로직 진입 전
			
			List<Product> productList = productService.searchProduct(word, orderType);
			System.out.println(productList);
			// 리엑트로 응답하기
			return new ResponseEntity(productList, HttpStatus.OK);
		} catch (Exception e) {
			// 실패 시 응답 (예: BadRequest)
			System.out.println("상세정보 조회 실패 오류...");
			return ResponseEntity.badRequest().body("상세정보 조회 실패...");
		}
	}

}