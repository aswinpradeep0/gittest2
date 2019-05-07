import java.net.*;
import java.io.*;
class udpClient
{
	public static void main(String args[])throws Exception
	{
		String str="";
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientSocket=new DatagramSocket();
		InetAddress IPAddress=InetAddress.getByName("localhost");
		byte[] sendData=new byte[1024];
		byte[] receiveData=new byte[1024];
		while(!str.equals("stop"))
		{
			str=br.readLine();
			sendData=str.getBytes();
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,9876);
			clientSocket.send(sendPacket);
			DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
			clientSocket.receive(receivePacket);
			String str2=new String(receivePacket.getData());
			System.out.println("server says="+str2);
		}
		clientSocket.close();
	}
}
