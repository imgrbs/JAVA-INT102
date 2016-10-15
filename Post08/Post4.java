import java.text.DecimalFormat;
class Post4{
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("000.00");
		String keep="";
		//random
		int count,rand,rand1=0,rand2=0,rand3=0;
		for(count=0; count<3; count++)
		{
			rand=(int)(Math.random()*10);
			keep+=rand;
			if(count==0)
				rand1=rand;
			if(count==1)
				rand2=rand;
			if(count==2)
				rand3=rand;
		}
		while(rand1==rand2||rand1==rand3||rand2==rand3||rand2==rand1||rand3==rand1||rand3==rand2)
		{
				rand1=(int)(Math.random()*10);
				rand2=(int)(Math.random()*10);
				rand3=(int)(Math.random()*10);
		}
		System.out.println("Random Num is : "+rand1+rand2+rand3);
		//sorting
		int max,mid,min;
		if(rand1>rand2){
			if(rand1>rand3){
				max=rand1;
				if(rand2>rand3){
					mid=rand2;
					min=rand3;
				}
				else {
					mid=rand3;
					min=rand2;
				}
			}
			else{
				mid=rand1;
				if(rand2>rand3){
					max=rand2;
					min=rand3;
				}
				else{
					max=rand3;
					min=rand2;
				}
			}
		}
		else 
			if(rand2>rand3){
				max=rand2;
				if(rand1>rand3){
					mid=rand1;
					min=rand3;
				}
				else {
					mid=rand3;
					min=rand1;
				}
		}
		else {
			max=rand3;
			mid=rand2;
			min=rand1;
		}
		System.out.println("Sort Num : "+min+mid+max);
		//format
		min*=100;
		mid*=10;
		System.out.println(df.format(min+mid+max));
	}
}