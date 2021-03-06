package com.collection.set.cart;
/**
 * - 클래스명 com.collection.set.cart.Cart.java
   - 필드 : - String name;
		   - int count;
 * @author beom
 *
 */
public class Cart implements Comparable<Cart> {

	private String name;
	private int count;
	
	public Cart(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	public Cart() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Cart [name=" + name + ", count=" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (count != other.count)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cart o) {
		return this.name.compareTo(o.name);
	}

}
