package com.example.backend.service;

import java.util.List;
import java.util.Map;

import com.example.backend.dto.MenuDto;

public interface MenuService {
	
	// 깊이별 메뉴리스트 조회
	List<MenuDto> getChildMenuListByDepth(MenuDto dto);
	
	// 깊이별 메뉴리스트 카운트
	int getCountMenuListByDepth(MenuDto dto);
	
	// 메뉴 리스트 조회
	List<MenuDto> getMenuList();
	
	// 하위 메뉴 조회
	List<MenuDto> getSubMenuList(int menuSequence);
	
	// 상위메뉴 depth 조회
	Integer getParentDepth(String menuParent);
	
	void insertMenu(Map <String, String> map);

}
