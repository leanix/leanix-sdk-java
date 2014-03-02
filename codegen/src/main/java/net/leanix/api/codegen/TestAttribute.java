package net.leanix.api.codegen;

public class TestAttribute
{
	protected String name;
	protected Object value;
	protected Object update;
	
	public TestAttribute(String name, Object value)
	{
		this.name = name;
		this.value = value;
	}
	
	public TestAttribute(String name, Object value, Object update)
	{
		this.name = name;
		this.value = value;
		this.update = update;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	protected String transformValue(Object value)
	{
		boolean escape = false;
		if (value.getClass().equals(String.class))
			escape = true;
		
		if (escape)
			return "\"" + value + "\"";
		else
			return value.toString();
	}
	
	public String getValue()
	{
		return this.transformValue(this.value);
	}
	
	public String getUpdate()
	{
		return this.transformValue(this.update);
	}
}
