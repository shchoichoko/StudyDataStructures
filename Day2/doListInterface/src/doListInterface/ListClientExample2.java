package doListInterface;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample2 {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListClientExample2() {
		list = new LinkedList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample2 lce = new ListClientExample2();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
}
