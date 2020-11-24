package distantApp;

import java.util.HashMap;

public class NetworkManager {
	
	private HashMap<String, Integer> m_IP_Pseudo_Table;
	private Network_Sender m_sender;
	private Network_receiver m_receiver;
	
	
	public NetworkManager() {
		super();
		this.m_IP_Pseudo_Table = new HashMap<String, Integer>();
		this.m_sender = new Network_Sender();
		this.m_receiver = new Network_receiver();
	}
	 

	
}
