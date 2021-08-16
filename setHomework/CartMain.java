package com.collection.set.cart;

import java.util.*;

public class CartMain {

    /**
     * - 클래스명 com.collection.set.cart.Cart.java
     - 필드 : - String name;
     - int count;
     - 클래스명 com.collection.set.cart.CartMain.java
     - 필드 : Set<Cart> carts;
     * 1. 회수제한 없이 사용자 입력값을 받아 장바구니에 기록
     - 단, 중복된 값이 있는 경우. "이미 등록된 상품입니다." 출력.

     2. 장바구니 검색 : 사용자 입력한 값이 장바구니에 있는지 조회
     - name필드가 동일하면 같은 Cart객체로 취급하도록, equals/hashCode override할것.
     - 조회한 상품이 있으면, 상품명 - n개가 담겨있습니다.
     - 조회한 상품이 없으면, 조회한 상품은 장바구니에 없습니다.

     3. 장바구니 전체조회 : 상품명 가나다순으로 출력
     출력 :
     1. 계란 - 30개
     2. 바나나 - 3개
     3. 와인 - 1개
     4. 하리보 - 5개
     ------------------
     총 4개의 상품이 담겨 있습니다.
     * @param args
     */
    Set<Cart> carts = new LinkedHashSet<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CartMain main = new CartMain();

        main.add();
        main.orderByCart();
        main.search();
    }

    public void add() {
        abc:
        while(true) {
            System.out.println("상품명을 입력하세요.");
            String name = sc.nextLine();

            System.out.println("수량을 입력하세요.");
            int count = Integer.parseInt(sc.nextLine());

            for (Cart cart : carts) {
                if (cart.getName().equals(name)) {
                    System.out.println("등록되어있는 상품입니다.");

                    continue abc;
                }
            }
            carts.add(new Cart(name, count));

            System.out.println("종료하시겠습니까?(y/n)");

            if (sc.nextLine().equals("y")) {
                break;
            }

            System.out.println("카트에 담았습니다.");
            System.out.println(carts);
        }
    }
    /**2. 장바구니 검색 : 사용자 입력한 값이 장바구니에 있는지 조회
     - name필드가 동일하면 같은 Cart객체로 취급하도록, equals/hashCode override할것.
     - 조회한 상품이 있으면, 상품명 - n개가 담겨있습니다.
     - 조회한 상품이 없으면, 조회한 상품은 장바구니에 없습니다.
     */
    public void search() {
        System.out.println("검색할 상품명을 입력하새요.");
        String name = sc.nextLine();

        Iterator<Cart> iterator = carts.iterator();

        while (iterator.hasNext()) {
            Cart cart = iterator.next();

            if (name.equals(cart.getName())) {
                System.out.println(cart.getName() + "의 개수 : " + cart.getCount());
                return;
            }
        }

        System.out.println("조회한 상품은 존재하지 않습니다.");
    }
    /**
     * 3. 장바구니 전체조회 : 상품명 가나다순으로 출력
     출력 :
     1. 계란 - 30개
     2. 바나나 - 3개
     3. 와인 - 1개
     4. 하리보 - 5개
     ------------------
     총 4개의 상품이 담겨 있습니다.
     */
    public void orderByCart() {
//        List<Cart> list = new ArrayList<>(carts);

//        list.sort(null);
        Set<Cart> treeSet = new TreeSet<>(carts);

        int count = 1;

        System.out.println("----------------------------");
        for (Cart cart : treeSet) {
            System.out.println(count++ + "." + cart.getName() +  " - " + cart.getCount());
        }

        System.out.println("----------------------------");
        System.out.println("총 " + (count - 1) + "개의 상품이 담겨있습니다.");
        System.out.println("----------------------------");
    }
    
}