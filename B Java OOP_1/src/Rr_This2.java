//this with Getters and Setters
class Rr_This2 {
	String name;
	//setter method
	void setname(String n) {
		this.name=n;
	}
	//getter method
	String getname() {
		return this.name;
	}

	public static void main(String[] args) {
		Rr_This2 obj=new Rr_This2();
		obj.setname("This with getters and setters");
		System.out.println("obj name: "+obj.getname());

	}

}
