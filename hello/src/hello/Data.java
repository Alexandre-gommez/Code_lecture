package hello;

public class Data {
	float temp;
	int h,min,s;
	
	public Data(String[] str)
	{
		temp=Float.parseFloat(str[0])/1000;
		System.out.println(str[1]);
		h=(Character.getNumericValue(str[1].charAt(11)))*10+Character.getNumericValue(str[1].charAt(12));
		min=(Character.getNumericValue(str[1].charAt(14)))*10+Character.getNumericValue(str[1].charAt(15));
		s=(Character.getNumericValue(str[1].charAt(17)))*10+Character.getNumericValue(str[1].charAt(18));
	}

}
