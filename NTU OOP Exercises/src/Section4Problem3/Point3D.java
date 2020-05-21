package Section4Problem3;

public class Point3D extends Point2D {

	private float z;
	
	Point3D() {
		super(0, 0);
		z = 0;
	}
	
	Point3D(float rX, float rY, float rZ) {
		super(rX, rY); 
		z = rZ; 
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float rZ) {
		this.z = rZ; 
	}
	
	/** I cannot access to private variables, so I use getter to retrieve those variables.  */
	public float[] getXYZ() {
		float xyz[] = {super.getX(), super.getY(), z};
		return xyz;
	}

	/** I cannot access to private variables, so I use setter to set those variables.  */
	public void setXYZ(float rX, float rY, float rZ) {
		super.setX(rX);
		super.setX(rY);
		this.z = rZ; 
	}
	
}
