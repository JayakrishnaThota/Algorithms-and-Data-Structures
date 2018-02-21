package misc;

public class movespaces {
	public static String move(String s){
		int index = 0;
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(ch[i]==' ') continue;
				swap(ch,i,index);
				index++;
		}
		return String.valueOf(ch);
	}

	public static void swap(char[] a, int i, int j){
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args){
		String s = "Hi move these spaces to the begining";
		System.out.println(move(s));
	}
}
