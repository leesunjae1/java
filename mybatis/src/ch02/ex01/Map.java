package ch02.ex01;

import java.util.List;

import ch02.domain.User;

public interface Map {
	List<User> selectUsers(); //나의 요구사항만 간략하게 적는다
}
// user가 없을때 리턴되는 타입은 리스트이다