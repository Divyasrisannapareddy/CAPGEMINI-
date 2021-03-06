package Assignments;
public class Material {
	public int mass ;
	public int temperature ;
	public Material(int mass, int temperature){
		this.mass=mass;	
		this.temperature=temperature;
	}
	public String checkMaterial() throws Exception{
		if(this.mass<0){
			throw new MaterialException("Mass cannot be negative");
		}
		else if(this.mass==0){
			throw new MaterialException("Mass cannot be zero");
		}
		else{
			return "Valid material";
		}
	}
	public String flowOfHeat() throws Exception{
		try{
			checkMaterial();
		}
		catch(MaterialException e1){
			return "Invalid Material";
		}
		catch(Exception e2){
			return "Other exception";
		}
		return "Both in equilibrium";
				
	}
}
*package Assignments;
public class MaterialException extends Exception {

	public MaterialException(String msg){
		super(msg);
	}
		
}
*package Assignments;
public class Main {
      public static void main(String[] args) throws Exception {
		Material m=new Material(12,32); 
		String s=m.flowOfHeat(); 
		System.out.println(s);
	}
}
