package prototypeDesignPattern.prototype;

public abstract class Shape implements Cloneable{
	
	private String name;
	protected String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Shape() {
		// TODO Auto-generated constructor stub
		System.out.println("Shape class's constructor.");
	}
	@Override
	public Object clone(){
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public abstract void draw();
	

}
