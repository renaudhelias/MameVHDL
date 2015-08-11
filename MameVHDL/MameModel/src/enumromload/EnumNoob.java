package enumromload;

import java.util.StringTokenizer;

public class EnumNoob {
	public static void main(String [] params) {
		for (int i=0;i<=0xff;i++) {
			System.out.printf("ROM_BIOS%02X(EnumROMMask.ROM_BIOSFLAGSMASK, 0x%02x000000,  ROM_BIOS00),\n",i,i);
		}
		
		StringTokenizer st = new StringTokenizer("[some][thing][like][that]","][");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
