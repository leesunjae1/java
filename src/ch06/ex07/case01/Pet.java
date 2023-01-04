package ch06.ex07.case01;

public sealed class Pet permits Dog, Cat{ 
	//permits은 펫중에 독과 캣만 가능하다
}
