package hw;
/**
 * �� Ŭ������ Vector , ArrayList �⺻�Լ� ���� Ŭ�����̴�.
 * ������ txt���Ͽ� ����
 * ������ �ش� �Լ����� ������ �߰��ϰ� �����غ���
 * @author ����ö
 *	
 *	
 *
 */
import java.util.*;
public class Day16_02 {

	public Day16_02() {
//		v_add();
//		v_remove();
//		al_add();
//		al_add1();
//		al_alladd();
//		al_remove();
//		al_get_subList();
		
	}
	
	public void v_add() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		
		for(int i = 0 ; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

	public void v_remove() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		v.remove(1); // �ε��� �� ��ġ�� ��� ����� ä��
		
//		v.removeAllElements(); ������ ��� ��� �����ϰ��� �Ѵٸ�...
		for(int i = 0 ; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
	
	public void al_add() {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		for(int i  : arr) {
			System.out.println("�� : " + i);
		}
	}

	public void al_add1() {
	ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);		
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.add(1,10);   //�ε����� �����͸� ����
		
		for(int i  : arr) {
			System.out.println("�� : " + i);
		}
	}
	
	public void al_alladd() {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		arr2.add(10);
		arr2.add(30);
		arr2.add(20);
		
		arr.addAll(arr2);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public void al_remove() {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);		
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.remove(1);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public void al_get_subList() {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		List<Integer> list = arr.subList(1, 3);  // ������ �ε��� �ձ����� ��ȯ�Ѵ�
		
		for(int i : arr) {
			System.out.println("arr : " + i);
		}
		System.out.println("---------------------------------");
		
		for(int i : list) {
			System.out.println("subList �޼ҵ�� ������ list : "+i);  // �׷��� 2��(2,3)
		}
	}
	
	
	
	public static void main(String[] args) {
		new Day16_02();
	}

}
