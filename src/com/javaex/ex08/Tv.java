package com.javaex.ex08;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메스도 gs
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	//메소드 일반	
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	public void channel(int channel) {
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		}else if(channel<=0){
			this.channel = 0;
		}else if(channel>255) {
			this.channel = 255;
		}
		
	}
	public void channel(boolean plus) {
		if(plus==true && channel>=1 && channel<255) {
			this.channel++;
		}else if(plus==false && channel>=1 && channel<=255){
			this.channel--;
		}else {
			System.out.println("잘못된 채널입니다.");
		}
	}
	
	public void volume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume = volume;
		}else if(volume<0) {
			this.volume = 0;
		}else if(volume>100) {
			this.volume = 100;
		}
		
	}
	public void volume(boolean plus) {
		if(plus==true && volume>=0 && volume<100) {
			this.volume++;
		}else if(plus==false && volume>0 && volume<=100) {
			this.volume--;
		}else if(volume<0){
			this.volume = 0;
		}else if(volume>100) {
			this.volume = 100;
		}
	}
	
	
	public void power(boolean power) {
		if(power==true) {
			this.power = power;
			this.channel=channel;
			this.volume=volume;
		}else if(power==false  ){			
			System.out.println("전원이 꺼졌습니다.");
			this.power=power;	
		}
	}

	public void status() {
		System.out.println("채널: "+channel+", 음량: "+volume+", 전원: "+power);
	}

}
