package Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class bookStyle {
	private Integer id;
	private String[] books;
	private List<String> address;
	private Map<String,Double> Price;
	private Set<String> phone;
	public bookStyle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bookStyle(String[] books, List<String> address, Map<String, Double> price, Set<String> phone) {
		super();
		this.books = books;
		this.address = address;
		Price = price;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, Double> getPrice() {
		return Price;
	}
	public void setPrice(Map<String, Double> price) {
		Price = price;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	
	public String show()
	{
		String sum="";
		for(int i=0;i<books.length;i++)
		{
			sum=sum+books[i];
		}
		return sum+"\n"+getAddress()+"\n"+getPrice()+"\n"+
		getPhone();
	}
	
	
	

}