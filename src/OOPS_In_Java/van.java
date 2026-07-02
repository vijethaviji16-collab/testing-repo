package OOPS_In_Java;

public class van {

	// TODO Auto-generated method stub
	
	private String make;
	private String model;
	private int year;
	
	van(String make, String model, int year){
		
		this.setmake(make);
		this.setmodel(model);
		this.setyear(year);
	}
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	 public void setmake(String make) {
		 
		this.make = make;
		
	 }
	 
	 public void setmodel (String model) {
		 this.model = model;
	 }
	 
	 public void setyear (int year) {
		 this.year =  year;
	 }
		 
	}


