package intro.com.org;

public class Intro {
private String name;
private String address;
private String game;

public String getGame() {
	return game;
	
}
public void setGame(String game) {
	this.game=game;
}


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address=address;
}

public String getName() {
	return name;
	
}
public void setName(String name) {
	this.name=name;
}

public void displayinfo() {
	System.out.println("WELCOME BUDDY:"+name);
	System.out.println("ADDRESS:"+address);
	System.out.println("Game:"+game);
}
}
