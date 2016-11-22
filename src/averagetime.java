
public class averagetime {
	public static void main(String[] args){
	    String timeInHHmmss = "00:34:00 00:54:00";
	    String[] split = timeInHHmmss.split(" ");
	    long hh = 0,mm = 0,ss = 0;
	    for (int i = 0; i < split.length; i++)
	    {
	        String[] split1 = split[i].split(":");            
	        hh += Long.valueOf(split1[0].trim());
	        mm += Long.valueOf(split1[1].trim()); 
	        ss += Long.valueOf(split1[2].trim());
	    }
	    hh = hh / split.length ;
	    mm = mm / split.length ;
	    ss = ss / split.length ;
	    String hms = String.format("%02d:%02d:%02d", hh,mm,ss);       
	    System.out.println(hms);
}
}