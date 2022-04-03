package com.agos.agw.dao;

import java.util.ArrayList;

import com.agos.agw.model.CardVO;

public interface ICardDAO {
	public ArrayList<CardVO> getCardList();		// 카드 목록 가져오기
	public int checkCardIndex(String index); 	// 카드 계정 중복 체크
	public void insertCard(CardVO cardVO);		// 카드 계정 추가
}
