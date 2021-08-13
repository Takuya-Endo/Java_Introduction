package exercise_11;

public abstract class TangibleAsset implements Asset, Thing {
	
	double weight;
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
