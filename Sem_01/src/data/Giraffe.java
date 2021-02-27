package data;

public class Giraffe extends Animal {

	private int height;

	public Giraffe(String nume) {
		super(nume);
		this.height = 300;
	}



	public Giraffe(String nume, int height) {
		super(nume);
		this.height = height;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}



	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Girafa merge cu capul pe sus");
	}


}