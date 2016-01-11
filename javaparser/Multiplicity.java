package javaparser;

/** 
 * 
 * <p>This class checks for the multiplicity of 2 classes</p>
 * <p>Class contains 4 attributes - <b>ClassA, ClassB, relation of A with B, relation of B with A</b></p>
 * <p>e.g.: [A] *-1 [B]
 * "A" : ClassA,
 * "B" : ClassB,
 * "*" : relationOfBwithA, 
 * "1" : relationOfAwithB</p>
 * @author Vedang Jadhav
 */
public class Multiplicity 
{
	private String classA, classB, relationOfAwithB,relationOfBwithA;
	public Multiplicity(String classA, String classB,String relationOfAwithB, String relationOfBwithA)
	{
		this.classA = classA;
		this.classB = new String(classB);
		this.relationOfAwithB = relationOfAwithB;
		this.relationOfBwithA = relationOfBwithA;
	}
	
	public void setClassA(String classA)
	{
		this.classA = classA;
	}
	
	public void setClassB(String classB)
	{
		this.classB = classB;
	}

	public void setRelationOfBwithA(String relationOfBwithA)
	{
		this.relationOfBwithA = relationOfBwithA;
	}
	
	public String getRelationOfBwithA()
	{
		return relationOfBwithA;
	}
	
	public String getClassA()
	{
		return classA;
	}
	
	public String getClassB()
	{
		return classB;
	}
	
	public void setRelationOfAwithB(String relationOfAwithB)
	{
		this.relationOfAwithB = relationOfAwithB;
	}
	
	public String getRelationOfAwithB()
	{
		return relationOfAwithB;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(!(obj instanceof Multiplicity))
			return false;
		if(obj == this)
			return true;
		Multiplicity m = (Multiplicity)obj;
		if((m.getClassA().equals(this.getClassA()) && m.getClassB().equals(this.getClassB()))
				||(m.getClassB().equals(this.getClassA()) && m.getClassA().equals(this.getClassB())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return (classA.getClass().getName()+classB.getClass().getName()).hashCode();
	}
}
