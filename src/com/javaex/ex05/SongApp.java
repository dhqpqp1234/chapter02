package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
	
	Song iu = new Song();
	
	iu.setArtist("아이유");
	iu.setTitle("좋은날");
	iu.setAlbum("Real");
	iu.setYear(2010);
	iu.setTrack("3번 track");
	iu.setComposer("이민수 작곡");
	
	iu.showinfo();
	
	Song bigBang = new Song();
	
	bigBang.setArtist("BIGBANG");
	bigBang.setTitle("거짓말");
	bigBang.setAlbum("Always");
	bigBang.setYear(2007);
	bigBang.setTrack("2번 track");
	bigBang.setComposer("G-DRAGON 작곡");
	
	bigBang.showinfo();
	
	Song busCer = new Song();
	
	busCer.setArtist("버스커버스커");
	busCer.setTitle("벚꽃엔딩");
	busCer.setAlbum("버스커버스커1집");
	busCer.setYear(2012);
	busCer.setTrack("4번 track");
	busCer.setComposer("장범준 작곡");
	
	busCer.showinfo();
	
	
	}

}
