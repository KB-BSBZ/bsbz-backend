package com.service.spring.dao;

import java.util.List;
import java.util.Map;

import com.service.spring.domain.ExternalAccount;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;

public interface UserDAO {

	// 회원가입
	void register(User user) throws Exception;

	// 로그인
	User login(User user) throws Exception;

	// 아이디 중복 확인
	String idExist(String id) throws Exception;

	// 계좌 등록(계좌 수정 ... )
	void addExternalAccount(User user, String exAccount);

	// 계좌 삭제
	void deleteExternalAccount(User user, String exAccount);
	
	// 외부 계좌 조회
	List<ExternalAccount> selectExternalAccount(User user) throws Exception;

	// 회원 정보 수정 ... 비밀번호, 번호, 계좌 수정XXXX
	void updateUserInfo(User user);
	
	//회원 정보 조회 ...
	User userInfo(User user);

	// 구매 이력
	List<TradeLog> userTradeLog(User user);

	// 보유 자산 현황
	List<TradeLog> ownProducts(User user);

	// 보유한 상품 총 자산
	int totalRoyals(User user);

	// 예상되는 배당금 보여주기
	int showBonus(User user);

	// 자산 보유 순위 ... 구매 횟수로 백분율 나눠서 ...
	int userRanking(User user);
	
	// 회원 탈퇴
	void deleteUser(User user) throws Exception;
	
	// 일별 로얄수
	List<TradeLog> totalRoyalsDaily(User user)throws Exception;
}
