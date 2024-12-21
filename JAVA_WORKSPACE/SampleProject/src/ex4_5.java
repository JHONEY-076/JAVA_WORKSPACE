
public class ex4_5 {

	private String title;
	private String singer;
	private String year;
	private String lang;
	
	
	public ex4_5(String title, String singer, String year, String lang) {
		this.title=title;
		this.singer=singer;
		this.year=year;
		this.lang=lang;
	}
	
	
	
	
	public void show() {
		System.out.println(year+" "+lang+ "의 "+ singer+"가 "+"부른 "+title);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex4_5 Song=new ex4_5("가로수 그늘 아래 서면","이문세","1988","한국");
		
		Song.show();
		
	}

}
