MyClass mcl = new MyClass();
String str = mcl.getClass().getName();
str == 'MyClass‘;

//----------------


public String toString() { return "Коробочка" +
width + "x" + height + "x" + depth; }

//----------------

class MyClass {    

int n;      

	public MyClass(int n){
		this.n = n;  
	}    

}


//--------------------

static String[] stringArray(){
	return new String[]{"asgf", "hjyy", "adgq"};
}
