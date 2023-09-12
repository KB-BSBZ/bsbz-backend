package com.service.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.spring.domain.User;
import com.service.spring.service.UserService;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:9999"}, allowCredentials = "true")
@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity<String> signUp(@RequestBody User user, HttpServletRequest request) {
	    // signupRequest를 이용하여 회원가입 처리를 수행합니다.
	    // 필요한 비즈니스 로직을 추가하세요.
		
		HttpSession session = request.getSession();
		try {
			System.out.println(user);
			userService.login(user);
		    // 성공적인 응답을 보낼 경우
			if(userService.login(user)!=null) {
				User selected = userService.userInfo(user); 
				session.setAttribute("loginUser", selected);
				System.out.println(selected.getUserName() + "로그인 성공...");
				System.out.println(selected);
				return new ResponseEntity(selected, HttpStatus.OK);
			}
			else {
				System.out.println("회원 정보 틀림... 아이디 비번 확인...");
				return ResponseEntity.ok("로그인 실패");
			}
				
		    
		} catch (Exception e) {
		    // 실패 시 응답 (예: BadRequest)
			System.out.println("로그인 실패...");
			return ResponseEntity.badRequest().body("로그인 실패");
		}

	  }
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
	    // signupRequest를 이용하여 회원가입 처리를 수행합니다.
	    // 필요한 비즈니스 로직을 추가하세요.
		try {
			System.out.println("중복검사로직 진입 전");
			// 중복 검사후 존재한다면 (userId !=  null) 회원 가입이 되면 안된다
			// userId = null 일경우만 회원가입 성공
			String userId = userService.idExist(user.getUserId());
			System.out.println("중복검사로직 진입 후... userId 값::" + userId);
			System.out.println("userId값 확인 if 진입");
			if(userId != null) {
				userService.register(user);
				System.out.println("회원가입 성공");
				return ResponseEntity.ok("회원가입 성공...로그인 화면으로 이동...");
			}else {
				System.out.println("이미 존재하는 회원입니다... 아이디 중복...");
				return ResponseEntity.ok("회원가입 실패...아이디 중복...다시 회원가입 폼으로...");
			}
		} catch (Exception e) {
		    // 실패 시 응답 (예: BadRequest)
			System.out.println("회원가입 실패...");
			return ResponseEntity.badRequest().body("회원가입 실패");
		}

	  }

	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestBody User user, HttpServletRequest request) {
		
		try {
			// 로그아웃을 하기 위해 세션 가져오기
			System.out.println("세션가져오는중...");
			HttpSession session = request.getSession();
			System.out.println("세션 가져오기 성공...");
			// 로그아웃 하기
			session.invalidate();
			System.out.println("로그아웃 성공...");
			return ResponseEntity.ok("로그아웃 성공");
		    
		} catch (Exception e) {
		    // 실패 시 응답 (예: BadRequest)
			System.out.println("로그아웃 실패...");
			return ResponseEntity.badRequest().body("로그아웃 실패");
		}
	  }
	
}
