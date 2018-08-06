package hw1;

public class PigLatin {
	public static void main(String[] args){
		int i;
		for(i = 0; i < args.length-1; i++){
			String first=args[i].substring(0,1);
			String check=first.toLowerCase();
			int leng=args[i].length();
			if(check.equals("a")||check.equals("e")||check.equals("i")||check.equals("o")||check.equals("u"))
				System.out.print(first.toUpperCase()+args[i].substring(1,leng)+"ay ");
			else System.out.print(args[i].substring(1,2).toUpperCase()+args[i].substring(2,leng)+first+"ay ");
		
		}
		if(i==args.length-1){
			String first=args[i].substring(0,1);
			String check=first.toLowerCase();
			int leng=args[i].length();
			if(check.equals("a")||check.equals("e")||check.equals("i")||check.equals("o")||check.equals("u"))
				System.out.print(first.toUpperCase()+args[i].substring(1,leng)+"ay");
			else System.out.print(args[i].substring(1,2).toUpperCase()+args[i].substring(2,leng)+first+"ay");
		}
	}

}