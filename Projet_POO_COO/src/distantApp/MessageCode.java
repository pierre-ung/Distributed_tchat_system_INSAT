package distantApp;

import java.net.DatagramPacket;

// Contains macros for message -> action correspondence
public final class MessageCode {
	
	
	public static final String SEP = "#separator#"; //NOT A NUMBER OR CHAR
	
	//Discover codes
	public static final String NOTIFY_JOIN = "new";
	public static final String NOTIFY_REPLY = "reply";
	public static final String NOTIFY_LEAVE = "leave";
	
	//Change pseudo codes
	public static final String ASK_CHANGE_PSEUDO = "1";
	public static final String REPLY_CHANGE_PSEUDO = "2";
	public static final String NOTIFY_CHANGE_PSEUDO = "3";
	public static final String TELL_PSEUDO = "4";
	
	//Send private message codes
	public static final String PRIVATE_MESSAGE = "5";
	
	
	
}
