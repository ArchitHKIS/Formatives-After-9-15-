
public class Sound {
	private int[] samples = {0,0,0,5000, 2020, 3000, -5000, 2, 4, 5,5000}; 
	public int limitAmplitude(int limit) {
		int numChanges=0;
		for(int i = 0; i < samples.length; i++){
			if(samples[i] > limit){
				samples[i] = limit;
				numChanges++;
			}else if(samples[i] < -limit){
				samples[i] = -limit;
				numChanges++;
			} 
			//numChanges++;
		}
		return numChanges;
	}
	 public void trimSilenceFromBeginning(){
		 int n = 0;
		 while(samples[n] == 0) n++;
			 int[] newSamples = new int[samples.length - n];
			 for(int i =0; i < newSamples.length; i++) newSamples[i] = samples[i+n];
			 samples = newSamples;
		 }
		 
	 }	
