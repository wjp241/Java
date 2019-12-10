package day3;


//1. ForLab2 ÀÌ¶ó´Â Å¬·¡½º¸¦ ¸¸µç´Ù.
//2. ´ÙÀ½°ú °°Àº °á°ú°¡ Ãâ·ÂµÇµµ·Ï ±¸ÇöÇÑ´Ù.
//
//    9 : È¦¼ö
//    8 : Â¦¼ö
//    7 : È¦¼ö
//    6 : Â¦¼ö
//    5 : È¦¼ö
//    4 : Â¦¼ö
public class ForLab2 {
	public static void main(String[] args) {
		for(int i = 9; i >= 4; i--) {
//			if(i%2==0) {
//				System.out.println(i + " : Â¦¼ö");
//			} else {
//				System.out.println(i + " : È¦¼ö");
//			}
		 System.out.println(i + (i % 2 == 0 ? " : Â¦¼ö" : " : È¦¼ö"));
		}
	
	}
}
