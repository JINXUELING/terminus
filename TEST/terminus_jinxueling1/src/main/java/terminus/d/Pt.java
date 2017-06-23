package terminus.d;

public class Pt {
	private int a;
	private int b;
	private int c;
	
	public Pt(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public StringBuffer ptMarks(){
		StringBuffer pStr = new StringBuffer();
		boolean flagContain;
		boolean flagChange;
		int temp = 0;
		for(int i=1; i<=100; i++){
			flagContain = false;
			flagChange = false;
				
				temp = i;
				while((temp%10)!=0){
					if(a==temp%10){
						flagContain = true;
						break;
					}
					temp/=10;
				}
				
				if(flagContain){
					pStr.append("Fizz"+"\n");
					flagChange = true;
				}
				
				if(i%a==0&&!flagContain){
					pStr.append("Fizz"+"\n");
					flagChange = true;
				}
				
				if(i%b==0&&!flagContain){
					pStr.append("Buzz"+"\n");
					flagChange = true;
				}
				
				if(i%c==0&&!flagContain){
					pStr.append("Whizz"+"\n");
					flagChange = true;
				}
				
				if(!flagChange){
					pStr.append(i+"\n");
				}
			}
		
		return pStr;
	}

	public StringBuffer ptMarksContainzero() {
		StringBuffer pStr = new StringBuffer();
		boolean flagContain;
		boolean flagChange;
		
		int temp = 0;
		for(int i=1; i<=100; i++){
			flagContain = false;
			flagChange = false;
				
				if(a==0){
					if(String.valueOf(i).contains("0")){
						flagContain = true;
					}
				}else{
					temp = i;
					while((temp%10)!=0){
						if(a==temp%10){
							flagContain = true;
							break;
						}
						temp/=10;
					}
				}
				
				
				if(flagContain){
					pStr.append("Fizz"+"\n");
					flagChange = true;
				}
				
				if(a==0){
					
				}else if(!flagContain&&i%a==0){
					pStr.append("Fizz"+"\n");
					flagChange = true;
				}
				
				
				if(b==0){
					
				}else if(i%b==0&&!flagContain){
					pStr.append("Buzz"+"\n");
					flagChange = true;
				}
				
				if(c==0){
					
				}else if(i%c==0&&!flagContain){
					pStr.append("Whizz"+"\n");
					flagChange = true;
				}
				
				if(!flagChange){
					pStr.append(i+"\n");
				}
			}
		
		return pStr;
	}
}
