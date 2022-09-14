package mypkg;

public class Product {
	private int pid;
	private String productname;
	
	public Product(int pid, String productname) {
		super();
		this.pid = pid;
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productname=" + productname + "]";
	}
	public int getpid() {
		return pid;
	}
	public void setpid(int pid) {
		this.pid=pid;
	}
	public String getproductname() {
		return productname;
		
	}
	public void setProductname(String productname) {
		this.productname=productname;
	}
}
